package exercicio6;

public class Pessoa 
{
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public String getNome()
	{
		return this.nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public int getIdade()
	{
		return this.idade;
	}
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	public double getAltura()
	{
		return this.altura;
	}
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
	public double getPeso()
	{
		return this.peso;
	}
	public void setPeso(double peso)
	{
		this.peso = peso;
	}
	
	public void InfoPessoa()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
	}
	
	public double Imc()
	{
		return (this.altura * 2)/this.peso;
	}
}
