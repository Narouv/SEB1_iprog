/**
 * @author R.Nauke
 */

public class Bureaucrat {
  private final String name;
  private int grade;

  public Bureaucrat(String _name, int _grade) {
    if (_grade > 150)
      throw new GradeTooLowException();
    if (_grade < 1)
      throw new GradeTooHighException();
    
    this.name = _name;
    this.grade = _grade;
  }

  public String getName() {
    return this.name;
  }

  public int getGrade() {
    return this.grade;
  }

  public void incrementGrade() {
    if (grade > 1) {
      grade--;
    }
    else {
      throw new GradeTooHighException();
    }
  }

  public void decrementGrade() {
    if (grade < 150) {
      grade++;
    }
    else {
      throw new GradeTooLowException();
    }
  }

  public void signForm(AForm f) {
    try {
      if (f.beSigned(this)) {
        System.out.println(this.name + " signed " + f.getName());
      }
      else {
        System.out.println(this.name + " tried to sign " + f.getName() + " but failed because it was already signed");
      }

    }
    catch (Exception e) {
      System.out.println(this.name + " tried to sign " + f.getName() + " but failed because " + e.getMessage());
    }
  }

  class GradeTooHighException extends RuntimeException {
    public GradeTooHighException() {
      super("The grade can not be higher than 1");
    }
    public GradeTooHighException(String msg) {
      super(msg);
    }
  }

  class GradeTooLowException extends RuntimeException {
    public GradeTooLowException() {
      super("The grade can not be lower than 150");
    }
    public GradeTooLowException(String msg) {
      super(msg);
    }
  }
}