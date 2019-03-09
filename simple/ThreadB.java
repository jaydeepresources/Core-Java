package simple;

public class ThreadB extends Thread {

	@Override
	public void run() {
		System.out.println("Entering ThreadB");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadB=" + i);
		}
		System.out.println("Exiting ThreadB");
	}

}
