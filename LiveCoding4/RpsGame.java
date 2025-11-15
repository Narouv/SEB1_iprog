/**
 * @author R.Nauke
 */

import java.util.Scanner;
import java.util.Arrays;

public class RpsGame {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Let's play a game!\nYour input: ");
    String input = s.nextLine();
    while (!validInput(input.toLowerCase())) {
      System.out.print("Input unknown, please repeat: ");
      input = s.nextLine();
    }
    String choice = getComputerChoice();
    int result = play(choice, input.toLowerCase());
    if (result == 0) {
      System.out.printf("\"%s\",\"%s\" : \"Draw!\"\n", choice, input.toLowerCase());
      return;
    }
    if (result == 1) {
      System.out.printf("\"%s\",\"%s\" : \"Player 1 won!\"\n", choice, input.toLowerCase());
      return;
    }
    if (result == 2) {
      System.out.printf("\"%s\",\"%s\" : \"Player 2 won!\"\n", choice, input.toLowerCase());
      return;
    }
  }

  public static boolean validInput(String s) {
    if (Arrays.asList("rock", "paper", "scissors").contains(s)) {
      return true;
    }
    return false;
  }

  public static String getComputerChoice() {
    double i = Math.random();
    if (i < 0.33) {
      return "rock";
    }
    else if (i < 0.66) {
      return "paper";
    }
    else {
      return "scissors";
    }
  }

  public static int getResult(String choice, String input) {
    if (choice.equals(input)) {
      return 0;
    }
    if ((choice.equals("rock") && input.equals("scissors"))
    || (choice.equals("paper") && input.equals("rock"))
    || (choice.equals("scissors") && input.equals("paper"))) {
      return 1;
    }
    return 2;
  }

  public static int play(String player1, String player2) {
    return getResult(player1, player2);
  }
}


void list_directories(int fd, Clients& req, Statuscodes& codes, DIR* dir)
{
  struct dirent* dent;
  std::string uri = req.getUri().substr(1);
  if (uri[uri.length() - 1] != '/')
      uri += "/";

  std::ostringstream directories;
  directories << "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n<title>Directory Listing</title>\n<body>\n<body>\n";
  directories << "<h1>Directory Listing: " << uri << "</h1>\n<body>\n</html>\n";
  while ((dent = readdir(dir)) != NULL) {
    if (std::string(dent->d_name) != "." && std::string(dent->d_name) != "..") {
      std::string link = dent->d_name;
      if (dent->d_type == DT_DIR)
          link += "/";
      directories << "<a href=\"" << link << "\">" << dent->d_name << "</a><br>";
    }
  }
  std::string dir_str = directories.str();
  std::string msg = check_and_add_header(200, "text/html", ft_itos(dir_str.length()), codes, req) + dir_str;
  if (send(fd, msg.c_str(), msg.size(), 0) < 0)
    req.setConStatus(CLOSE);
  closedir(dir);
}
