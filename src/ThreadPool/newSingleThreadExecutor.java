package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newSingleThreadExecutor {
	public static void main(String args[]){
		ExecutorService executor = Executors.newSingleThreadExecutor();
		for(int i = 0 ; i < 10 ;i++){
			final int no = i ;
			Runnable runnable = new Runnable() {//新建一个runnable线程
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("into" + no);
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("out" +no);
				}
			};
			executor.execute(runnable);//线程入池
		}
		executor.shutdown();
		System.out.println("Main Thread END!");
	}
}
