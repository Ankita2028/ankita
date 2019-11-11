package main;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private int date;
    private String month;
    private int year;
    private int rollNumber;
    private String rollPassword;

    public User(String firstName, String lastName, String password, int date, String month, int year, int rollNumber, String rollPassword) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.password=password;
        this.date=date;
        this.month=month;
        this.year=year;
        this.rollNumber=rollNumber;
        this.rollPassword=rollPassword;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPassword(){
        return password;
    }
    public int getDate(){
        return date;
    }
    public String getMonth() {
        return month;
    }
    public int getYear(){
        return year;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public String getRollPassword(){
        return rollPassword;
    }
    void setFirstName(String firstName){
        this.firstName=firstName;
    }
    void setLastName(String lastName){
        this.lastName=lastName;
    }
    void setPassword(String password){
        this.password=password;
    }
    void setDate(int date){
        this.date=date;
    }
    void setMonth(String month){
        this.month=month;
    }
    void setYear(int year){
        this.year=year;
    }
    void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }
    void setRollPassword(String rollPassword){
        this.rollPassword=rollPassword;
    }
    @Override
    public String toString(){
        return firstName+"\n"+lastName+"\n"+password+"\n"+date+"-"+month+"-"+year+"\n"+rollNumber+"\n"+rollPassword;
    }

}
