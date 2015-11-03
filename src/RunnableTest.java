
public class RunnableTest implements Runnable{
	private String name;
	private RunnableTest(String name)
	{
		super();
		this.name=name;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("线程启动"+this.name+",i="+i);			
		}
	}
	public static void main(String agrgs[])
	{
		RunnableTest r1=new RunnableTest("线程");
		RunnableTest r2=new RunnableTest("线程");
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
