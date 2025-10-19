/**
 * @author R.Nauke
 */
public class Student
{
  private String name;
  private String firstName;
  private String studentId;
  private int age;
  private String address;
  private String phoneNumber;
  private String email;
  // void main(String[] args)
  // {    }
  public void setName(String value) {
    this.name = value;
  }
  public void setFirstName(String value) {
    this.firstName = value;
  }
  public void setStudentId(int value) {
    this.studentId = this.calculateChecksum(value);
  }
  public void setAge(int value) {
    this.age = value;
  }
  public void setAddress(String value) {
    this.address = value;
  }
  public void setPhoneNumber(String value) {
    this.phoneNumber = value;
  }
  public void setEmail(String value) {
    this.email = value;
  }

  public String getName() {
    return this.name;
  }
  public String getFirstName() {
    return this.firstName;
  }
  public String getStudentId() {
    return this.studentId;
  }
  public int getAge() {
    return this.age;
  }
  public String getAddress() {
    return this.address;
  }
  public String getPhoneNumber() {
    return this.phoneNumber;
  }
  public String getEmail() {
    return this.email;
  }

  public boolean hasSameName(Student stud) {
    if (this.name.equals(stud.getName()) && this.firstName.equals(stud.getFirstName())) {
      return true;
    }
    return false;
  }

  public static boolean haveSameNames(Student s1, Student s2) {
    return s1.hasSameName(s2);
  }

  private String calculateChecksum(int sid) {
    int sum = 0;
    String og = Integer.toString(sid);
    while (sid > 0) {
      sum += sid % 10;
      sid /= 10;
    }
    if (sum < 10) {
      og += "0";
    }
    return og + Integer.toString(sum);
  }

  // private String calculateChecksum(int sid) {
  //   String str = Integer.toString(sid);
  //   int i = 0;
  //   int sum = 0;
  //   while (i < 6) {
  //     sum += Integer.parseInt(""+str.charAt(i));
  //     i++;
  //   }
  //   if (sum < 10) {
  //     return str + "0" + sum;
  //   }
  //   return str + sum;
  // }

  public Student(String name, String firstname, int studentid) {
    this.name = name;
    this.firstName = firstname;
    this.studentId = calculateChecksum(studentid);
    // System.out.println(this.studentId);
  }
}