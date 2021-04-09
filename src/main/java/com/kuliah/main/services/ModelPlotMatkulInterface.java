package com.kuliah.main.services;

import java.util.List;

import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;

public interface ModelPlotMatkulInterface {

	public List<PlotMataKuliah> getAllPlotMatkul();
	public PlotMataKuliah getPlotMatkulById(String id);
	void deletePlotMatkul(String id);

}
