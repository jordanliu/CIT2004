package hai;

public class Diploma extends Program{
    String courseName;
    String awardName;

    public Diploma (){

        courseName = "Psychology";
        awardName = "Diploma in Psychology";
    }

    public Diploma (String courseName, String diplomaName){

        super(courseName,diplomaName);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getAwardName() {
        return awardName;
    }
}
