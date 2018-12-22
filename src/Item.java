import java.util.Vector;

public class Item {
    private static String Name , Info , Serial , UploaderEmail;
    private static int ID , image[][];
    private static boolean hasID;

    public static void setName(String name) {
        Name = name;
    }

    public static void setInfo(String info) {
        Info = info;
    }

    public static void setSerial(String serial) {
        Serial = serial;
    }

    public static void setUploaderEmail(String uploaderEmail) {
        UploaderEmail = uploaderEmail;
    }

    public static void setID(int ID) {
        Item.ID = ID;
    }

    public static void setImage(int[][] image) {
        Item.image = image;
    }

    public static void setHasID(boolean hasID) {
        Item.hasID = hasID;
    }

    public static String getName() {
        return Name;
    }

    public static String getInfo() {
        return Info;
    }

    public static String getSerial() {
        return Serial;
    }

    public static String getUploaderEmail() {
        return UploaderEmail;
    }

    public static int getID() {
        return ID;
    }

    public static int[][] getImage() {
        return image;
    }

    public static boolean getHasID() {
        return hasID;
    }
}
