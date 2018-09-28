package com.bootcamp.petclinic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.petclinic.entity.Oferta;
import com.bootcamp.petclinic.repository.OfertaRepository;
import com.bootcamp.petclinic.service.OfertaService;

@Service
public class OfertaServiceImpl implements OfertaService{ 
	
	@Autowired
	private OfertaRepository ofertaRepo;
	
	public Optional<Oferta> findById(int id) {
		return this.ofertaRepo.findById(id);
	}
	
	public List<Oferta> findAll() {
		return this.ofertaRepo.findAll();
	}
	
	public Oferta saveOferta(Oferta oferta) {
		return this.ofertaRepo.save(oferta);
	}

	public void deleteOferta(int id) {
		this.ofertaRepo.deleteById(id);
	}

	
	
}
