package anonymous;

public class TestAnonymous {

	public static void main(String[] args) {

		Foo f = new FooImpl();

		Foo f1 = new Foo() {
			@Override
			public void foo() {
				System.out.println("Impl..");
			}
		};

	}

}
