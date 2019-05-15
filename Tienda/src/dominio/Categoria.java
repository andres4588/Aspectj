package dominio;

public class Categoria {
	private Integer id;
	private String nombre;
	private String descripcion;

	public Categoria() {
	}

	public Categoria(Integer id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		if (id <= 0) {
			throw new IllegalArgumentException("el valor no puede ser menor o igual a 0");
		}

		if (id == null) {
			throw new NullPointerException("no puede ser null");
		}

		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre.equals("")) {
			throw new IllegalArgumentException("el campo nombre no puede estar vacio");
		}

		if (nombre == null) {
			throw new NullPointerException("el campo nombre no puede ser null");
		}
		if (nombre.length() < 3) {
			throw new IllegalArgumentException("el nombre no debe tener menos de 3 caracteres");
		}

		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}