package Lista02For;
import java.util.*;
import java.util.Scanner;
	public class Exercício06 {

	    public static void main(String[] args) {
	    	Scanner sacanner = new Scanner(System.in);
	    	String str = sacanner.next();
	        ArrayList<String> permutations = generatePermutations(str);
	        System.out.println(permutations);
	    }
	    
	    public static ArrayList<String> generatePermutations(String str) {
	        ArrayList<String> permutations = new ArrayList<>();
	        generatePermutationsHelper(str.toCharArray(), 0, permutations);
	        return permutations;
	    }
	    
	    public static void generatePermutationsHelper(char[] arr, int index, ArrayList<String> permutations) {
	        if (index == arr.length - 1) {
	            permutations.add(new String(arr));
	            return;
	        }
	        for (int i = index; i < arr.length; i++) {
	            swap(arr, index, i);
	            generatePermutationsHelper(arr, index + 1, permutations);
	            swap(arr, index, i);
	        }
	    }
	    
	    public static void swap(char[] arr, int i, int j) {
	        char temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}
