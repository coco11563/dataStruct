package ThreadLocal;

public class MyTest {
	private int c = 0 ; 
	public static ThreadLocal<String> val = new ThreadLocal<String>(){
		
		public String initialValue()
		{
			return "yes";
		}
	};
	public ThreadLocal<String> getThreadLocal(){
		return val;
	}
	public String getNextNum(){
		val.set("yes" + c);
		c++;
		return val.get();
	}
	public static class TestClient extends Thread{
		private MyTest my;
		public TestClient(MyTest my){
			this.my = my;
		}
		public void run(){
			for(int i = 0; i< 3 ; i ++)
			{
				System.out.println("Thread["+Thread.currentThread().getName() + "] --> my[" + my.getNextNum()+ "]");
				
			}
			my.getThreadLocal().remove();
		}
	}
	public static void main(String[] args ){
		MyTest my = new MyTest();
		TestClient t1  = new TestClient(my);
		TestClient t2  = new TestClient(my);
		TestClient t3  = new TestClient(my);
		t1.start();
		System.out.println(111);
		t2.run();
		System.out.println(111);
		t3.start();
	}
}
