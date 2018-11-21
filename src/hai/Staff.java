package hai;

public class Staff {
    private String faculty;
    private String department;
    private Date dateEmployed;

    //add default constructor

    public Staff(String faculty, String department, Date dateEmployed) {
        this.faculty = faculty;
        this.department = department;
        this.dateEmployed = dateEmployed;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDateEmployed() {
        return dateEmployed;
    }

    public void setDateEmployed(Date dateEmployed) {
        this.dateEmployed = dateEmployed;
    }

    public void display(){

    }
}
