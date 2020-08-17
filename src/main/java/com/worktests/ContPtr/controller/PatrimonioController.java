package com.worktests.ContPtr.controller;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.worktests.ContPtr.entity.Patrimonio;
import com.worktests.ContPtr.service.PatrimonioService;


@Controller
@RequestMapping(value="/patrimonios")
public class PatrimonioController {

	@Autowired
	private PatrimonioService patrimonioService;
	
	
	// LISTAGEM DE PATRIMONIOS (GET)
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Patrimonio>> findAll() {
		List<Patrimonio> list = patrimonioService.listarPatrimonios();
		return ResponseEntity.ok().body(list);
	}
	
	// MOSTRAR PATRIMONIO (GET) pelo id
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Patrimonio> findById(@PathVariable Integer id) {
		Patrimonio patrimonio = patrimonioService.buscarPatrimonio(id);
		return ResponseEntity.ok().body(patrimonio);
	}
	
	// CADASTRO DE PATRIMONIO (POST)
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Patrimonio patrimonio){
		patrimonioService.cadastrarPatrimonio(patrimonio);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(patrimonio.getNumeroDoTombo()).toUri();			
		return ResponseEntity.created(uri).build();
	}
	
	// ATUALIZACAO DE PATRIMONIO (PUT)
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid  @RequestBody Patrimonio patrimonio, @PathVariable Integer id){
		patrimonioService.atualizarPatrimonio(patrimonio, id);
		return ResponseEntity.noContent().build();
	}
	
	// EXCLUSÃO DE PATRIMONIO (DELETE)
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		patrimonioService.excluirPatrimonio(id);
		return ResponseEntity.noContent().build();
	}
	
}
