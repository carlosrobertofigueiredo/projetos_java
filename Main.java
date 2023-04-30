import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 float largura;
		 float comprimento;
		 float area;
		 double pm2;
		 double valor;
		 
		 
		System.out.println("Digite a Largura do terreno:");
		largura = sc.nextFloat();
		System.out.println("Digite o comprimento do terreno:");
		comprimento = sc.nextFloat();
		
		System.out.println("Digite o preco do M2 do terreno:");
		pm2 = sc.nextDouble();
		area = largura * comprimento;
		valor = area * pm2;
		
		System.out.printf("A area do terreno e: %.2f%n", area );
		System.out.printf("O preco do M2 do terreno e: %.2f%n", pm2);
		System.out.printf("O valor do terreno e: %.2f%n",valor);
		
		
		
		sc.close();
	}
}
