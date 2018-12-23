import java.net.PasswordAuthentication;

public class User {
    private  String FirstName , SecondName , Email , password , PhoneNumber;
    private  int Age ;

    User(){
        FirstName = new String();
        SecondName = new String();
        Email = new String();
        password = new String();
        PhoneNumber = new String();
        Age = 0;

    }
    User(User d){
        FirstName = d.getFirstName();
        SecondName = d.getSecondName();
        Email = d.getEmail();
        password = d.getPassword();
        PhoneNumber = d.getPhoneNumber();
        Age = d.getAge();
    }

    public  void setFirstName(String x){
        FirstName = x;
    }

    public  void setSecondName(String x){
        SecondName = x;
    }

    public  void setEmail(String email) {
        Email = email;
    }

    public  void setAge(int age) {
        Age = age;
    }

    public  void setPassword(String passwordx) {
        password = passwordx;
    }

    public  void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public  String getFirstName(){
        return FirstName;
    }

    public  String getSecondName() {
        return SecondName;
    }

    public  String getEmail() {
        return Email;
    }

    public  String getPassword() {
        return password;
    }
    public  int getAge() {
        return Age;
    }

    public  String getPhoneNumber() {
        return PhoneNumber;
    }
}
