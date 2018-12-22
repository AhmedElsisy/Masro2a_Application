
public class Main {

    public static void main(String[] args) {


        //      This for Testing only
        User_DAO dao = new User_DAO();
        User_ServiceClass serviceClass = new User_ServiceClass();

        User x = new User();
        x.setEmail("ahmedelsisy44@gmail.com");
        x.setPassword("123456");
        x.setFirstName("sisyyyyyy");

        dao.insertUser(x);

        User mine = new User();
        mine.setEmail("ahmedelsisy44@gmail.com");
        mine.setPassword("123456");
        serviceClass.user = mine;
        if(serviceClass.SignIn()){
            System.out.println("Welcome " + mine.getFirstName());
        }
        else System.out.println("ERROR");

        dao.updateUser(mine);


    }
}
