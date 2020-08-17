package com.worktests.ContPtr.repository;


import java.util.List;
import org.springframework.stereotype.Repository;
import com.worktests.ContPtr.entity.Patrimonio;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PatrimonioRepository extends CrudRepository<Patrimonio, Long> {
	
	List<Patrimonio> findAll();

	Patrimonio findById(long id);
	
}
