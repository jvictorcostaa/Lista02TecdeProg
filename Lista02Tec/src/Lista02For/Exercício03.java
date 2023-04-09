package Lista02For;
import java.util.Random;
import java.util.Scanner;
public class Exercício03 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int numero;
		int sorteio = random.nextInt(100)+1;
		do {
		numero = scanner.nextInt();
		if(numero > sorteio) {
			System.out.println("Escreva um numero menor");
		}else if(numero < sorteio){
			System.out.println("Escreva um numero maior");
		}
		}while(numero != sorteio );
		scanner.close();
	}

}
