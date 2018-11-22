package hai;

import java.io.IOException;
import java.io.RandomAccessFile;

public class User {

    protected int id;
    protected String username;
    protected String password;
    protected String firstName;
    protected String lastName;

    public User(){
        id = 0;
        username = "";
        password = "";
        firstName = "";
        lastName = "";
    }

    public User(int id,String username, String password, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(User obj){
        id = obj.id;
        username = obj.username;
        password = obj.password;
        firstName = obj.firstName;
        lastName = obj.lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "ID: " + id + "\n" + "Username: " + username + "\n" + "Password: " + password + "\n" + "First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n";
    }

    public void display(){
        System.out.println(this);
    }

    public  void store(){

    }
    public  void retrieve(){

    }
}
