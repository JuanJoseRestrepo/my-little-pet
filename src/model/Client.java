package model;
import java.util.ArrayList;

public class Client{

//Atributos
private String nameClient;
private long identify;
private String address;
private String cellPhone;

//Relaciones
private ArrayList<Pet> pets;

	public Client(String nameClient,long identify, String address , String cellPhone){

	this.nameClient = nameClient;
	this.identify = identify;
	this.address= address;
	this.cellPhone = cellPhone;
  pets = new ArrayList<Pet>();

	}

	public String getNameClient(){

		return nameClient;
	}

	public void setNameClient(String nameClient){

		this.nameClient = nameClient;
	}

	public long getIdentify(){

		return identify;
	}

	public void setIdentify(long identify){

		this.identify = identify;
	}

	public String getAddress(){

		return address;

	}

	public void setAddress(String address){

			this.address = address;

		}

		public String getCellPhone(){

			return cellPhone;
		}

	public void setCellPhone(String cellPhone){

		this.cellPhone = cellPhone;

	}
 public ArrayList<Pet> getPets(){
	 return pets;
 }
 public void setPets(ArrayList<Pet> pets){
	 this.pets = pets;
 }

 public void addPet(Pet pet3){
 pets.add(pet3);

 }
//MOSTRAR LA INFORMACION DEL USUARIO
public String infoClient(){
String msj = "";

for(int i = 0; i<pets.size(); i++){

msj += "Mi nombre es:" + nameClient;
msj += "Mi identificacion es:" + identify;
msj += "Mi direccion es:" + address;
msj += "Mi numero es:" + cellPhone;
msj += pets.get(i).showInfoPet();
}

return msj;
}

//MIRAR SI EXISTE LA MASCOTA
public Pet findPet(String petName){

	Pet restrepo = null;
	boolean found = false;

	for(int i = 0; i<pets.size() && !found; i++){

		if(pets.get(i).getNamePet().equals(petName)){
			restrepo = pets.get(i);
			found = true;
		}

	}

	return restrepo;
}

//ELIMINAR LA MASCOTA CON EL NUMERO QUE DIGITO EL USUARIO
public void deletedPet(int numb){
	boolean recorrido = false;
	String msj = "";
for(int o = 0; 0 < pets.size() && !recorrido; o++){
  if( pets != null){
		pets.remove(numb);
		msj = "Se ha eliminado al animal correctamente";
	} else{
		msj = "No se pudo eliminar porque no existe la mascota";
	}

}




}

}
