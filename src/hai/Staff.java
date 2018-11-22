package hai;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

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

    @Override
    public void store(String filename) {
        try {
            RandomAccessFile file = new RandomAccessFile(new File(filename), "rw");
            file.seek((id - 1) * getRecordSize());
            file.writeUTF(username);
            file.writeUTF(password);
            file.writeUTF(firstName);
            file.writeUTF(lastName);
            file.writeUTF(faculty);
            file.writeUTF(department);
            file.writeUTF(dateEmployed);
            file.close();
        } catch (IOException io) {
            System.err.println(io.getMessage());
        }
    }



    @Override
    public void retrieve(String filename, int id) {
        try {
            RandomAccessFile file = new RandomAccessFile(new File(filename),
                    "rw");
            file.seek((id - 1) * getRecordSize());
            this.id = file.readInt();
            username = file.readUTF();
            password = file.readUTF();
            firstName = file.readUTF();
            lastName = file.readUTF();
            faculty = file.readUTF();
            department = file.readUTF();
            dateEmployed = file.readUTF();
            file.close();
        } catch (IOException io) {
            System.err.println(io.getMessage());
        }
    }


    private long getRecordSize() {
        return (long) (4 + ((11 + 25 + 25 + 25 + 50) * 2));
    }

}
