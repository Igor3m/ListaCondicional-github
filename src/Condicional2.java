import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}
		
		sc.close();

	}

}
