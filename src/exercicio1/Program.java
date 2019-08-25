package exercicio1;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args)
	{
		MatRand randMat = new MatRand();
		MatUsr usr = new MatUsr();
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Precione:\n [1]Para a função com random\n [2]Para digitar os valores inteiros da matriz:");
			int op = sc.nextInt();
			
			if(op == 1)
			{
				randMat.Rand();
			}
			else if(op == 2)
			{
				usr.UsrInput();
			}
			else
			{
				System.out.println("Opção inválida");
			}
			
		sc.close();
	}
}
