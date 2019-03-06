package methodLocal;

public class Outer {

	public class Inner {

		public void foo() {

			class FooInner {

			}
			FooInner fi = new FooInner();
		}
	}
}