package hai;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

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

    public void store(){
        try{
            FileWriter file = new FileWriter("student.txt", true);
            Staff staff = new Staff();
            String record = "\n" + "\n" + id + "\n"  + username +  "\n"  + password + "\n" + firstName + "\n" + lastName +
                    "\n" + address + "\n" + contact + "\n" + dateEnrolled;
            file.write(record);
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public boolean validate(String $username, String $password){
        int found = 0;
        try{
            Scanner sInFile = new Scanner(new File("student.txt"));
            while(sInFile.hasNext()){
                id = sInFile.nextInt();
                username = sInFile.next();
                password = sInFile.next();
                firstName = sInFile.next();
                lastName = sInFile.next();
                address = sInFile.next();
                contact = sInFile.next();
                dateEnrolled = sInFile.next();
                // System.out.println("validate method: " + username + " " + password);
                if($username.equals(username)){
                    found = 1;
                    //System.out.println("validate method:" + username);
                    break;
                }
            }
            sInFile.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        if (found == 1){
            return true;
        } else {
            return false;
        }
    }

    public void retrieve(){
        try{
            Scanner sInFile = new Scanner(new File("student.txt"));
            int id;
            while(sInFile.hasNext()){
                id = sInFile.nextInt();
                username = sInFile.next();
                password = sInFile.next();
                firstName = sInFile.next();
                lastName = sInFile.next();
                address = sInFile.next();
                contact = sInFile.next();
                dateEnrolled = sInFile.next();
                Staff rec = new Staff(id, username, password, firstName, lastName, address, contact, dateEnrolled);
                System.out.println(rec);
            }
            sInFile.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
