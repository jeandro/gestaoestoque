package com.gestaoestoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String contato;

	@Column(nullable = false)
	private String endereco;
}