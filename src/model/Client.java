public class Clientes{

//Atributos
private String nombre;
private String direccion;
private int telefono;
	
//Relaciones 
private Mascota masc1;
	
	public CLientes(String nombre, String direccion , int telefono, Mascota masc1){
	
	this.nombre = nombre;
	this.direccion = direccion;
	this.telefono = telefono;
	this.masc1 = masc1;
		}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public void setNombre(){
		
		this.nombre = nombre;
	}
	
	public String getDireccion(){
		
		return direccion
			
	}
	
	public void setDireccion(String direccion){
		
		this.direccion = direccion;
		
	}
	
	public int getTelefono(){
		
		return telefono;
	}
	
	public void setTelefono(int telefono){
		
		this.telefono = telefono;
		
	}
	