import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class User_DAO {
    public static boolean isExist;
    public static int PhoneNumber;
    public static ArrayList<User> users = new ArrayList<User>();

    public static boolean isValid(User user){
        return isExist;                                 // to be changed
    }

    public static String FindNumber(User user){
        for(User u : users){
            if(user.getEmail() == u.getEmail())
                return u.getPhoneNumber();
        }
        return "";
    }

    public static void insertUser(User user){
        users.add(user);
    }

    public static void updateUser(User user){

        User newOne = user;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your new first name : ");
        newOne.setFirstName(sc.next());
        System.out.println("Enter your new second name : ");
        newOne.setSecondName(sc.next());
        System.out.println("Enter your new Email : ");
        while (true){
            String s = sc.next();
            boolean found = false;
            for(User u : users){                                        // to detect if this Email is exist or not
                if(u.getEmail().equals(s))found = true;
            }
            if(found){
                System.out.println("This Email is already exist , please another one again : ");
                continue;
            }
            newOne.setEmail(s);
            break;
        }
        System.out.println("Enter your new Password : ");
        newOne.setPassword(sc.next());
        System.out.println("Enter your new Age : ");
        while (true){
            String s = sc.next();
            if(!User_ServiceClass.isGoodInteger(s)){
                System.out.println("Age should only contain [0-9] , please enter it again : ");
                continue;
            }
            newOne.setAge(Integer.parseInt(s));
            break;
        }
        System.out.println("Enter your new PhoneNumber : ");
        while (true){
            String s = sc.next();
            if(!User_ServiceClass.isGoodInteger(s)){
                System.out.println("PhoneNumber should only contain [0-9] , please enter it again : ");
                continue;
            }
            newOne.setPhoneNumber(s);
            break;
        }
        System.out.println("Updated......DONE");
        user = newOne; // updated
    }

    public static void deleteUser(User user){
        users.remove(user);
    }
}
