
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
			System.out.println("�߳�����"+this.name+",i="+i);			
		}
	}
	public static void main(String agrgs[])
	{
		RunnableTest r1=new RunnableTest("�߳�");
		RunnableTest r2=new RunnableTest("�߳�");
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
