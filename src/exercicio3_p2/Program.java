package exercicio3_p2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) throws ParseException 
	{
		SimpleDateFormat data =  new SimpleDateFormat("dd/MM/yyyy");
		Date birth = new Date();
		Scanner sc =  new Scanner(System.in);
			
			System.out.println("Digite a data de nascimento: dd/MM/AAAA ");
			String teste = sc.next();
			birth = data.parse(teste);
			System.out.println(birth);
			teste = data.format(birth);
			
			if(teste.substring(0,3).contentEquals("Fri"))
			{
				System.out.println("Sexta-feira");
			}
			else if(teste.substring(0,3).contentEquals("Mon"))
			{
				System.out.println("Segunda-feira");
			}
			else if(teste.substring(0,3).contentEquals("Tue"))
			{
				System.out.println("Terça-feira");
			}
			else if(teste.substring(0,3).contentEquals("Wed"))
			{
				System.out.println("Quarta-feira");
			}
			else if(teste.substring(0,3).contentEquals("Thu"))
			{
				System.out.println("Quinta-feira");
			}
			else if(teste.substring(0,3).contentEquals("Sat"))
			{
				System.out.println("Sábado");
			}
			else if(teste.substring(0,3).contentEquals("Sun"))
			{
				System.out.println("Domingo");
			}
		sc.close();
		
	}
}
