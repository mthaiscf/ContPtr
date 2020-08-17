package com.worktests.ContPtr.service.impl;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.worktests.ContPtr.entity.Marca;
import com.worktests.ContPtr.service.MarcaService;
import com.worktests.ContPtr.repository.MarcaRepository;


@Service
public class MarcaServiceImpl implements MarcaService {
	
	@Autowired
	MarcaRepository marcaRepository;
	
	@Override
	public List<Marca> listarMarcas() {
		return this.marcaRepository.findAll();	
	}
	
	@Override
	public Marca buscarMarca(long id) {
		return this.marcaRepository.findById(id);
	}

	@Override
	public void cadastrarMarca(@Valid Marca marca) {
		marcaRepository.save(marca);
	}

	@Override
	public void atualizarMarca(@Valid Marca marca, long id) {
		Marca marcaUpdate = marcaRepository.findById(id);		
		if(marcaUpdate != null) {
			marcaUpdate.setNome(marca.getNome());
			marcaRepository.save(marcaUpdate);
		}
	}
	
	@Override
	public void excluirMarca(long id) {
		if(this.marcaRepository.findById(id) != null) {
			this.marcaRepository.deleteById(id);
		}
	}
	
}
