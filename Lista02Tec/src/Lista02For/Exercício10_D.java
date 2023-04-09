package Lista02For;
import java.util.Scanner;
public class Exercício10_D {

	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int coluna = sacanner.nextInt();
		int linha = sacanner.nextInt();
		
		for(int col = 0;col < coluna;col++) {
			if(col == 0) {
				for(int lin = 0;lin<linha;lin++) {
						System.out.print(lin+" ");			
					}
			}else if(col == coluna-1) {
				for(int lin = linha-1;lin>=0;lin--) {
					System.out.print(lin+" ");
				}
					
				}else{
					for(int lin = 0;lin<linha;lin++) {
						if(lin==0) {
							System.out.print(col+" ");
						}else if(lin==linha-1) {
							System.out.print(lin-col+" ");
						}else {
							System.out.print("*"+" ");
						}
					}
				}			
			System.out.println();
			
		}
		sacanner.close();
	}
}
	
		


