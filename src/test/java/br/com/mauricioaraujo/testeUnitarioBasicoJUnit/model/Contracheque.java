package br.com.mauricioaraujo.testeUnitarioBasicoJUnit.model;

import br.com.mauricioaraujo.TesteUnitarioBasicoJUnit.util.Teclado;

public class Contracheque {

	private String nome;
	private double salarioBruto;
	private double salarioLiquido;
	private double totalDescontos;
	
	// Método construtor personalizado
	public Contracheque(String nome , double salarioBruto , double totalDescontos) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto ;
		this.totalDescontos = totalDescontos;
		this.salarioLiquido = this.salarioBruto - this.totalDescontos;
	}
	
	// Método questionario
	public static Contracheque questionario() {
		String nome = Teclado.lerTexto("Informe o nome do funcionário: ");
		double sb = Teclado.lerDouble("Informe o salário bruto do funcionário: ");
		double td = Teclado.lerDouble("Informe o total de descontos: ");
		Contracheque cc = new Contracheque(nome, sb , td);
		return cc;
	}
	
	public void relatorio() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Funcionário: "+this.getNome()); // this.nome
		System.out.println("Salário Bruto: R$ " + this.getSalarioBruto()); // this.salarioBruto
		System.out.println("Total de Descontos: R$ " + this.getTotalDescontos()); // this.totalDescontos
		System.out.println("Salário Líquido: R$ " + this.getSalarioLiquido()); // this.salarioLiquido
		System.out.println("--------------------------------------------------------------");
	}
	
	public Contracheque() {
		super();
	}


	public Contracheque(String nome, double salarioBruto, double salarioLiquido, double totalDescontos) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.salarioLiquido = salarioLiquido;
		this.totalDescontos = totalDescontos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalarioBruto() {
		return salarioBruto;
	}


	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}


	public double getSalarioLiquido() {
		return salarioLiquido;
	}


	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}


	public double getTotalDescontos() {
		return totalDescontos;
	}


	public void setTotalDescontos(double totalDescontos) {
		this.totalDescontos = totalDescontos;
	}
	
	
	
}
