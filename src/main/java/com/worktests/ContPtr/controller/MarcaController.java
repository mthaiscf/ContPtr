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

import com.worktests.ContPtr.service.MarcaService;
import com.worktests.ContPtr.entity.Marca;


@Controller
@RequestMapping(value="/marca")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;

	// LISTAGEM DE MARCAS (GET)
	@RequestMapping(value="/{listar}", method=RequestMethod.GET)
	public ResponseEntity<List<Marca>> findAll() {
		List<Marca> list = marcaService.listarMarcas();
		return ResponseEntity.ok().body(list);
	}
	
	// MOSTRAR MARCA (GET) pelo id
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Marca> findById(@PathVariable Integer id) {
		Marca marca = marcaService.buscarMarca(id);
		return ResponseEntity.ok().body(marca);
	}
	
	// CADASTRO DE MARCA (POST)
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Marca marca){
		marcaService.cadastrarMarca(marca);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(marca.getId()).toUri();			
		return ResponseEntity.created(uri).build();
	}
	
	// ATUALIZACAO DE MARCA (PUT)
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid  @RequestBody Marca marca, @PathVariable Integer id){
		marcaService.atualizarMarca(marca, id);
		return ResponseEntity.noContent().build();
	}
	
	// EXCLUSÃO DE MARCA (DELETE)
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		marcaService.excluirMarca(id);
		return ResponseEntity.noContent().build();
	}
	

}
