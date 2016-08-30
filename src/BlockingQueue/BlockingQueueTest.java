package BlockingQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String args[]) throws InterruptedException, IOException{
		final BlockingQueue<String> bq = new ArrayBlockingQueue<String>(16);
		
		for(int i = 0 ; i < 1 ; i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true){
						String log;
						try {
							log = (String) bq.take();
							parseLog(log);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}
			}).start();
		}
		for(int i = 0; ;i++ ){
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
			String sentence = inFromUser.readLine();
			String[] list = sentence.split("");
			String log;
			for(int j = 0 ; j < list.length ; j++){
//				System.out.println(list[j]);
				if(list[j].equals("小")){
					bq.put("大");
					bq.put("大");
					continue;
				}
			log =list[j];
			bq.put(log);
			}
		}
	}
	
	public static void parseLog(String log){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(log );
//		+"时间为：" +System.currentTimeMillis()+"线程名为"+Thread.currentThread().getName()
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			System.out.print("end");
		}
	}
}
