package Lista02For;
import java.util.Scanner;
public class Exercício07 {

	public static int dividirprimo(int ultnum){
		int divisores = 0;
		for(int divisor = 2;divisor < ultnum;divisor++) {
			if(ultnum%divisor == 0) {
				divisores++;
			}
		}
		return(divisores);
	}
	public static int mostrarnumero(int numeroprimo){
		System.out.println(numeroprimo);
		int numterminar = 0;
		return(numterminar);
		}
	
	public static void main(String[] args) {
			Scanner sacanner = new Scanner(System.in);
			int numero = sacanner.nextInt();
			
			for (;numero > 1; numero--) {
			int div = dividirprimo(numero);
			if(div == 0) {
				numero = mostrarnumero(numero);
			}
		}
			sacanner.close();
	}
}
		



