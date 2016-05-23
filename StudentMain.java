package CStudent;

/**
 * Created by s160949 on 4/5/2016.
 */
import java.util.Arrays;

public class StudentMain {

    public static void main(String[] args)
    {
        Student anton = new Student("AP Computer Science,AP Capstone,Junior English", "Anton", "Monaghan");

        System.out.println(anton.getFullName() + " takes: " + anton.makeList());
        System.out.println(anton.getFirstName() + " is a CompSciLad: " + anton.isCompSciLad());
        System.out.println(anton.getFirstName() + " takes AP courses: " + anton.takesAPCourses());
        System.out.println(anton.getFirstName() + " takes these AP courses: " + anton.takesTheseAPCourses() + "\n");


        System.out.println("I know how to make a 2D Array: ");
        for (int i = 0; i < anton.make2DArray().length; i++)
        {
            System.out.println(Arrays.toString(anton.make2DArray()[i]));
        }


        GoodStudent billy = new GoodStudent("Math,Science,History,AP CS", "Billy", "Sausage", false, 4.0);

        System.out.println("\n" + billy.getFullName() + " takes: " + billy.makeList());
        System.out.println(billy.getFirstName() + " is a CompSciLad: " + billy.isCompSciLad());
        System.out.println(billy.getFirstName() + " takes AP courses: " + billy.takesAPCourses());
        System.out.println(billy.getFirstName() + " has good grades: " + billy.hasGoodGrades());
        System.out.println(billy.getFirstName() + " is delusional about his grades: " + billy.isDelusional() + "\n");


        Student olivier = new GoodStudent("Regular Chemistry, Lower Level Math, Intro to For Loops, Talking to Chicks 101",
                "Olivier", "Gabison",true, 1.6);

        System.out.println(olivier.getFullName() + " takes: " + olivier.makeList());
        System.out.println(olivier.getFirstName() + " is a CompSciLad: " + olivier.isCompSciLad());
        System.out.println(olivier.getFirstName() + " takes AP courses: " + olivier.takesAPCourses() + "\n");
        
        Student genericStudent = new Student();

        System.out.println(genericStudent.getFullName() + " takes: " + genericStudent.makeList());
        System.out.println(genericStudent.getFirstName() + " is a CompSciLad: " + genericStudent.isCompSciLad());
        System.out.println(genericStudent.getFirstName() + " takes AP courses: " + genericStudent.takesAPCourses());








    }
}
