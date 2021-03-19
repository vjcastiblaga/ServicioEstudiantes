package co.edu.poli.materias.servicio;

import java.util.List;


import co.edu.poli.materias.dto.MateriasDTO;


public interface MateriasService {
	
	public List<MateriasDTO> findALL();
	
	public MateriasDTO guardarMateria(MateriasDTO materiasDTO);
	
	public MateriasDTO editarMateria(MateriasDTO materiasDTO);
	
		
	

}
