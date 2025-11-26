/**
 * @author R.Nauke
 */

public abstract class AForm {
  private final String name;
  private boolean signed;
  private final int signGrade;
  private final int execGrade;

  public AForm (String _name, int _sign, int _exec) {
    if (_sign > 150 || _exec > 150) {
      throw new AForm.GradeTooLowException();
    }
    if (_sign < 1 || _exec < 1) {
      throw new AForm.GradeTooHighException();
    }
    this.name = _name;
    this.signGrade = _sign;
    this.execGrade = _exec;
  }

  public String getName() {
    return this.name;
  }

  public boolean getSigned() {
    return this.signed;
  }

  public int getSignGrade() {
    return this.signGrade;
  }

  public int getExecGrade() {
    return this.execGrade;
  }

  public boolean beSigned(Bureaucrat b) {
    if (b.getGrade() > this.signGrade) {
      throw new AForm.GradeTooLowException("grade too low");
    }
    if (!signed) {
      signed = true;
      return true;
    }
    return false;
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