/**
 * @author R.Nauke
 */
public class Course {
  Student[] students;

  String name;

  public void addStudents(Student[] studs) {
    int i = 0;
    while (i < studs.length) {
      students[i] = studs[i];
      i++;
    }
    printStudentNames();
  }
  
  public void printStudentNames() {
    int i = 0;
    while (students.length > i) {
      System.out.println(students[i].getName());
      i++;
    }
  }

  public String getName() {
    return this.name;
  }
  
  public Course(String name) {
    this.name = name;
    this.students = new Student[10];
  }
}
