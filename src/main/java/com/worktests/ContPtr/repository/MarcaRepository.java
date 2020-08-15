package com.worktests.ContPtr.repository;


import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.worktests.ContPtr.entity.Marca;


@Repository
public interface MarcaRepository extends CrudRepository	<Marca, Long>{

	List<Marca> findAll();

	Marca findById(long id);
}