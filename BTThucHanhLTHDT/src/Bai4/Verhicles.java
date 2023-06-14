package Bai4;

public class Verhicles {
	private String Ownername;
	private String Carname;
	private double price;
	private float xylanh;
	public Verhicles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Verhicles(String ownername, String carname, double price, float xylanh) {
		super();
		Ownername = ownername;
		Carname = carname;
		this.price = price;
		this.xylanh = xylanh;
	}
	
	// Get and set method
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	public String getCarname() {
		return Carname;
	}
	public void setCarname(String carname) {
		Carname = carname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getXylanh() {
		return xylanh;
	}
	public void setXylanh(float xylanh) {
		this.xylanh = xylanh;
	}
	@Override
	public String toString() {
		return "Verhicles [Ownername=" + Ownername + ", Carname=" + Carname + ", price=" + price + ", xylanh=" + xylanh
				+ ", getOwnername()=" + getOwnername() + ", getCarname()=" + getCarname() + ", getPrice()=" + getPrice()
				+ ", getXylanh()=" + getXylanh() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
