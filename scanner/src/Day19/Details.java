package Day19;
import java.util.Scanner;
public class Details {
	Player p=new Player();
	Scanner sc=new Scanner(System.in);
	int a;
	int newscore;
	int finalscore;
	public void addPlayer()
	{
		System.out.println("Enter id");
		p.setId(sc.nextInt());
		System.out.println("Enter name");
		p.setName(sc.next());
		System.out.println("Enter address");
		p.setAddress(sc.next());
		System.out.println("Enter mobno");
		p.setMobno(sc.nextLong());
		System.out.println("Enter score");
		p.setScore(sc.nextInt());
	}
	public void viewPlayer()
	{
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getMobno());
		System.out.println(p.getScore());
	}
  public void updateScore()
  {
	  this.a=p.getScore();
	  System.out.println("Enter new score");
	  newscore=sc.nextInt();
  }
  public void finalScore()
  {
	this.a=p.getScore();
	finalscore = a + newscore;
	System.out.println(finalscore);
  }
}