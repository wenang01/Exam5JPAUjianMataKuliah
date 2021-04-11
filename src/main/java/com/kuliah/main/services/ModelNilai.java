package com.kuliah.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuliah.main.entity.Nilai;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.repository.NilaiRepository;

@Service
public class ModelNilai implements ModelNilaiInterface{

	@Autowired
	NilaiRepository nilaiRepository;
	
	@Override
	public Nilai addNilai(Nilai nilai) {
		// TODO Auto-generated method stub
		return this.nilaiRepository.save(nilai);
	}

	@Override
	public Nilai getNilaiById(String id) {
		// TODO Auto-generated method stub
		return (Nilai)this.nilaiRepository.findById(Long.parseLong(id)).get();
	}

	
}
