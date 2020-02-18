import java.util.Scanner;

  class Main {
	  public static double soma ( double n1, double n2) {
		 return n1 + n2;
	  }
	  public static double subtracao ( double n1, double n2) {
		  return n1 - n2;
		  
	  }
	  public static double multiplicacao (double n1, double n2) {
		  return n1 * n2;
	  }
	  public static double divisao (double n1, double n2) {
		  return n1 / n2;
	  }
	  

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		double n1 = sc.nextDouble();
		System.out.println("Informe o segundo numero: ");
		double n2 = sc.nextDouble();
		  
		double vsoma = soma(n1, n2);
		double vsubtracao = subtracao(n1, n2);
		double vmultiplicacao = multiplicacao(n1, n2);
		double vdivisao = divisao(n1, n2);
		
		 System.out.println("Soma: " + vsoma);
		 System.out.println("Subtracao: " + vsubtracao);
		 System.out.println("Multiplicacao: " + vmultiplicacao);
		 System.out.println("Divisao: "+ vdivisao);
		 
		

		 sc.close();

		
		

	}

}
