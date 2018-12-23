import java.util.Scanner;

public class Main {
    static User_DAO user_dao = new User_DAO() ;
    static User_ServiceClass user_serviceClass = new User_ServiceClass();
    static Item_DAO item_dao = new Item_DAO() ;
    static Item_ServiceClass item_serviceClasser = new Item_ServiceClass();
    static Scanner  in = new Scanner(System.in);

    public static void main(String[] args) {



        while (true){
            System.out.println("1 for Sign in , 2 for Sign up");
            int choice;
            System.out.print("Choice :");
            choice = in.nextInt();
            System.out.println();
            User admin = new User();
            admin.setEmail("ahmedshaban");
            admin.setPassword("12345");
            User_DAO.insertUser(admin);
            if (choice == 1){


                SIGNIN();

                boolean LOGIN = user_serviceClass.SignIn();
                if (!LOGIN){
                    System.out.println("Sorry, User not found");

                }
                else{

                    showMenu();
                }

            }
            else if (choice == 2){


                user_serviceClass.SignUp();

                System.out.println();
                System.out.println("\n \n");



            }
            else{
                System.out.println("Invalid Choice\n\n");

            }




        }
    }

    static void SIGNIN(){
        System.out.println("Sign in");
        System.out.println();
        System.out.print("Email :");
        String tempo = in .nextLine();
        String E = in.nextLine();
        System.out.println();
        System.out.print("Password :");
        String P = in.nextLine();
        //User user = new User();

        user_serviceClass.user = new User();
        user_serviceClass.user.setEmail(E);
        user_serviceClass.user.setPassword(P);

    }

    static void showMenu(){
        while (true){

            System.out.println("Menu: \n\n");
            System.out.println("1 - upload an item");
            System.out.println("2 - Search\n");
            System.out.println("3 - Log out");
            System.out.print("Choice: ");
            int xy = in.nextInt();
            if (xy == 1){
                Item_ServiceClass.Upload();
            }
            else if (xy == 2){

                Item_ServiceClass.Search();

            }
            else if (xy == 3){
                return;
            }
        }


    }
}
