package br.com.mauricioaraujo.TesteUnitarioBasicoJUnit.controller;

import br.com.mauricioaraujo.TesteUnitarioBasicoJUnit.model.Contracheque;

public class Emissao {

	public static void main(String[] args) {
		
	Contracheque contracheque = Contracheque.questionario();
	contracheque.relatorio();
		
	}
}