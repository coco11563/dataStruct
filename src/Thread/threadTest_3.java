package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class threadTest_3 implements Callable<String>{
	public String call()
	{
		try {
			Thread.sleep(500L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("这是线程 C");
		return "thread C";
	}
	public static void main(String args[])
	{
		threadTest_3 c = new threadTest_3();
		FutureTask<String> faeature =  new FutureTask<String>(c);
		new Thread(faeature).start();
		System.out.println("这是主线程：begin!");
		try {
			System.out.println("得到的返回结果是：" + faeature.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("这是主线程:end！");
	}

}
