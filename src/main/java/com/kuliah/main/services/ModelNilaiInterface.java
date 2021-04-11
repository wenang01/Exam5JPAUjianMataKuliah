package com.kuliah.main.services;

import com.kuliah.main.entity.Nilai;
import com.kuliah.main.entity.Soal;

public interface ModelNilaiInterface {

	public Nilai addNilai(Nilai nilai);
	public Nilai getNilaiById(String id);
	
}
