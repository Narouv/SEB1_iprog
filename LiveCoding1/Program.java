/*
    @author R. Nauke
*/
public class Program
{
    public static void main(String[] args)
    {
        Student[] studs = new Student[3];
        
        for (int i = 0; i < 3; i++)
        {
            studs[i] = new Student("stud", "ent", "0123456789");
            studs[i].Sleep();
            studs[i].Name += "L" + i;
        }
        for (int i = 0; i < 3; i++)
        {
            studs[i].SaySomething("hallo zurück" + i, studs[(i+1)%3]);
        }

    }
}