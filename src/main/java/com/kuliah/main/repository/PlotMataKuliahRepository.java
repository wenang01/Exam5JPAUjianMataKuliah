package com.kuliah.main.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kuliah.main.entity.PlotMataKuliah;

public interface PlotMataKuliahRepository extends CrudRepository<PlotMataKuliah, Long> {

	public PlotMataKuliah findById(long id);
	
}
