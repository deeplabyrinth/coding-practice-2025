public class Car {

	private String id;
	private boolean reserved;

	public Car(String id, boolean reserved) {
		setId(id);
		setReserved(reserved);
	}

	public void setId(String id) { this.id = id; }
	public void setReserved(boolean reserved) { this.reserved = reserved; }
	public String getId() { return id; }
	public boolean isReserved() { return reserved; }
}
