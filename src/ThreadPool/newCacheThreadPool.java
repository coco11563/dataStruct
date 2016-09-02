package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newCacheThreadPool {
	public static void main(String args[]){
		ExecutorService excutor = Executors.newCachedThreadPool();
		for(int i = 0 ; i <20 ; i++){
			final int no = i;
			Runnable runnable = new Runnable() {	
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					try {
						System.out.println("into" + no);
						Thread.sleep(1000);
						System.out.println("out" + no);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		excutor.execute(runnable);
		}
		excutor.shutdown();
		System.out.println("Main out");
	}
}
