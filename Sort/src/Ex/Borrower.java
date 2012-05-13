package Ex;

public abstract class Borrower {

    protected  int id;
    protected  String name;


    public Borrower(int id, String name){
        this.id=id;
        this.name=name;
    }

    public abstract void setID(int id);
    public abstract void setName(String name);
    public abstract String getName();
    public abstract int getID();
}