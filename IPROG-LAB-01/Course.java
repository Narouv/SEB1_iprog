/**
 * @author R.Nauke
 */
public class Course
{
    Student s1;
    Student s2;
    Student s3;
    Student s4;
    Student s5;
    Student s6;
    Student s7;
    Student s8;
    Student s9;
    Student s10;

    String name;

    public void addStudents(Student stud1, Student stud2, Student stud3, Student stud4,Student stud5,Student stud6, Student stud7, Student stud8, Student stud9, Student stud10)
    {
        this.s1 = stud1;
        this.s2 = stud2;
        this.s3 = stud3;
        this.s4 = stud4;
        this.s5 = stud5;
        this.s6 = stud6;
        this.s7 = stud7;
        this.s8 = stud8;
        this.s9 = stud9;
        this.s10 = stud10;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public Course(String name)
    {
        this.name = name;
    }
}