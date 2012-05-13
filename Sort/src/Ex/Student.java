package Ex;

public class Student extends Borrower{


    public Student(int id, String name){
        super(id,name);

    }
@Override
    public void setID(int id){
        this.id=id;
    };
    public void setName(String name){
        this.name=name;
    }
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}


}