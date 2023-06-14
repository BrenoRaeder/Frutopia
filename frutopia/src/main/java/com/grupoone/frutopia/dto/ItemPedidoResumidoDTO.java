package com.grupoone.frutopia.dto;

public class ItemPedidoResumidoDTO {

	private Integer id;
	private String nome;
	private Integer quantidade;
	private Double precoVenda;
	
	public ItemPedidoResumidoDTO() {
		super();
	}
	public ItemPedidoResumidoDTO(Integer id, String nome, Integer quantidade, Double precoVenda) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoVenda = precoVenda;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}	
}
