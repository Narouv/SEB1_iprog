/**
 * @author R.Nauke
 */
public class Student
{
    private String name;
    private String firstName;
    private int studentId;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;
    // void main(String[] args)
    // {    }
    public void setName(String value)
    {
        this.name = value;
    }
    public void setFirstName(String value)
    {
        this.firstName = value;
    }
    public void setStudentId(int value)
    {
        this.studentId = value;
    }
    public void setAge(int value)
    {
        this.age = value;
    }
    public void setAddress(String value)
    {
        this.address = value;
    }
    public void setPhoneNumber(String value)
    {
        this.phoneNumber = value;
    }
    public void setemail(String value)
    {
        this.email = value;
    }

    public String getName()
    {
        return this.name;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public int getstudentId()
    {
        return this.studentId;
    }
    public int getage()
    {
        return this.age;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public String getemail()
    {
        return this.email;
    }

    public Student(String name, String firstname, int studentid)
    {
        this.name = name;
        this.firstName = firstname;
        this.studentId = studentid;
    }
}