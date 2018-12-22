import java.util.Vector;

public class Item {
    private  String Name , Info , Serial , UploaderEmail, Category;
    private  int ID ;
    private  boolean hasID;

    public  String getCat(){
        return Category;
    }
    public  void SetCat(String x){
        Category = x;
    }
    public  void setName(String name) {
        Name = name;
    }

    public  void setInfo(String info) {
        Info = info;
    }

    public  void setSerial(String serial) {
        Serial = serial;
    }

    public  void setUploaderEmail(String uploaderEmailx) {
        UploaderEmail = uploaderEmailx;
    }

    public  void setID(int IDx) {
        ID = ID;
    }



    public  void setHasID(boolean hasIDx) {
        hasID = hasID;
    }

    public  String getName() {
        return Name;
    }

    public  String getInfo() {
        return Info;
    }

    public  String getSerial() {
        return Serial;
    }

    public  String getUploaderEmail() {
        return UploaderEmail;
    }

    public  int getID() {
        return ID;
    }



    public  boolean getHasID() {
        return hasID;
    }
}
