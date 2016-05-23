package CStudent;

/**
 * Created by s160949 on 4/5/2016.
 */
import java.util.ArrayList;

public class Student implements StudentDetails {

    private String firstName;
    private String lastName;
    private String theClasses;

    public Student(String c, String fN, String lN) {
        theClasses = c;
        firstName = fN;
        lastName = lN;
    }

    public Student()
    {
        theClasses = "Math, Science, History";
        firstName = "John";
        lastName = "Citizen";
    }

    public ArrayList<String> makeList()     // makes list of classes student takes
    {

        ArrayList<String> classList = new ArrayList<String>();
        int startPos = 0;
        int endPos = 0;
        String separate = ",";

        for (int i = theClasses.indexOf(separate); i >= 0; i = theClasses.indexOf(separate, i + 1))
        {
            classList.add(theClasses.substring(startPos, i));
            startPos = i + 1;

        }


        String lastClass = "";
        lastClass += theClasses.substring(theClasses.lastIndexOf(',') + 1, theClasses.length() -1 );
        lastClass += theClasses.charAt(theClasses.length() - 1);

        classList.add(lastClass);


        return classList;
    }

    public String changeName(String correctFirstName)   // Gives you the satisfaction of correcting spelling errors
    {
        String newName = correctFirstName;              // but does not actually do anything apart from telling you
        return "Your correct name is: " + newName;      // what your correct name is
    }

    public String getFirstName()
    {
        return firstName;
    }   // Next 3 methods are self explanatory

    public String getLastName()
    {
        return lastName;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public boolean isCompSciLad()   // If you take CompSci, you're a lad. This method checks if you take CompSci.
    {
        ArrayList<String> newList = makeList();
        for (int i = 0; i < newList.size(); i++)
        {
            if (newList.get(i).equals("AP Computer Science") || newList.get(i).equals("CS") ||
                    newList.get(i).equals("AP Computer Science") || newList.get(i).equals("AP CS"))
            {
                return true;
            }
        }

        return false;
    }

    public boolean takesAPCourses()     // Checks if you take AP courses
    {
        ArrayList<String> newList = makeList();
        for (int i = 0; i < newList.size(); i++)
        {
            for (int j = 0; j < newList.get(i).length(); j++)
            {
                if (newList.get(i).indexOf("AP") != -1)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public String takesTheseAPCourses()     // Checks if student has taken AP Courses, and returns a String
    {                                       // of these courses if it equals true
        String stringOfAPClasses = "";
        String finalClasses = "";
        if (takesAPCourses() == false)
        {
            return "does not take AP courses";
        }
        if (takesAPCourses() == true)
        {
            for (int i = 0; i < makeList().size(); i++)
            {
                if (makeList().get(i).indexOf("AP") != -1)
                {
                    stringOfAPClasses += makeList().get(i) + ", ";
                }
            }

            finalClasses += stringOfAPClasses.substring(0, stringOfAPClasses.length() - 2) + ".";

        }



        return finalClasses;
    }

    public int[][] make2DArray()    // Makes a random 2D Array of increasing integers starting from 1
    {
        int[][] randomArrayToShowUnderstanding = new int[5][5];
        for (int i = 0; i < randomArrayToShowUnderstanding.length; i++)
        {
            for (int j = 0; j < randomArrayToShowUnderstanding[i].length; j++)
            {
                randomArrayToShowUnderstanding[i][j] = (5*i) + (j+1);
            }
        }

        return randomArrayToShowUnderstanding;
    }


}
