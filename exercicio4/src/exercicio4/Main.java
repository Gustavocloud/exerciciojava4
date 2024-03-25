package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
		//ou "Nao saoMultiplos.
		
		    Scanner sc = new Scanner(System.in);
		    
		    int A, B;
		    
		    System.out.println("Digite dois numeros inteiros");
		     A = sc.nextInt();
		     B = sc.nextInt();
		     
		     if (A % B == 0 || B % A == 0) {
		    	 System.out.println("São multiplos");
		     }
		     
		     else { 
		    	 System.out.println("Não são multiplos");
		     }
		   
		    sc.close();
		
		
		
		
		
		
		
	}

}
