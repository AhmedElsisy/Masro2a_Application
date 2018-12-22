import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User_DAO user_dao = new User_DAO() ;
        User_ServiceClass user_serviceClass = new User_ServiceClass();
        Item_DAO item_dao = new Item_DAO() ;
        Item_ServiceClass item_serviceClasser = new Item_ServiceClass();
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("1 for Sign in , 2 for Sign up");
            int choice;
            System.out.print("Choice :");
            choice = in.nextInt();
            System.out.println();
            if (choice == 1){
                //clearScreen();
                System.out.println("Sign in");
                System.out.println();
                System.out.print("Email :");
                String tempo = in .nextLine();
                String E = in.nextLine();
                System.out.println();
                System.out.print("Password :");
                String P = in.nextLine();
                //User user = new User();
                System.out.println(E + " "+ P);
                user_serviceClass.user.setEmail(E);
                user_serviceClass.user.setPassword(P);
                for(User x : User_DAO.users) {
                    System.out.println("KOL MARA " + x.getEmail() + " " + x.getPassword());
                }
                System.out.println(user_serviceClass.user.getEmail()+user_serviceClass.user.getPassword());

                boolean LOGIN = user_serviceClass.SignIn();
                if (!LOGIN){
                    System.out.println("Sorry, User not found");
                    int timer = 100;
                    int j = 0;
                    while (j<timer){
                        j++;
                    }
                    //clearScreen();
                }

            }
            else if (choice == 2){


                user_serviceClass.SignUp();

                System.out.println();




            }




        }
    }
}
