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
    private boolean takenTest;


    public Student() {
        super();
        address = "";
        contact = "";
        dateEnrolled = "";
        takenTest = false;

    }

    public Student(int id, String username, String password, String firstName, String lastName, String address, String contact, String dateEnrolled, boolean takenTest) {
        super(id, username, password, firstName, lastName);
        this.address = address;
        this.contact = contact;
        this.dateEnrolled = dateEnrolled;
        this.takenTest = takenTest;
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

    public boolean isTakenTest() {
        return takenTest;
    }

    public void setTakenTest(boolean takenTest) {
        this.takenTest = takenTest;
    }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return super.toString() + "Address : "
                + address + "\n" + "Contact: " + contact + "\n" + "Date Enrolled: " + dateEnrolled + "\n" + "Taken test: " + takenTest + "\n";
    }

    public void store(){
        try{
            FileWriter file = new FileWriter("student.txt", true);
            Staff staff = new Staff();
            String record = "\n" + "\n" + id + "\n"  + username +  "\n"  + password + "\n" + firstName + "\n" + lastName +
                    "\n" + address + "\n" + contact + "\n" + dateEnrolled + "\n" + takenTest ;
            file.write(record);
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public boolean validate(String $username, String $password){
        int found = 0;
        try{
            Scanner scanner = new Scanner(new File("student.txt"));
            while(scanner.hasNext()){
                id = scanner.nextInt();
                username = scanner.next();
                password = scanner.next();
                firstName = scanner.next();
                lastName = scanner.next();
                address = scanner.next();
                contact = scanner.next();
                dateEnrolled = scanner.next();
                takenTest = scanner.nextBoolean();
                if($username.equals(username)){
                    found = 1;
                    //System.out.println("validate method:" + username);
                    break;
                }
            }
            scanner.close();
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
            Scanner scanner = new Scanner(new File("student.txt"));
            int id;
            while(scanner.hasNext()){
                id = scanner.nextInt();
                username = scanner.next();
                password = scanner.next();
                firstName = scanner.next();
                lastName = scanner.next();
                address = scanner.next();
                contact = scanner.next();
                dateEnrolled = scanner.next();
                takenTest = scanner.nextBoolean();
                Student rec = new Student(id, username, password, firstName, lastName, address, contact, dateEnrolled, takenTest);
                System.out.println(rec);
            }
            scanner.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
