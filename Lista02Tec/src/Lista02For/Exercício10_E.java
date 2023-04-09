package Lista02For;
import java.util.Scanner;
public class Exercício10_E {

	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int coluna = sacanner.nextInt();
		int linha = sacanner.nextInt();
		
		for(int col = 0;col<coluna;col++) {
			if(col == coluna/2) {
				for(int lin = 0;lin<linha;lin++) {
					System.out.print("="+"  ");
				}	
			}else{
				for(int lin = 0;lin<linha;lin++) {
					if(lin == linha/2) {
						System.out.print("||"+" ");
					}else if(lin<linha/2 && col<coluna/2){
						System.out.print("#"+"  ");
					}else if(lin>linha/2 && col<coluna/2) {
						System.out.print("!"+"  ");
					}else if(lin<linha/2 && col>coluna/2) {
						System.out.print("*"+"  ");
					}else {
						System.out.print("%"+"  ");
					}
				}
			}
			System.out.println();
			}
			sacanner.close();
		}

	}

