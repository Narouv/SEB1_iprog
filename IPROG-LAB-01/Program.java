/**
 * @author R.Nauke
 */
public class Program
{

    public static void main(String[] args)
    {
        Student s1 = new Student("Doe", "John", 12345);
        Student s2 = new Student("Doe", "Jane", 23456);
        Student s3 = new Student("John", "Doe", 22222);
        Student s4 = new Student("Jane", "Doe", 33333);
        Student s5 = new Student("Doe", "Doe", 44444);
        Student s6 = new Student("John", "John", 55555);
        Student s7 = new Student("Jane", "Jane", 66666);
        Student s8 = new Student("John", "Wick", 77777);
        Student s9 = new Student("Wick", "Wick", 88888);
        Student s10 = new Student("Wick", "John", 11111);
        Course course = new Course("iprog");
        // System.out.println(course.getName());
        course.addStudents(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
    }
}