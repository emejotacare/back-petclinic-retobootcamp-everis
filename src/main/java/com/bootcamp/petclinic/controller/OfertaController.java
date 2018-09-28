package com.bootcamp.petclinic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.bootcamp.petclinic.entity.Oferta;
import com.bootcamp.petclinic.service.OfertaService;

@RestController
@RequestMapping("/api")
public class OfertaController {
	
	@Autowired
	private OfertaService ofertaService;
	
	//Lista de ofertas
	@GetMapping("/ofertas")
		public List<Oferta> list(){
			return ofertaService.findAll();
	}
	
	//Nueva oferta
		@PostMapping("/ofertas")
		@ResponseStatus(HttpStatus.CREATED)
		public Oferta create(@RequestBody Oferta oferta) {
			return ofertaService.saveOferta(oferta);
		}
		
		/*Actualizar oferta
		@PutMapping("/ofertas/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public Oferta update(@RequestBody Oferta oferta, @PathVariable int id) {

			Optional<Oferta> ofertaCurrent = ofertaService.findById(id);
			
			if(ofertaCurrent.isPresent()) {
				Oferta ofertas = ofertaCurrent.get();
				ofertas.setDescuento(oferta.getDescuento());
				ofertas.setDetalle(oferta.getDetalle());
				ofertas.setFechaCaducidad(oferta.getFechaCaducidad());
				ofertas.setTitulo(oferta.getTitulo());
			}
			
			return ofertaService.saveOferta(ofertaCurrent);
		}
		*/
		
		//Eliminar oferta
		@DeleteMapping("/ofertas/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable int id) {
			ofertaService.deleteOferta(id);
		}
		
		
}
