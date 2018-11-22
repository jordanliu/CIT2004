package hai;

import java.io.*;
import java.util.Scanner;

public class Staff extends User{
    private String faculty;
    private String department;
    private String dateEmployed;

    public Staff(){
        super();
        faculty = "";
        department = "";
        dateEmployed = "";
    }

    public Staff(int id, String username, String password, String firstName, String lastName, String faculty, String department, String dateEmployed) {
        super(id, username, password, firstName, lastName);
        this.faculty = faculty;
        this.department = department;
        this.dateEmployed = dateEmployed;
    }

    public Staff(Staff obj){
        super(obj);
        faculty = obj.faculty;
        department = obj.department;
        dateEmployed = obj.dateEmployed;
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

    public String getDateEmployed() {
        return dateEmployed;
    }

    public void setDateEmployed(String dateEmployed) {
        this.dateEmployed = dateEmployed;
    }

    public void display(){
        System.out.println(this);
    }

    public String toString() {
        return  super.toString() + "Faculty : "
                + faculty + "\n" + "Department: " + department + "\n" + "Date Employed: " + dateEmployed +  "\n";
    }

    public void store(){
       try{
           FileWriter file = new FileWriter("staff.txt", true);
           Staff staff = new Staff();
           String record = id + "\n"  + username +  "\n"  + password + "\n" + firstName + "\n" + lastName +
                   "\n" + faculty + "\n" + department + "\n" + dateEmployed;
           file.write(record);
           file.close();
       } catch (IOException e){
            e.printStackTrace();
       }
    }

    public void retrieve(){
        try{
            Scanner sInFile = new Scanner(new File("staff.txt"));
            int id;
            while(sInFile.hasNext()){
                id = sInFile.nextInt();
                username = sInFile.next();
                password = sInFile.next();
                firstName = sInFile.next();
                lastName = sInFile.next();
                faculty = sInFile.next();
                department = sInFile.next();
                dateEmployed = sInFile.next();
                Staff rec = new Staff(id, username, password, firstName, lastName, faculty, department, dateEmployed);
                System.out.println(rec);
            }
            sInFile.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
