package Bai4;

import java.util.Scanner;
public class Test4 {
	public static  void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc= new Scanner(System.in);{
		System.out.println("Nhap ten chu xe:");
		String Ownercar = sc.nextLine();
		System.out.println("Nhap ten xe:");
		String Carname =sc.nextLine();
		System.out.println("Nhap vao price");
		Double Price =sc.nextDouble();
		System.out.println("Nhap vao so xylanh");
		Float xylanh =sc.nextFloat();	
		double Tax;
			if (xylanh < 100)
				Tax = (Price * 0.01);
			else if (xylanh >=100 && xylanh <= 200)
				Tax = (Price * 0.03);
			else 
				Tax = (Price *0.05);
			System.out.println(Ownercar.toString());	
			System.out.println(Carname.toString());
			System.out.println(Price.toString());
			System.out.println(xylanh.toString());
			System.out.println(Tax);
		}
	}
}

