package Thread;

public class threadTest_1 extends Thread {
	public void run()
	{
		super.run();
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("�����߳�A");
	}
	public static void main(String args[])
	{
		threadTest_1 a = new threadTest_1();
		a.start();
		System.out.println("�������߳�");
	}
}
