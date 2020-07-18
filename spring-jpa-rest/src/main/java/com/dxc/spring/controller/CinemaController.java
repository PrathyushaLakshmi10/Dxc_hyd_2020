package com.dxc.spring.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dxc.spring.entity.Cinema;
import com.dxc.spring.service.CinemaService;
@RestController
@RequestMapping("/cinema")
public class CinemaController
{

		@Autowired
		CinemaService cinemaService;
		// http://localhost:8563/cinema/all
		@RequestMapping(value = "/all", method = RequestMethod.GET)
		public List<Cinema> getAllCinema() {
			return this.cinemaService.getAllCinemas();
		}
		// http://localhost:8563/cinema/addCinema
		@RequestMapping(value = "/addCinema", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public Cinema addCinema(@RequestBody Cinema cinema)
		{
			return this.cinemaService.addCinema(cinema);
		}
		// http://localhost:8563/cinema/updateCinema
		@RequestMapping(value = "/updateCinema", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public Cinema updateCinema(@RequestBody Cinema cinema) 
		{
			return this.cinemaService.updateCinema(cinema);
		}
		// http://localhost:8563/cinema/1
		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public Optional<Cinema> getCinema(@PathVariable int id) {
			return this.cinemaService.getCinemaById(id);
		}

		// http://localhost:8563/cinema/all
		@RequestMapping(value = "/all", method = RequestMethod.DELETE)
		public void deleteAllCinemas() {
			this.cinemaService.deleteAllCinemas();
		}

		// http://localhost:8563/cinema/1
		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
		public void deleteCinema(@PathVariable int id) {
			this.cinemaService.deleteCinemaById(id);
		}
		
		
		
}
