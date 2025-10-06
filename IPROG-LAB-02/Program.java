/**
 * @author R.Nauke
 */
public class Program {
  public static void main(String[] args) {
    Student[] students = new Student[10];
    int i = 0;
    while (i < 10)
    {
      students[i] = new Student("Student#" + i, "name" + i, 100000 + i);
      i++;
    }
    Course course = new Course("iprog");
    // System.out.println(course.getName());
    course.addStudents(students);
    students[1].setName("fortnite");
    System.out.println(" ");
    course.printStudentNames();

    // Student s1 = new Student("Doe", "John", 123456);
    // Student s2 = new Student("Doe", "John", 234567);
    // if (s1.hasSameName(s2)) {
    //   System.out.println("Students " + s1.getFirstName() + " " +
    //   s1.getName() + " and " + s2.getFirstName() + " " + s2.getName() +
    //   " have the same name.");
    // }
    // if (!s1.hasSameName(s2)) {
    //   System.out.println("Students " + s1.getFirstName() + " " +
    //   s1.getName() +
    //   " and " + s2.getFirstName() + " " + s2.getName() +
    //   " have NOT the same name.");
    // }
    Student s1 = new Student("Doe", "John", 123456);
    Student s2 = new Student("Doe", "John", 234567);
    if (Student.haveSameNames(s1, s2)) {
      System.out.println("Students " + s1.getFirstName() + " " +
      s1.getName() + " and " + s2.getFirstName() + " " + s2.getName() +
      " have the same name.");
    }
    if (!Student.haveSameNames(s1, s2)) {
      System.out.println("Students " + s1.getFirstName() + " " +
      s1.getName() +
      " and " + s2.getFirstName() + " " + s2.getName() +
      " have NOT the same name.");
    }
  }
}