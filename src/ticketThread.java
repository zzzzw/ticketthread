
public class ticketThread extends Thread {
	private int ticket=20;
	private ticketThread()
	{
		super();
	}
	public void run()
	{
		for(int i=1;i<=20;i++)			
		{
			if(ticket>0)
			System.out.println("�߳̿�ʼ"+ticket--);
		}
	}
	public static void main(String args[])
	{
		ticketThread m1=new ticketThread();
		ticketThread m2=new ticketThread();
		m1.start();
		m2.start();
	}

}
/*
 * 
�߳̿�ʼ20
�߳̿�ʼ19
�߳̿�ʼ18
�߳̿�ʼ17
�߳̿�ʼ16
�߳̿�ʼ15
�߳̿�ʼ14
�߳̿�ʼ13
�߳̿�ʼ12
�߳̿�ʼ11
�߳̿�ʼ20
�߳̿�ʼ19
�߳̿�ʼ18
�߳̿�ʼ17
�߳̿�ʼ16
�߳̿�ʼ15
�߳̿�ʼ14
�߳̿�ʼ13
�߳̿�ʼ12
�߳̿�ʼ10
�߳̿�ʼ11
�߳̿�ʼ9
�߳̿�ʼ8
�߳̿�ʼ10
�߳̿�ʼ9
�߳̿�ʼ7
�߳̿�ʼ8
�߳̿�ʼ7
�߳̿�ʼ6
�߳̿�ʼ5
�߳̿�ʼ4
�߳̿�ʼ3
�߳̿�ʼ2
�߳̿�ʼ1
�߳̿�ʼ6
�߳̿�ʼ5
�߳̿�ʼ4
�߳̿�ʼ3
�߳̿�ʼ2
�߳̿�ʼ1

 */
