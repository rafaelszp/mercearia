package com.example.mercearia;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(VendaService.class)
public class VendaServiceBean implements VendaService {
	
	
	@Inject
	@Reference
	PessoaService pessoaService;

	@Override
	public Resposta realizarVenda(Venda venda) {

		Resposta resposta = new Resposta();
		try{ 
			
			if(venda.getValor()<=0.0){
				throw new ValorVendaInvalidoException();
			}
			
			if(venda.getPessoa().getIdade()<18){
				throw new VendaProibidaParaMenoresException();
			}else{
				pessoaService.gravar(venda.getPessoa());
			}
		
			System.out.println("venda realizada");
			
			resposta.setMsg("Venda Realizada");
			resposta.setError(false);
		}catch(Exception e){
			resposta.setError(true);
			resposta.setMsg(e.getMessage());
		}
		return resposta;
		
	}

	@Override
	public Venda obterTodas() {
		Venda venda = new Venda();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rafael");
		pessoa.setIdade(32);
		venda.setPessoa(pessoa);
		venda.setValor(1000.0);
		return venda;
	}

}
