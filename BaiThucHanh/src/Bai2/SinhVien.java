package Bai2;
public class SinhVien {
	private int maSV;
	private String tenSV;
	private float diemTL,diemTH; 
}
public SinhVien() {
	
}
public SinhVien(int maSV,String tenSV,float diemTL,float diemTH) 
{
this.maSV =maSV;
this.tenSV =tenSV;
this.diemTL =diemTL;
this.diemTH =diemTH;
}
public int getMaSV() {
	return maSV;
}
public void setMaSV(int maSV) {
	this.maSV = maSV;
}
public String getTenSV() {
	return tenSV;
}
public void setTenSV(String tenSV) {
	this.tenSV = tenSV;
}
public float getDiemTL() {
	return diemTL;
}
public void setDiemTL(float diemTL) {
	this.diemTL = diemTL;
}
public float getDiemTH() {
	return diemTH;
}
public void setDiemTH(float diemTH) {
	this.diemTH = diemTH;
}
