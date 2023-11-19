package classes;
import java.util.Scanner;

public class CalculoVolume {

	public static void main(String[] args) {
		//criação do objeto para leitura
		Scanner ler = new Scanner(System.in);
		
		//entrada
		double largura, comp, altura, volume;
		
		System.out.println("Insira a largura da caixa: ");
		largura = ler.nextDouble();
		
		System.out.println("Insira o comprimento da caixa: ");
		comp = ler.nextDouble();
		
		System.out.println("Insira a altura da caixa: ");
		altura = ler.nextDouble();
		
		//processamento
		volume = largura * comp * altura;
		
		//saída
		System.out.println("O Volume da caixa é de: " + volume);

	}

}
