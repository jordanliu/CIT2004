package hai;

public class Associates extends Program{
    String courseName;
    String awardName;

    public Associates (){

        courseName = " Maths ";
        awardName = " Maths Associates degree";
    }

    public Associates(String courseName, String degreeName){
        super(courseName, degreeName);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAwardName() {
        return awardName;
    }
}
