public class Student
{
    String Name;
    String FirstName;
    String StudentId;

    void Sleep()
    {
        System.out.println(Name + " zzzzZZZZzzzzz");
    }

    void Talk(String say)
    {
        System.out.println(say);
    }

    void SayHello()
    {
        System.out.println(Name + " sagt Hello!");
    }

    void SaySomething(String message, Student s)
    {
        s.SayHello();
        this.Talk(message);
    }

    public Student(String name, String firstname, String studentid)
    {
        this.Name = name;
        this.FirstName = firstname;
        this.StudentId = studentid;
    }
}