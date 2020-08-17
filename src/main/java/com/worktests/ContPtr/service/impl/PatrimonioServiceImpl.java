package com.worktests.ContPtr.service.impl;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.worktests.ContPtr.entity.Patrimonio;
import com.worktests.ContPtr.service.PatrimonioService;
import com.worktests.ContPtr.repository.PatrimonioRepository;


@Service
public class PatrimonioServiceImpl implements PatrimonioService {
	
	@Autowired
	PatrimonioRepository patrimonioRepository;
	
	@Override
	public List<Patrimonio> listarPatrimonios() {
		return this.patrimonioRepository.findAll();	
	}
	
	@Override
	public Patrimonio buscarPatrimonio(long id) {
		return this.patrimonioRepository.findById(id);
	}

	@Override
	public void cadastrarPatrimonio(@Valid Patrimonio patrimonio) {
		patrimonioRepository.save(patrimonio);
	}

	@Override
	public void atualizarPatrimonio(@Valid Patrimonio patrimonio, long id) {
		Patrimonio patrimonioUpdate = patrimonioRepository.findById(id);		
		if(patrimonioUpdate != null) {
			patrimonioUpdate.setNome(patrimonio.getNome());
			patrimonioUpdate.setMarcaId(patrimonio.getMarcaId());
			patrimonioUpdate.setDescricao(patrimonio.getDescricao());
			patrimonioRepository.save(patrimonioUpdate);
		}
	}
	
	@Override
	public void excluirPatrimonio(long id) {
		if(this.patrimonioRepository.findById(id) != null) {
			this.patrimonioRepository.deleteById(id);
		}
	}
	
}
