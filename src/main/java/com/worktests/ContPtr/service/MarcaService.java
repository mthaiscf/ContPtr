package com.worktests.ContPtr.service;

import java.util.List;
import javax.validation.Valid;
import com.worktests.ContPtr.entity.Marca;


public interface MarcaService {
	
	List<Marca> listarMarcas();
	
	Marca buscarMarca(long id);

	void cadastrarMarca(@Valid Marca marca);
	
	void atualizarMarca(@Valid Marca marca, long id);
	
	void excluirMarca(long id);
	
}
