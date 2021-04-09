import java.util.Scanner;

public class Condicional8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		salario = sc.nextDouble();
		imposto = 0.00;
		
		if(salario < 2000.00) {
			System.out.println("Isento");
		}
		else {
			if(salario <= 3000.00) {
				salario = salario - 2000.00;
				imposto = salario * 0.08;
				System.out.println(imposto);
			}
			else if(salario >= 3000.01 && salario <= 4500.00) {
				salario = salario - 3000.00;
				imposto = 1000.00 * 0.08;
				imposto = imposto + salario * 0.18;
				System.out.println(imposto);
			}
			else {
				salario = salario - 4500;
				imposto = 1000.00 * 0.08;
				imposto = imposto + 1500 * 0.18;
				imposto = imposto + salario * 0.28;
				System.out.println(imposto);
			}
		}
		
		sc.close();
	}

}
