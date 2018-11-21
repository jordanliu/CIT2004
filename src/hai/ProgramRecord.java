package hai;

public class ProgramRecord {
    protected String code;
    protected String name;
    protected int courses;
    protected Award award;
    protected boolean accreditation;

    public ProgramRecord(String code, String name, int courses, Award award, boolean accreditation) {
        this.code = code;
        this.name = name;
        this.courses = courses;
        this.award = award;
        this.accreditation = accreditation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    public Award getAward() {
        return award;
    }

    public void setAward(Award award) {
        this.award = award;
    }

    public boolean isAccreditation() {
        return accreditation;
    }

    public void setAccreditation(boolean accreditation) {
        this.accreditation = accreditation;
    }
}
