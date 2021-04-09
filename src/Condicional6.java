import java.util.Scanner;

public class Condicional6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		String intervalo;
		
		if (x >= 0 && x <= 25) {
			intervalo = "Intervalo [0,25]";
		}
		else if(x > 25 && x <= 50) {
			intervalo = "Intervalo (25,50]";
		}
		else if(x > 50 && x <= 75) {
			intervalo = "Intervalo (50,75]";
		}
		else if (x > 75 && x <= 100){
			intervalo = "Intervalo (75,100]";
		}
		else {
			intervalo = "Fora do intervalo";
		}
		
		System.out.println(intervalo);
		
		sc.close();
	}

}
