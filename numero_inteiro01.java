package Lista03;

import java.util.Scanner; 

public class numero_inteiro01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro vaor para fica em A");
		int a = sc.nextInt();
		System.out.println("Digite o primeiro vaor para fica em B");
		int b = sc.nextInt();
		System.out.println("Digite o primeiro vaor para fica em C");
		int c = sc.nextInt();
		System.out.println("Digite o primeiro vaor para fica em D");
		int d = sc.nextInt();
		
		int amb = a + b;  // somando os valores 
		int amc = a + c;
		int amd = a + d;
		
		int bmc = b + c;
		int bmd = b + d;
		int cmd = c + d;
		
		int axb = a * b; // multiplicando os valores
		int axc = a * c;
		int axd = a * d;
		int bxc = b * c;
		int bxd = b * d;
		int cxd = c * d;
		
		System.out.println("A soma dos valores A e B � " + amb);
		System.out.println("A soma dos valores A e C � " + amc);
		System.out.println("A soma dos valores A e D � " + amd);
		System.out.println("A soma dos valores B e C � " + bmc);
		System.out.println("A soma dos valores B e D � " + bmd);
		System.out.println("A soma dos valores C e D � " + cmd);
		System.out.println("");
		System.out.println("");
		System.out.println("A multiplica��o dos valores A e B � " + axb);
		System.out.println("A multiplica��o dos valores A e C � " + axc);
		System.out.println("A multiplica��o dos valores A e D � " + axd);
		System.out.println("A multiplica��o dos valores B e C � " + bxc);
		System.out.println("A multiplica��o dos valores B e D � " + bxd);
		System.out.println("A multiplica��o dos valores C e D � " + cxd);
		
	}
}
