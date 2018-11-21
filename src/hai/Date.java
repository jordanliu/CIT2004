package hai;

public class Date {
    private String date;
    private String month;
    private String year;

    public Date(){
        date = "";
        month = "";
        year = "";
    }

    public Date(String date, String month, String year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void display(){

    }
}
