package mysystem;
 
import java.util.Scanner;

public class CalculadoraMine {

	public static void main(String[] args) {
       try (Scanner scan = new Scanner(System.in)) {
		int a,b;
		   
		   System.out.println("Digitar o primeiro valor:");
		   a = scan.nextInt();
		   System.out.println("Digitar o segundo valor:");
		   b = scan.nextInt();
		   
		   double soma = soma(a,b);
		   double subtracao = subtracao(a,b);
		   double multiplicacao = multiplicacao(a,b);
		   double divisao = divisao(a,b);
		  
		  System.out.println("Soma:"+soma);
		  System.out.println("Subtração:"+subtracao);
		  System.out.println("Multiplicação:"+multiplicacao);
		  System.out.println("Divisão:"+divisao);
	}

}

public static double soma(int a,int b) {
	 return a + b;
}

public static double subtracao(int a,int b) {
	 return a - b;
}

public static double multiplicacao(int a,int b) {
	 return a * b;
}

public static double divisao(int a,int b) {
	 return a / b;
}

}