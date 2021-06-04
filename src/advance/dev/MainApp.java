package advance.dev;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		// Mặc định lớp Object là lớp cha của tất cả các lớp trong java.
		// Nói cách khác nó là một lớp cáo nhất trong java. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		Object ten = sc.next();
		System.out.println("Nhập tuổi: ");
		Object tuoi = sc.nextInt();
		System.out.println("Nhập điểm: ");
		Object diem = sc.nextDouble();
		System.out.println("Tên : " + ten +"\t Tuổi" + tuoi + "\t Điểm: " +  diem);
	}
}
