
public class ticketRunnable implements Runnable {
	private int ticket=20;
	private ticketRunnable()
	{
		super();
	}
	public void run(){
		for(int i=1;i<=20;i++){
			if(ticket>0)
			{
				System.out.println("�߳̿�ʼ"+ticket--);
			}
		}
	}
	public static void main(String args[]){//��Դ����
		ticketRunnable t1=new ticketRunnable();
		new Thread(t1).start();
		new Thread(t1).start();
	}
}
/**
 * 
 * 
�߳̿�ʼ20
�߳̿�ʼ18
�߳̿�ʼ17
�߳̿�ʼ16
�߳̿�ʼ15
�߳̿�ʼ14
�߳̿�ʼ13
�߳̿�ʼ12
�߳̿�ʼ11
�߳̿�ʼ10
�߳̿�ʼ9
�߳̿�ʼ8
�߳̿�ʼ19
�߳̿�ʼ7
�߳̿�ʼ5
�߳̿�ʼ4
�߳̿�ʼ3
�߳̿�ʼ2
�߳̿�ʼ1
�߳̿�ʼ6
 */
