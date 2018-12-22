public class User {
    private static String FirstName , SecondName , Email , password , PhoneNumber;
    private static int Age;

    public static void setFirstName(String x){
        FirstName = x;
    }

    public static void setSecondName(String x){
        SecondName = x;
    }

    public static void setEmail(String email) {
        Email = email;
    }

    public static void setAge(int age) {
        Age = age;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public static String getFirstName(){
        return FirstName;
    }

    public static String getSecondName() {
        return SecondName;
    }

    public static String getEmail() {
        return Email;
    }

    public static String getPassword() {
        return password;
    }
    public static int getAge() {
        return Age;
    }

    public static String getPhoneNumber() {
        return PhoneNumber;
    }
}
