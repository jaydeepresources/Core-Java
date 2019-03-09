package simple;

public class TestThreads {

	public static void main(String[] args) {

		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ThreadC tc = new ThreadC();

		ta.start();
		tb.start();
		Thread t1 = new Thread(tc);
		t1.start();

		Runnable r = () -> {
			System.out.println("Entering ThreadLambda");
			for (int i = 0; i < 10; i++) {
				System.out.println("ThreadLambda=" + i);
			}
			System.out.println("Exiting ThreadLambda");
		};

		Thread t2 = new Thread(() -> {
			System.out.println("Entering ThreadLambda");
			for (int i = 0; i < 10; i++) {
				System.out.println("ThreadLambda=" + i);
			}
			System.out.println("Exiting ThreadLambda");
		});

		t2.start();

	}

}
