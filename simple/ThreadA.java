package simple;

public class ThreadA extends Thread {

	@Override
	public void run() {
		System.out.println("Entering ThreadA");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadA=" + i);
		}
		System.out.println("Exiting ThreadA");
	}

}
