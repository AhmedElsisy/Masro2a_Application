import java.time.chrono.MinguoChronology;
import java.util.Scanner;
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
    	Scanner scan = new Scanner();
     //   System.out.println("Enter the item  Keyword : ");
        String temp =Main.in.nextLine();
       // temp = Main.in.nextLine();
        Vector<Item> v = Item_DAO.FindALL();
        for (Item t:v){
            System.out.println(t.getName() + " " t.getID());
        }
        System.out.println("select item (Enter such an item's  id ) : ");
        int id = Main.in.nextInt();
        
        for (Item t:v){
        	if(t.gerID() ==  id) {
        		while(true) {
        		int cnt = 0;
        		int choice ;
        		if(cnt > 10) {
            		System.out.println("number of trials exceeded  :  ");
            		System.out.println("may be not the item your looking for   ");
            		break;
        		}
        		System.out.println("Enter(1) to calim the item");
        		System.out.println("Enter(2) to exsit");
                choice = Main.in.nextInt();
                if(choice == 2)break;
                if(choice ==  1) {
            		System.out.println("Respond the question to verify ");
            		System.out.println("what is the item's serial :  ");
            		String ans  = Main.in.nextLine();
            		
            		if(ans == t.getSerial()) {
            			System.out.println( t.getUploaderEmail());
            			System.out.println(t.getInfo() );
            		}
            		else {
            			System.out.println("WRONG ANSWER");
            			cnt++;
            		}


                }
        	}
        		
        }
     }
       
          	
    	
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
    	Scanner scan = new Scanner();
    	while(true) {
    	       System.out.print("Enter(1) to continue  : ");
    	       System.out.print("Enter(2) to terminate   : ");
        	   int choice  =Main.in.nextInt();
if(choice == 2)   break;     	   
if(choice == 1) {
       System.out.print("Enter the Item Id : ");
       int id =Main.in.nextInt();
       Vector<Item> v = Item_DAO.FindALL();
       item.
       
       for(Item it : v) {
    	 if(  it.getID() == id) {
    		 Item_DAO dao;
    		 if(dao.deleteItem(it)) {
    		       System.out.println("Item is Marked as found. ");
    		 }
    		 else {
  		       System.out.println("There's no such item. ");
  		       

    		 }
    		 return;
    		 
    	 }
    	 
       }
	       System.out.println("There's no such item exsit. ");
}


	       
    }
       
	       
	       
    }
    
    
    
}

