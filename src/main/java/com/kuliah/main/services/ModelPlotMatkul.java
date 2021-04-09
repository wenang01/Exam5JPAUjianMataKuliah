package com.kuliah.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.repository.PlotMataKuliahRepository;
import com.kuliah.main.repository.SoalRepository;

@Service
public class ModelPlotMatkul implements ModelPlotMatkulInterface{

	@Autowired
	PlotMataKuliahRepository plotMataKuliahRepository;
	
	@Override
	public List<PlotMataKuliah> getAllPlotMatkul() {
		// TODO Auto-generated method stub
		return (List<PlotMataKuliah>) this.plotMataKuliahRepository.findAll();
	}

	@Override
	public PlotMataKuliah getPlotMatkulById(String id) {
		// TODO Auto-generated method stub
		return this.plotMataKuliahRepository.findById(Long.parseLong(id));
	}

	public PlotMataKuliah addPlotMatkul(PlotMataKuliah plotMatkul) {
		// TODO Auto-generated method stub
		return this.plotMataKuliahRepository.save(plotMatkul);
	}
	
	@Override
	public void deletePlotMatkul(String id) {
		// TODO Auto-generated method stub
		this.plotMataKuliahRepository.deleteById(Long.parseLong(id));
		
	}
	
	
}
