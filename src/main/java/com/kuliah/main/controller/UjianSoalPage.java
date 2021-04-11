package com.kuliah.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kuliah.main.entity.Nilai;
import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.services.ModelNilai;
import com.kuliah.main.services.ModelPertanyaan;
import com.kuliah.main.services.ModelPlotMatkul;
import com.kuliah.main.services.ModelSoal;

@Controller
public class UjianSoalPage {

	@Autowired
	ModelSoal modelSoal;
	
	@Autowired
	ModelPertanyaan modelPertanyaan;
	
	@Autowired
	ModelPlotMatkul modelPlotMatkul;
	
	@Autowired
	ModelNilai modelNilai;
	
	@GetMapping("/ujian/{id}")
	public String viewIndexUjian(@PathVariable String id, Model model) {
		PlotMataKuliah plotMatkul = modelPlotMatkul.getPlotMatkulById(id);
		Soal soal = modelSoal.getSoalById(id);
		model.addAttribute("listSoal", modelSoal.getSoalById(id));
		model.addAttribute("lstPertanyaan",modelPertanyaan.getAllPertanyaan());
		model.addAttribute("active",8);
		return "view_ujian";
	}
	
	@PostMapping("/ujian/hasil/")
	  public String addNilai(@ModelAttribute Nilai nilai, String id, Model model) {

		this.modelNilai.addNilai(nilai);
		model.addAttribute("listNilai",modelNilai.getNilaiById(id));
	
		return "redirect:/ujian/hasil";
	}

	
}
