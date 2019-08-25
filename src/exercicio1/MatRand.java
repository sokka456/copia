package exercicio1;

import java.util.Random;

public class MatRand 
{
	public void Rand()
	{
		Random rand = new Random();
		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		int[][] aux = new int[3][3];
		System.out.println("Matriz 1:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print((mat1[i][j] = rand.nextInt(10)) + " | "); 
			}
		}
		System.out.println("\n\nMatriz 2:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print((mat2[i][j] = rand.nextInt(10)) + " | "); 
			}
		}
		System.out.println("\n\nSoma das Matrizes:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print((aux[i][j] = mat1[i][j] + mat2[i][j]) + " | "); 
			}
		}
	}
}