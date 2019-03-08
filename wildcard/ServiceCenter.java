package wildcard;

public class ServiceCenter<V extends Vehicle> {

	private V item;

	public ServiceCenter(V item) {
		this.item = item;
	}

	public V getItem() {
		return item;
	}

	public void setItem(V item) {
		this.item = item;
	}

	public void printServiceCenter() {
		System.out.println("Item is= " + item.getClass().getSimpleName());
	}
}
