package br.com.alura.microservice.loja.controller.dto;

import java.util.List;

public class CompraDTO {

	
	private List<ItemDaCompraDTO> itens;
	
	public List<ItemDaCompraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCompraDTO> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	private EnderecoDTO endereco;
}
