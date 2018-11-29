package hai;

public class Certificate extends Program {
    String courseName;
    String awardName;


    public Certificate (){

        courseName = "English";
        awardName = "Certificate in English Language";
    }

    public Certificate(String courseName, String degreeName){
        super(courseName, degreeName);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAwardName() {
        return awardName;
    }
}
