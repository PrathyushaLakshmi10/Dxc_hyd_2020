package com.dxc.SpringSecurity.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dxc.SpringSecurity.dao.CinemaDAO;
import com.dxc.SpringSecurity.entity.Cinema;
@Service
public class CinemaService
{
	
	@Autowired
	CinemaDAO cinemadao;
	public List<Cinema> getAllCinemas() {
		return this.cinemadao.findAll();
	}
	
	public Cinema addCinema(Cinema cinema) {
		return this.cinemadao.save(cinema);
	}
	
	// Optional is a Container object which may or may not contain non null values
	public Optional <Cinema> getCinemaById(int id ) {
		return this.cinemadao.findById(id);
	}
	
	public Cinema updateCinema(Cinema cinema) {
		return this.cinemadao.save(cinema);
	}
	
	public void deleteCinemaById(int id) {
		this.cinemadao.deleteById(id);
	}
	
	public void deleteAllCinemas() {
		this.cinemadao.deleteAll();
	}
}
