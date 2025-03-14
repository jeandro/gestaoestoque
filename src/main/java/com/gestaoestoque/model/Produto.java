package com.gestaoestoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private Integer quantidade;

	@Column(nullable = false)
	private Double preco;

	@Column(nullable = false)
	private Integer quantidadeMinima;

	@Column(nullable = false)
	private Integer quantidadeMaxima;
}