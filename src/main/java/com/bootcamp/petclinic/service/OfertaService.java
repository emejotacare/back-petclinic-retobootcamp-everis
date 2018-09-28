package com.bootcamp.petclinic.service;

import java.util.List;
import java.util.Optional;

import com.bootcamp.petclinic.entity.Oferta;

public interface OfertaService {
	
	Optional<Oferta> findById(int id);
	
	List<Oferta> findAll();
	
	Oferta saveOferta(Oferta ofertaCurrent);
	
	void deleteOferta(int id);

}
