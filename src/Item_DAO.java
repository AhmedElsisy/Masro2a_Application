

import java.util.*;

public class Item_DAO {
    private static String serial;
    private static boolean HasSerial;
    private static ArrayList<Item> a;
    public static Vector <Item> VecOfItem= new Vector<Item>();
    public static void insertItem(Item item){
    	 VecOfItem.add(item);
    }

    public static void updateItem(Item item){

    }

    public static void deleteItem(Item item){


    	int F = item.getID();
        Item tmp;
        boolean ok = false;
        for(int i= 0 ; i<VecOfItem.size();++i) {
       	 tmp = VecOfItem.elementAt(i);
       	 if(tmp.getID() == F) {
       		 VecOfItem.remove(i);
       		 ok = true;
       		 break;
       	 }
       	 
        }
    	
    	
    }

    /*public static ArrayList<Item> FindALL(){

    }

    public static ArrayList<Item> FindAllByCat(String x){

    }

    public static ArrayList<Item> FindAllByInfo(String x){

    }

    public static ArrayList<Item> FindAllByName(String x){

    }

    public static String FindSerial(String x){
        return serial; // to be changed
    }
    */
}

