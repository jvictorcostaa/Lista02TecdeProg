package Lista02For;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		int mult = 0;
		while(mult <=10) {
		System.out.println(numero+" x "+mult+" = "+numero * mult );
		mult++;
		}
		scanner.close();
	}

}
