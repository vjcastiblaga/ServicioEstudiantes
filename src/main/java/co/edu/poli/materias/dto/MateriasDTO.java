package co.edu.poli.materias.dto;




public class MateriasDTO {

	
	private Long id_Materia;
	private String materia;
	private String nombre_profesor;
	private String apellido_profesor;
	private String ciclo;
	private String jornada;

	public MateriasDTO() {

	}

	public Long getId_Materia() {
		return id_Materia;
	}

	public void setid_Materia(Long id_Materia) {
		this.id_Materia = id_Materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getNombre_profesor() {
		return nombre_profesor;
	}

	public void setNombre_profesor(String nombre_profesor) {
		this.nombre_profesor = nombre_profesor;
	}

	public String getApellido_profesor() {
		return apellido_profesor;
	}

	public void setApellido_profesor(String apellido_profesor) {
		this.apellido_profesor = apellido_profesor;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

}
