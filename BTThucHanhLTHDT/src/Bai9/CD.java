package Bai9;

public class CD {
	private int CDid = 999999;
	private String TuaCD = "chua xac dinh";
	private int musicno;
	private float price;
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(int CDid, String TuaCD, int musicno, float price) {
		super();
		this.CDid = CDid;
		this.TuaCD = TuaCD;
		this.musicno = musicno;
		this.price = price;
	}
	public int getCD() {
		return CDid;
	}
	public void setCD(int cDid) {
		CDid = cDid;
	}
	public String getTuaCD() {
		return TuaCD;
	}
	public void setTuaCD(String tuaCD) {
		TuaCD = tuaCD;
	}
	public int getMusicno() {
		return musicno;
	}
	public void setMusicno(int musicno) {
		this.musicno = musicno;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString() {
		return String.format("%5d %15s %10s %15", CDid, TuaCD, musicno, price);
	}
}
