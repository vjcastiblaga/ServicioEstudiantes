package co.edu.poli.materias.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.materias.dto.MateriasDTO;
import co.edu.poli.materias.servicio.MateriasService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/api")
public class MateriasRestController {

	@Autowired
	private MateriasService service;

	@GetMapping("/materias")
	public List<MateriasDTO> getMaterias() {
		return service.findALL();
	}

	@PostMapping("/add")
	public MateriasDTO guardarMateria(@RequestBody MateriasDTO materiasDTO) {		
		
		return service.guardarMateria(materiasDTO);
	}
	
	@PutMapping("/edit")
	public MateriasDTO editarMateria(@RequestBody MateriasDTO materiasDTO) {		
			
		return service.editarMateria(materiasDTO);
	}
	

}
