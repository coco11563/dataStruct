package Thread;

public class threadTest_2 implements Runnable{
	@Override
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���ǽ���B");
	}
	public static void main(String args[])
	{
		threadTest_2 b = new threadTest_2();
		new Thread(b).start();
		System.out.println("�������̣߳�");
	}

}
