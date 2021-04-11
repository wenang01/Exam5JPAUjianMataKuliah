package com.kuliah.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuliah.main.entity.Pertanyaan;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.repository.PertanyaanRepository;
import com.kuliah.main.repository.SoalRepository;

@Service
public class ModelUjian implements ModelUjianInterface{

	@Autowired
	PertanyaanRepository pertanyaanRepository;
	
	@Autowired
	SoalRepository soalRepository;
	
	@Override
	public List<Pertanyaan> getAllPertanyaan() {
		// TODO Auto-generated method stub
		return (List<Pertanyaan>) this.pertanyaanRepository.findAll();
	}

	@Override
	public Soal getSoalById(String id) {
		// TODO Auto-generated method stub
//		return this.soalRepository.findById(Long.parseLong(id));
		return (Soal) this.soalRepository.findById(Long.parseLong(id)).get();
	}

	
	
}
