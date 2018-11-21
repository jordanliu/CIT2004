package hai;

public class CourseRecord {
    private String code;
    private String name;
    private String description;
    private int credits;
    private float duration;

    public CourseRecord(String code, String name, String description, int credits, float duration) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.duration = duration;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
