package exercicio1_p2;

import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;

public class Program 
{
	public static void main(String[] args) 
	{
		//BufferedReader br = null;
		try
		{
			//br = new BufferedReader(new FileReader("/home/grievon/Documentos/Exercicios_Ivan/src/exercicio1_p2/filial.txt"));
			ArrayList<String> lista = new ArrayList<String>();
			FileInputStream fls = new FileInputStream("D:\\clonar\\JavaWeb\\src\\exercicio1_p2\\filial.txt");
			FileReader line = null;
			
			/*
			while(br.read() != -1)
			{
				lista.add(br.readLine().toString());
			}
			*/
			
			while(fls.read() != -1)
			{
				line = new FileReader(fls.toString());
			}
			
			System.out.println(line.toString());
			System.out.print(lista);
			fls.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage() + "\n");
			ex.printStackTrace();
		}
	}

}
