import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			if (a % b == 0) {
				System.out.println("SAO MULTIPLOS");
			}
			else {
				System.out.println("NAO SAO MULTIPLOS");
			}
		}
		else {
			if (b % a == 0) {
				System.out.println("SAO MULTIPLOS");
			}
			else {
				System.out.println("NAO SAO MULTIPLOS");
			}
		}
		
		sc.close();
	}

}
