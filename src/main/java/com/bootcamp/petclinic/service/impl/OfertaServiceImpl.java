package com.bootcamp.petclinic.service.impl;

import org.springframework.stereotype.Service;

import com.bootcamp.petclinic.service.OfertaService;

@Service
public class OfertaServiceImpl implements OfertaService{ 
	
	@Autowired
	private OfertaRepository ofertaRepo;

	public OfertaServiceImpl() {
		// TODO Auto-generated constructor stub
	}

}
