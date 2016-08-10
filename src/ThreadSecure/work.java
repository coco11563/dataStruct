package ThreadSecure;

public class work {
	public int number = 0;
	public synchronized void  add()
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		number = number + 1 ;
		System.out.println(Thread.currentThread().getName() + "-" + number);
	}

}
