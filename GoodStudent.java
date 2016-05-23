package CStudent;



/**
 * Created by s160949 on 4/5/2016.
 */
public class GoodStudent  extends Student implements GoodStudentDetails  {

    private boolean goodGrades;
    private double GPA;

    public GoodStudent(String c, String fN, String lN, boolean gG, double gPA)
    {
        super(c, fN, lN);
        goodGrades = gG;
        GPA = gPA;
    }

    public boolean getGrades()
    {
        return goodGrades;
    }

    public double getGPA()
    {
        return GPA;
    }

    public boolean hasGoodGrades()  // 3.0 is just for this program, don't get offended
    {
        if (getGPA() > 3.0)
        {
            return true;
        }

        return false;
    }

    public boolean isDelusional()   // returns true if the student's view of his grades do not align with reality
    {
        if ((getGrades() == true && getGPA() < 3.0) || getGrades() == false && getGPA() > 3.0)
        {
            return true;
        }

        return false;
    }
}
