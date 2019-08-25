package exercicio1;

import java.util.Scanner;

public class MatUsr 
{
	public void UsrInput()
	{
		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		int[][] aux = new int[3][3];
		Scanner sc = new Scanner(System.in);
			System.out.println("Números inteiros apenas!\n");
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					System.out.println("Matriz 1 [" + i + "][" + j + "]");
					mat1[i][j] = sc.nextInt();
				}
			}
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					System.out.println("Matriz 2 [" + i + "][" + j + "]");
					mat2[i][j] = sc.nextInt();
				}
			}
			System.out.println("\nMatriz 1:");
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					System.out.print(mat1[i][j] + " | ");
				}
			}
			System.out.println("\n\nMatriz 2:");
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					System.out.print(mat2[i][j] + " | ");
				}
			}
			System.out.println("\n\nSoma das matrizes:");
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					System.out.print((aux[i][j] = mat1[i][j] + mat2[i][j]) + " | ");
				}
			}
		sc.close();
	}
}
