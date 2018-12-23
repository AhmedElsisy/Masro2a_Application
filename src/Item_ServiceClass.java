import java.time.chrono.MinguoChronology;
import java.util.Vector;

public class Item_ServiceClass {
    private static Item item;

    public static void Upload(){
        String k;
        Item newItem = new Item();
        System.out.println("Name :");
        k = Main.in.nextLine();
        k = Main.in.nextLine();
        newItem.setName(k);
        //k=Main.in.nextLine();
        System.out.println("Description :");
        k = Main.in.nextLine();
        newItem.setInfo(k);
        while (true){
            System.out.println("Select Category");
            System.out.println("1 - National IDs");
            System.out.println("2 - Mobiles and Electronics");
            System.out.println("3 - others");

            int choicee = Main.in.nextInt();

            if (choicee == 1){

                newItem.SetCat("National IDs");
                newItem.setHasID(true);
                System.out.println("Please enter Primary Key (like serial number)");
                k = Main.in.next();
                newItem.setSerial(k);
                break;

            }
            else if (choicee == 2){
                newItem.SetCat("Electronics");
                newItem.setHasID(true);
                System.out.println("Please enter Primary Key (like serial number)");
                k = Main.in.next();
                newItem.setSerial(k);
                break;

            }
            else if (choicee == 3){
                newItem.SetCat("Others");
                newItem.setHasID(false);
                break;
            }
            else {

                System.out.println("Invalid Choice");
            }

        }

        newItem.setUploaderEmail(User_ServiceClass.user.getEmail());
        newItem.setID(Item_DAO.curr++);

        Item_DAO.insertItem(newItem);

        //System.out.println(newItem.getID()+" "+newItem.getCat()+" "+newItem.getHasID() +" "+newItem.getInfo()+" "+newItem.getName() + newItem.getSerial() +" "+newItem.getUploaderEmail());
    }

    public static void SelectingItem(){  // to be modified

    }

    public static void Search(){
        System.out.println("Enter keyword: ");
        String temp = Main.in.nextLine();
        temp = Main.in.nextLine();

        Vector<Item> v = Item_DAO.FindAllByName(temp);
        System.out.println("\nHere are the results");
        for (Item t:v){
            System.out.println(t.getName());
        }
        if(v.size()==0)
            System.out.println("no results found");




    }

    public static void MarkingItem(){  // to be modified

    }
}

