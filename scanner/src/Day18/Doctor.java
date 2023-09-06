        package Day18;

public class Doctor {
	int id;
	String name;
    String address;
    int mobno;
    int fee;
    
    public void setId(int id)
    {
    	this.id=id;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public void setAddress(String address)
    {
    	this.address=address;
    }
    public void setMobno(int mobno)
    {
    	this.mobno=mobno;
    }
    public void setFee(int fee)
    {
    	this.fee=fee;
    }
    
    @Override
    public String toString()
    { 
    	return "id:-"+id+"name:-"+name+"address:-"+address+"mobno:-"+mobno+"fee;-"+fee++;
    }
  public static void main (String []args)
  {
   Doctor d=new Doctor();
    d.setId(11);
    d.setName("pranav");
    d.setAddress("pune");
    d.setMobno(775889926);
    d.setFee(100000);
  }
}

