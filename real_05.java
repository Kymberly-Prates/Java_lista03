package Lista03;

import java.util.Scanner;

public class real_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor em dólar");
		float dolar = sc.nextFloat();
		System.out.println("Digite a cotação do dólar");
		float conversao = sc.nextFloat();
		
		float real = dolar * conversao;
		
		System.out.println("O valor convertido em reais é de: " + real + "R$");
	}

}
