package ThreadDeamon;

public class ThreadA extends Thread {
	public void run() {
		for (long i = 0; i < 9999999L; i++) {
			System.out.println("��̨�߳�A��" + i + "��ִ�У�");
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
