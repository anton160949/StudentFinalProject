package CStudent;

/**
 * Created by s160949 on 4/5/2016.
 */
import java.util.ArrayList;

public interface StudentDetails {

    String changeName(String correctFirstName);

    ArrayList<String> makeList();

    String getFirstName();

    String getLastName();

    String getFullName();

    boolean isCompSciLad();

    boolean takesAPCourses();

    int[][] make2DArray();


}
