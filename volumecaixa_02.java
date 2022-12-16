package Lista03;

import java.util.Scanner;

public class volumecaixa_02 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura da caixa");
		float altura = sc.nextFloat();
		System.out.println("Digite a largura da caixa");
		float largura = sc.nextFloat();
		System.out.println("Digite a comprimento da caixa");
		float comprimento = sc.nextFloat();
		
		float volume = comprimento * altura * largura;
		
		System.out.println("O volume total da caixa é de: " + volume );
	}


}
