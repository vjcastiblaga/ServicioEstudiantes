package co.edu.poli.materias.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.materias.dto.MateriasDTO;
import co.edu.poli.materias.entidades.Materias;
import co.edu.poli.materias.repositorios.MateriasRepository;
import co.edu.poli.materias.servicio.MateriasService;

@Service
public class MateriasServiceImpl implements MateriasService {

	@Autowired
	private MateriasRepository repo;

	@Override
	public List<MateriasDTO> findALL() {

		List<MateriasDTO> lstMaterias = new ArrayList<MateriasDTO>();
		MateriasDTO m;
		List<Materias> lstTemp = (List<Materias>) repo.findAll();

		for (Materias ma : lstTemp) {

			m = new MateriasDTO();
			m.setid_Materia(ma.getid_Materia());
			m.setMateria(ma.getMateria());
			m.setNombre_profesor(ma.getNombre_profesor());
			m.setApellido_profesor(ma.getApellido_profesor());
			m.setCiclo(ma.getCiclo());
			m.setJornada(ma.getJornada());
			lstMaterias.add(m);

		}

		return lstMaterias;
	}

	@Override
	public MateriasDTO guardarMateria(MateriasDTO materiasDTO) {

		Materias materias = new Materias();

		materias.setMateria(materiasDTO.getMateria());
		materias.setNombre_profesor(materiasDTO.getNombre_profesor());
		materias.setApellido_profesor(materiasDTO.getApellido_profesor());
		materias.setCiclo(materiasDTO.getCiclo());
		materias.setJornada(materiasDTO.getJornada());

		repo.save(materias);

		return materiasDTO;
	}

	@Override
	public MateriasDTO editarMateria(MateriasDTO materiasDTO) {

		Materias materias = new Materias();
		
		materias.setid_Materia(materiasDTO.getId_Materia());
		materias.setMateria(materiasDTO.getMateria());
		materias.setNombre_profesor(materiasDTO.getNombre_profesor());
		materias.setApellido_profesor(materiasDTO.getApellido_profesor());
		materias.setCiclo(materiasDTO.getCiclo());
		materias.setJornada(materiasDTO.getJornada());

		repo.save(materias);

		return materiasDTO;
	}

}
