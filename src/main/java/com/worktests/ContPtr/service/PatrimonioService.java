package com.worktests.ContPtr.service;

import java.util.List;
import javax.validation.Valid;
import com.worktests.ContPtr.entity.Patrimonio;


public interface PatrimonioService {
	
	List<Patrimonio> listarPatrimonios();
	
	Patrimonio buscarPatrimonio(long id);

	void cadastrarPatrimonio(@Valid Patrimonio patrimonio);

	void atualizarPatrimonio(@Valid Patrimonio patrimonio, long id);
	
	void excluirPatrimonio(long id);
	
}
