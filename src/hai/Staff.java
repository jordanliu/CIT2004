package hai;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
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

    public boolean validate(String $username, String $password){
        int found = 0;
        try{
            Scanner sInFile = new Scanner(new File("staff.txt"));
            while(sInFile.hasNext()){
                id = sInFile.nextInt();
                username = sInFile.next();
                password = sInFile.next();
                firstName = sInFile.next();
                lastName = sInFile.next();
                faculty = sInFile.next();
                department = sInFile.next();
                dateEmployed = sInFile.next();
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
