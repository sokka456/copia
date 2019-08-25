package exercicio2_p2;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			System.out.print("scolha a quantidade: ");
			int qtde = sc.nextInt();
			int aux = 0;
			int[][] mat = new int[qtde][qtde];
			for(int i=0; i<qtde; i++)
			{
				aux ++;
				for(int j=0; j<aux; j++)
				{
					if(aux <10)
					{
						System.out.print("0" + (mat[i][j] = aux) + " ");
					}
					else
					{
						System.out.print((mat[i][j] = aux) + " ");
					}
				}
				System.out.println("\n");
			}
		sc.close();
	}
}
