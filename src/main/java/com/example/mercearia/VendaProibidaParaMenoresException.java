package com.example.mercearia;

public class VendaProibidaParaMenoresException extends Exception {

	
	@Override
	public String getMessage() {
		
		return "NAO É PERMITIDO VENDER PARA MENORES";
	}
}
