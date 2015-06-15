package com.example.mercearia;

import org.switchyard.component.bean.Service;

@Service(PessoaService.class)
public class PessoaServiceBean implements PessoaService {

	@Override
	public void gravar(Pessoa pessoa) {

		if(pessoa.getIdade()<18){
			System.out.println("BEAN : menor de idade");
		}else{
			System.out.println("BEAN : maior de idade");
		}
		
	}

}
