import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else if(inicio > fim) {
			duracao = 24 - inicio + fim;
		}
		else {
			duracao = 24;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " " + "HORA(S)");
		
		sc.close();
	}

}
