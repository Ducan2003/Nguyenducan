package Bai3;

public class Triangle {
	private int a, b,c;

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int a, int b, int c) {
		super();
		if (a<=0)
			this.a = 0;
		else 
			this.a = a;
		if (b<=0)
			this.b = 0;
		else 
			this.b =b;
		if (c<=0)
			this.c = 0;
		else
			this.c =c;
	}
	
	public void Hinhtamgiac (int a, int b, int c) {
		if (a+b<=c || a+c<= b || b+c<=a) 
			System.out.println ("Khong phai tam giac");
		
		if (a*a == b+c | b*b == a+c || c*c == a+b) 
			System.out.println ("Tam giac vuong");
		
		if (a == b || a == c || b == a || b==c || c == a || c == b)
			System.out.println ("Tam giac deu");
		else
			System.out.println ("Tam giac vuong can");
		}
		
	public int getA() {
		return a;
	}
	public void setA(int a) {
		if (a<=0)
			this.a = a;		
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		if(b<=0)
			this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		if (c<=0)
			this.c = c;
	}
	
	public int Chuvi(){
        return a+b+c;
    }
    	public double DienTich(){
            double p=(double)(a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));                   
    }
		@Override
		public String toString() {
			return "Triangle [a=" + a + ", b=" + b + ", c=" + c  + ", Chuvi=" + Chuvi() + ", DienTich=" + DienTich()+ "]";
		}
   
}
