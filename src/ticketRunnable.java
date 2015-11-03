
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
				System.out.println("线程开始"+ticket--);
			}
		}
	}
	public static void main(String args[]){//资源共享
		ticketRunnable t1=new ticketRunnable();
		new Thread(t1).start();
		new Thread(t1).start();
	}
}
/**
 * 
 * 
线程开始20
线程开始18
线程开始17
线程开始16
线程开始15
线程开始14
线程开始13
线程开始12
线程开始11
线程开始10
线程开始9
线程开始8
线程开始19
线程开始7
线程开始5
线程开始4
线程开始3
线程开始2
线程开始1
线程开始6
 */
