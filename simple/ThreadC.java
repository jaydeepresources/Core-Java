package simple;

public class ThreadC implements Runnable {

	@Override
	public void run() {
		System.out.println("Entering ThreadC");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadC=" + i);
		}
		System.out.println("Exiting ThreadC");
	}

}
