package Lista02For;
import java.util.Scanner;
public class Exercício10_B {

	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int coluna = sacanner.nextInt();
		int linha = sacanner.nextInt();
		
		for(int col = 0;col<coluna;col++) {
			if(col%2==0) {
				for(int lin = 0;lin<linha;lin++) {
					if(lin%2==0) {
						System.out.print("@"+" ");
					}else {
						System.out.print("*"+" ");
					}
				}
			}else {
				for(int lin = 0;lin<linha;lin++) {
					if(lin%2==0) {
						System.out.print("*"+" ");
					}else {
						System.out.print("@"+" ");
					}
			}
			
		}
			System.out.println();
	}
	}
}
