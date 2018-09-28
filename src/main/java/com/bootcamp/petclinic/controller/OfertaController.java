package com.bootcamp.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.petclinic.entity.Oferta;
import com.bootcamp.petclinic.service.OfertaService;

@RestController
@RequestMapping("/api")
public class OfertaController {
	
	@Autowired
	private OfertaService ofertaService;
	
	//Lista de usuarios
	@GetMapping("/ofertas")
		public List<Oferta> list(){
			return ofertaService.findAll();
	}
	
}
