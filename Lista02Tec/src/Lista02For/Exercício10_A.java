package Lista02For;
import java.util.Scanner;
public class Exercício10_A {

	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		for(int coluna = 0;coluna<tamanho+1;coluna++) {
			for(int linha = 0;linha<coluna;linha++ ) {
				System.out.print(linha+" ");
				
			}
			System.out.println();
		}
		sacanner.close();
	}

}
