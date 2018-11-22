package hai;

public class Student {
    private String address;
    private String contact;
    private Date dateEnrolled;

    public Student(){

    }

    public Student(String address, String contact, Date dateEnrolled) {
        this.address = address;
        this.contact = contact;
        this.dateEnrolled = dateEnrolled;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(Date dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public void display(){

    }
}
