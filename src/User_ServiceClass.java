import java.util.ArrayList;
import java.util.Scanner;

public class User_ServiceClass {

    public static User user = new User();

    public static boolean isGoodInteger(String s){
        for(int i = 0 ; i < s.length() ; ++i){
            if(!Character.isDigit(s.charAt(i)))return false;
        }
        return true;
    }

    public static boolean SignIn(){

        for(User x : User_DAO.users){

            if(x.getEmail() .equals(user.getEmail() ) && x.getPassword().equals(user.getPassword()) ){

                user.setFirstName(x.getFirstName());
                user.setSecondName(x.getSecondName());
                user.setPhoneNumber(x.getPhoneNumber());
                user.setAge(x.getAge());


                return true;
            }
        }
        return false;
    }

    public static boolean SignUp(){
        User_DAO dao = new User_DAO();
        User newOne = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        newOne.setFirstName(sc.next());
        System.out.println("Enter your second name : ");
        newOne.setSecondName(sc.next());
        System.out.println("Enter your Email : ");
        while (true){
            String s = sc.next();
            boolean found = false;
            for(User u : dao.users){                                        // to detect if this Email is exist or not
                if(u.getEmail().equals(s))found = true;
            }
            if(found){
                System.out.println("This Email is already exist , please another one again : ");
                continue;
            }
            newOne.setEmail(s);
            break;
        }
        System.out.println("Enter your Password : ");
        newOne.setPassword(sc.next());
        System.out.println("Enter your Age : ");
        while (true){
            String s = sc.next();
            if(!isGoodInteger(s)){
                System.out.println("Age should only contain [0-9] , please enter it again : ");
                continue;
            }
            newOne.setAge(Integer.parseInt(s));
            break;
        }
        System.out.println("Enter your PhoneNumber : ");

        while (true){
            String s = sc.next();
            if(!isGoodInteger(s)){
                System.out.println("PhoneNumber should only contain [0-9] , please enter it again : ");
                continue;
            }
            newOne.setPhoneNumber(s);
            break;
        }

        System.out.println("Signed Up......Congratulations");
        user = newOne;
        dao.users.add(user);
        return true;
    }
}
