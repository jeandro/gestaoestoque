package com.gestaoestoque.service;

import com.gestaoestoque.model.Produto;
import com.gestaoestoque.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;

	public ProdutoService(final ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	

	public List<Produto> listarTodos() {
		return produtoRepository.findAll();
	}

	public Optional<Produto> buscarPorId(Long id) {
		return produtoRepository.findById(id);
	}

	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}

	public void excluir(Long id) {
		produtoRepository.deleteById(id);
	}
}