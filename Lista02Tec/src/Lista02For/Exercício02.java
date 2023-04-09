package Lista02For;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		int soma = 0;
		Scanner scanner = new Scanner(System.in);
		int número = 0;
		do{
		soma += número;
		número = scanner.nextInt();
		
		
		}while(número > 0);
		System.out.println(soma);		
		scanner.close();
	}
	
			}

