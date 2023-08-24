package Day18;

public class Patient {
	int id;
	String name;
    String address;
    String disease;
    int mobno;
    String bloodgroup;
    
    public Patient(int id,String name,String address,String disease,int mobno,String bloodgroup) {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    	this.disease=disease;
    	this.mobno=mobno;
    	this.bloodgroup=bloodgroup;
    	
    }
    @Override
    public String toString()
    { 
    	return "id:-"+id+"name:-"+name+"address:-"+address+"disease:-"+disease+"mobno:-"+mobno+"bloodgroup:-"+bloodgroup;
    }
    public static void main(String[] args)
    {
     Patient a=new Patient(11,"pranav","pune","tumer",775889926,"+B");
     System.out.println(a);
    }

}
