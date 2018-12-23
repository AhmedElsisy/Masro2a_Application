

import java.util.*;

public class Item_DAO {
    public static int curr = 0;
    private static String serial;
    private static boolean HasSerial;
    private static ArrayList<Item> a;
    public static Vector <Item> items= new Vector<Item>();
    public static void insertItem(Item item){
        items.add(item);
    }

    public static void updateItem(Item item){  // to be modified

    }

    public static boolean deleteItem(Item item){


    	int F = item.getID();
        Item tmp;
        boolean ok = false;
        for(int i= 0 ; i<items.size();++i) {
       	 tmp = items.elementAt(i);
       	 if(tmp.getID() == F) {
             items.remove(i);
       		 ok = true;
       		 break;
       	 }

       	 
        }
        return ok;
    	
    }

    public static Vector<Item> FindALL(){   // to be modified
        Vector<Item> v = new Vector<Item>();
        return  v;
    }

    public static Vector<Item> FindAllByCat(String x){   // to be modified
        Vector<Item> v = new Vector<Item>();
        return  v;
    }



    public static Vector<Item> FindAllByName(String x){
        String [] kk = x.split(" ");
        Vector<Item> virjil = new Vector<Item>();
        for (int i = 0 ; i < kk.length;++i) {
            for (Item t : items) {
                String []gg = t.getName().split(" ");
                String[]ggg = t.getInfo().split(" ");
                for (int j = 0 ; j < gg.length;++j) {
                    if (gg[j].equals(kk[i])  && !virjil.contains(t)) {
                        virjil.add(t);
                        break;
                    }
                }
                for (int j = 0 ; j < ggg.length;++j) {
                    if (ggg[j].equals( kk[i]) && !virjil.contains(t)) {
                        virjil.add(t);
                        break;
                    }
                }
            }
        }


        return  virjil;
    }

    public static String FindSerial(String x){
        return serial; // to be modified
    }

}

