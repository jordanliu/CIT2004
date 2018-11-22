package hai;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Student extends User {
    private String address;
    private String contact;
    private String dateEnrolled;

    public Student() {
        super();
        address = "";
        contact = "";
        dateEnrolled = "";

    }

    public Student(int id, String username, String password, String firstName, String lastName, String address, String contact, String dateEnrolled) {
        super(id, username, password, firstName, lastName);
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

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return super.toString() + "Address : "
                + address + "\n" + "Contact: " + contact + "\n" + "Date Enrolled: " + dateEnrolled + "\n";
    }

}
