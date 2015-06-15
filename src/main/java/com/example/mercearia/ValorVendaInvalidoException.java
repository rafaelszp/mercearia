package com.example.mercearia;

public class ValorVendaInvalidoException extends Exception {

	@Override
	public String getMessage() {
		
		return "VALOR DA VENDA INVÁLIDO";
	}
	
	

}
