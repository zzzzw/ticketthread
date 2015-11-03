
public class threadTest extends Thread {
	private String name;
	private threadTest(String name)
	{
		super();
		this.name=name;
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("线程开始"+this.name+",i="+i);
		}
	}
	public static void main(String args[])
	{
		Thread m1=new threadTest("线程1");
		Thread m2=new threadTest("线程2");
		m1.start();
		m2.start();
		
	}
	
	
}
