package Lista02For;
import java.util.Scanner;
public class Exercício10_C {

	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int coluna = sacanner.nextInt();
		int linha = sacanner.nextInt();
		
		for(int col = 0;col < coluna;col++) {
			if(col == coluna/2) {
				for(int lin = 0;lin<linha;lin++) {
					System.out.print("@"+" ");
				}
			}else if(col%2==0){
				for(int lin = linha-1;lin>=0;lin--) {
					if(lin == linha/2) {
						System.out.print("@"+" ");
					}else {
						System.out.print(lin+" ");
					}	
				}
			}else {
				for(int lin = 0;lin<linha;lin++) {
					if(lin == linha/2) {
					System.out.print("@"+" ");
					}else {
						System.out.print(lin+" ");
					}
				}
			}
			System.out.println();
		}
		sacanner.close();
	}

}
