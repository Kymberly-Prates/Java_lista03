package Lista03;

import java.util.Scanner;

public class quadrado_03 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A");
		float a = sc.nextFloat();
		
		System.out.println("Digite o valor de B");
		float b= sc.nextFloat();
		
		float resposta = (float) Math.pow((a - b), 2);
		System.out.println("O resultado é igual a: " + resposta);
	}

}
