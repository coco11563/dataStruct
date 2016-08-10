package ThreadSecure;

public class Thread_A extends Thread{
	private work work; 
	
	public Thread_A(work work)
	{
		this.work = work;
	}
	@Override
	public void run()
	{
		work.add();
		
	}

}
