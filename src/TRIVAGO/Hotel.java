package TRIVAGO;

public class Hotel {
private int id;
private String Cif;
private String Nombre;
private String Gerente;
private int Estrellas;
private String Compa�ia;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCif() {
	return Cif;
}
public void setCif(String cif) {
	Cif = cif;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getGerente() {
	return Gerente;
}
public void setGerente(String gerente) {
	Gerente = gerente;
}
public int getEstrellas() {
	return Estrellas;
}
public void setEstrellas(int estrellas) {
	Estrellas = estrellas;
}
public String getCompa�ia() {
	return Compa�ia;
}
public void setCompa�ia(String compa�ia) {
	Compa�ia = compa�ia;
}
@Override
public String toString() {
	return "Hoteles [id=" + id + ", Cif=" + Cif + ", Nombre=" + Nombre + ", Gerente=" + Gerente + ", Estrellas="
			+ Estrellas + ", Compa�ia=" + Compa�ia + "]";
}

}
