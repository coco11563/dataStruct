package ThreadDeamon;

public class ThreadB extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("�߳�B��" + i + "��ִ�У�");
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}