package exercicio5;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		String var;
		Scanner sc = new Scanner(System.in);
			System.out.println("String");
			var = sc.next();
			String invertida = new StringBuilder(var).reverse().toString();
			System.out.println(invertida);
		sc.close();
	}
}