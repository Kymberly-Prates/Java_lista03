package Lista03;

import java.util.Scanner;

public class dolar_04 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor em reais");
		float real = sc.nextFloat();
		
		System.out.println("Digite a cotação do dólar");
		float conversao = sc.nextFloat();
		
		float dolar = real / conversao;
		
		System.out.println("O valor convertido em dólares é de: " + dolar + "$");
	}

}
