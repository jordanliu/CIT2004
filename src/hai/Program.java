package hai;

public abstract class Program {

    protected String courseName;
    protected String awardName;

    public Program() {

        courseName = " ";
        awardName = " ";
    }

    public Program(String courseName, String awardName) {

        this.awardName = awardName;
        this.courseName = courseName;
    }

    public abstract String getCourseName();


    public abstract String getAwardName();

}


