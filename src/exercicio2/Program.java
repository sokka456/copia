package exercicio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program 
{

	public static void main(String[] args) 
	{
		double km, lt, result;
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Quantos Kms foram rodados?");
			km = sc.nextDouble();
			System.out.println("Quantos litros de combustível foram gastos?");
			lt = sc.nextDouble();
			result = (km/lt);
			System.out.println("Média de " + df.format(result) + "/km por litro!");
		sc.close();
	}

}