package com.example.mercearia;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Venda {
	
	private double valor;
	private Pessoa pessoa;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
