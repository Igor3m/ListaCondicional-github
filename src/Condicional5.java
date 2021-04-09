import java.util.Scanner;

public class Condicional5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco, total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = 4.00;
			total = quantidade * preco;
		}
		else if (codigo == 2) {
			preco = 4.50;
			total = quantidade * preco;
		}
		else if (codigo == 3) {
			preco = 5.00;
			total = quantidade * preco;
		}
		else if (codigo == 4) {
			preco = 2.00;
			total = quantidade * preco;
		}
		else {
			preco = 1.50;
			total = quantidade * preco;
		}
		
		System.out.println("Total: R$ " + total);
		
		sc.close();
	}

}
