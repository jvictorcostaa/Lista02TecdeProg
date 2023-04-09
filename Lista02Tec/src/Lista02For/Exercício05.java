package Lista02For;
import java.util.Scanner;
public class Exercício05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int limesquerda = scanner.nextInt();
		int limdireita = scanner.nextInt();
		for(int numesquerda = 0;numesquerda <= limdireita;numesquerda++) {
			for(int numdireita = 0;numdireita<=limesquerda;numdireita++) {
				System.out.println(numesquerda+"-"+numdireita);
			}
		}
		scanner.close();
	}
	
}
