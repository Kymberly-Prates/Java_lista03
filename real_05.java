package Lista03;

import java.util.Scanner;

public class real_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor em d�lar");
		float dolar = sc.nextFloat();
		System.out.println("Digite a cota��o do d�lar");
		float conversao = sc.nextFloat();
		
		float real = dolar * conversao;
		
		System.out.println("O valor convertido em reais � de: " + real + "R$");
	}

}
