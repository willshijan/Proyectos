package models;

public class DatosUbicacion {

	private String direccion;
	private String ciudad;
	private String pais;
	private String estado;

	public DatosUbicacion(String direccion, String ciudad, String pais, String estado) {

		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
		this.estado = estado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
