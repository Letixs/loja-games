package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "*Campo Obrigatório")
	@Size(min = 2, max = 150, message = "Mínimo de 2 e máximo de 150 caracteres")
	private String nome;
	
	@Size(min = 2, max = 800, message = "Mínimo de 2 e máximo de 800 caracteres")
	private String descricao;
	
	@NotBlank(message = "*Campo Obrigatório")
	@Size(min = 2, max = 60, message = "Mínimo de 2 e máximo de 60 caracteres")
	private String console;
	
	@Positive
	@Digits(integer = 5, fraction = 2, message = "*Limite ultrapassado")
	@NotNull(message = "*Campo Obrigatório")
	private BigDecimal preco;
	
	@PositiveOrZero
	@NotNull(message = "*Campo Obrigatório")
	private int quantidade;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dataLancamento;
	
	private String foto;
	
	private boolean curtir;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public boolean isCurtir() {
		return curtir;
	}

	public void setCurtir(boolean curtir) {
		this.curtir = curtir;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
