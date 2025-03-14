package com.gestaoestoque.service;

import com.gestaoestoque.model.Fornecedor;
import com.gestaoestoque.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

	private final FornecedorRepository fornecedorRepository;

	public FornecedorService(final FornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
	}


	public List<Fornecedor> listarTodos() {
		return fornecedorRepository.findAll();
	}

	public Optional<Fornecedor> buscarPorId(Long id) {
		return fornecedorRepository.findById(id);
	}

	public Fornecedor salvar(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

	public void excluir(Long id) {
		fornecedorRepository.deleteById(id);
	}
}