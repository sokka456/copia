package exercicio7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("0.00");
		Calcula calc = new Calcula();
		Scanner sc = new Scanner(System.in);
			double r,a, result;
			System.out.println("Altura: ");
			a = sc.nextDouble();
			System.out.println("Raio: ");
			r = sc.nextDouble();
			result = calc.Resultado(r, a);
			System.out.println("Resultado: " + df.format(result) + " cm³");
		sc.close();
	}
}
