package com.kuliah.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.services.ModelDosen;
import com.kuliah.main.services.ModelMahasiswa;
import com.kuliah.main.services.ModelMataKuliah;
import com.kuliah.main.services.ModelPertanyaan;
import com.kuliah.main.services.ModelPlotMatkul;
import com.kuliah.main.services.ModelSoal;

@Controller
public class PagePlotMatkul {

	@Autowired
	ModelPlotMatkul modelPlotMatkul;
	
	@Autowired
	ModelSoal modelSoal;
	
	@Autowired
	ModelDosen modelDosen;
	
	@Autowired
	ModelMahasiswa modelMahasiswa;
	
	@Autowired
	ModelMataKuliah modelMataKuliah;
	
	@GetMapping("/plotmatkul/view")
	public String viewIndexSoal(Model model) {
		
		model.addAttribute("listPlotMatkul",modelPlotMatkul.getAllPlotMatkul());
		model.addAttribute("active",7);
		return "view_plot_matkul";
	}
	
	
	@GetMapping("/plotmatkul/add")
	public String viewAddPlotMatkul(Model model) {
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("plot_mata_kuliah",new PlotMataKuliah());
		model.addAttribute("lstSoal",modelSoal.getAllSoal());
		model.addAttribute("listDosen",modelDosen.getAllDosen());
		model.addAttribute("listMataKuliah",modelMataKuliah.getAllMataKuliah());
		model.addAttribute("listMahasiswa",modelMahasiswa.getAllMahasiswa());
		model.addAttribute("listPlotMatkul", modelPlotMatkul.getAllPlotMatkul());
		
		return "add_plot_matkul";
	}
	
	@PostMapping("/plotmatkul/view")
	  public String addPlotMatkul(@ModelAttribute PlotMataKuliah plotMatkul, Model model) {
		
		// buat penampung data Soal di halaman htmlnya
		this.modelPlotMatkul.addPlotMatkul(plotMatkul);
		model.addAttribute("listPlotMatkul",modelPlotMatkul.getAllPlotMatkul());
				
		
		return "redirect:/plotmatkul/view";
	}
	
	
	@GetMapping("/plotmatkul/update/{id}")
	public String viewUpdatePlotMatkul(@PathVariable String id, Model model) {
		
		PlotMataKuliah plotMatkul = modelPlotMatkul.getPlotMatkulById(id);
		model.addAttribute("lstSoal",modelSoal.getAllSoal());
		model.addAttribute("listDosen",modelDosen.getAllDosen());
		model.addAttribute("listMataKuliah",modelMataKuliah.getAllMataKuliah());
		model.addAttribute("listMahasiswa",modelMahasiswa.getAllMahasiswa());
		model.addAttribute("listPlotMatkul", modelPlotMatkul.getAllPlotMatkul());
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("plot_mata_kuliah",plotMatkul);
		
		return "add_plot_matkul";
	}
	

	@GetMapping("/plotmatkul/delete/{id}")
	public String deletePlotMatkul(@PathVariable String id, Model model) {
		
		this.modelPlotMatkul.deletePlotMatkul(id);
		model.addAttribute("listPlotMatkul",modelPlotMatkul.getAllPlotMatkul());
		
		
		return "redirect:/plotmatkul/view";
	}
	
}
