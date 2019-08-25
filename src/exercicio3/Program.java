package exercicio3;

import java.io.FileInputStream;
import java.io.FileReader;

public class Program 
{

	public static void main(String[] args) //throws Exception
	{
		try
		{
			FileInputStream file = new FileInputStream("/home/grievon/Documentos/Exercicios_Ivan/src/exercicio3/E_Agora.txt");
			int cont = 0;
			FileReader line;
			while(file.read() != -1)
			{
				line = new FileReader(file.toString().toUpperCase());
				
				if(line.equals("A") || line.equals("E") || line.equals("I") || line.equals("O") || line.equals("U"))
				{
					cont += 1;
				}
				else if(line.equals("Á") || line.equals("É") || line.equals("Í") || line.equals("Ó") || line.equals("Ú"))
				{
					cont += 1;
				}
			}
			
			System.out.println("Quantidade de vogáis: " + cont);
			
			file.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}