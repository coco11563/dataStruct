package ThreadSecure;

public class ThreadMain {
	public static void main(String[] args)
	{
		work work = new work();
		for(int i = 0 ; i < 5 ; i++)
		{
		Thread_A p1 = new Thread_A(work);
		p1.start();
		}
		try {
			Thread.sleep(1001);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(work.number);
	}
}
