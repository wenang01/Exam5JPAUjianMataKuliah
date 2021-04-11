package com.kuliah.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kuliah.main.entity.Pertanyaan;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.repository.PertanyaanRepository;

public interface ModelUjianInterface {
	
	public List<Pertanyaan> getAllPertanyaan();
	public Soal getSoalById(String id);
	
}
