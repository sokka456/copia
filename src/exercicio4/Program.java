package exercicio4;

import java.util.ArrayList;
import java.util.Random;

public class Program 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int par=0, impar=0;
		
		for(int i=0; i<20; i++)
		{
			lista.add(rand.nextInt(100));
			
			if((lista.get(i)%2) == 0)
			{
				par += 1;
			}
			else if((lista.get(i)%2) != 0)
			{
				impar += 1;
			}
		}
		System.out.println("Lista: \n" + lista.toString());
		System.out.println("Par: " + par);
		System.out.println("Inpar: " + impar);
	}

}
