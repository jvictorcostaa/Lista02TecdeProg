package Lista02For;
import java.util.Scanner;
public class Exercício10_F {

	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int coluna = sacanner.nextInt();
		int linha = sacanner.nextInt();
		for(int col = 0;col<coluna;col++) {
			for(int lin = 0;lin<linha;lin++) {
				if(col == lin || col + lin == linha-1) {
					System.out.print(lin+" ");
				}else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		sacanner.close();
	}

}
