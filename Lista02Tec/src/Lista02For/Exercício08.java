package Lista02For;
import java.util.Scanner;
public class Exercício08 {

	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		String expressao = sacanner.next();
		if(expressao.indexOf('(')>-1 || expressao.indexOf(')')>-1) {
			if(expressao.indexOf('(')==-1 || expressao.indexOf(')') == -1) {
				System.out.println("Esta faltando um Parentese na sua expressão");
			}else {
				System.out.println("os Parenteses estão bem formados");
				}
		}
		if(expressao.indexOf('[')>-1 || expressao.indexOf(']')>-1) {
			if(expressao.indexOf('[')==-1 || expressao.indexOf(']') == -1) {
				System.out.println("Esta faltando um Colchete na sua expressão");
			}else {
				System.out.println("os Colchetes estão bem formados");
				}
		}
		if(expressao.indexOf('{')>-1 || expressao.indexOf('}')>-1) {
			if(expressao.indexOf('{')==-1 || expressao.indexOf('}') == -1) {
				System.out.println("Esta faltando uma Chave na sua expressão");
			}else {
				System.out.println("as Chaves estão bem formadas");
				}
		}
		sacanner.close();
	}

}
