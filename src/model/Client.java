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

/**
*Description el constructor que inicializa las variables
*@param el nombre del cliente
*@param la identificacion del cliente
*@param la direccion del cliente
*@param el telefono del cliente
*/
public Client(String nameClient,long identify, String address , String cellPhone){

this.nameClient = nameClient;
this.identify = identify;
this.address= address;
this.cellPhone = cellPhone;
pets = new ArrayList<Pet>();

}

/**
*Description este metodo obtiene el nombre del cliente
*@return el nombre del cliente
*/
public String getNameClient(){
		return nameClient;
}

/**
*Description este metodo establece el nombre del cliente
*@param el nombre del cliente
*/
public void setNameClient(String nameClient){
this.nameClient = nameClient;
}

/**
*Description este metodo obtiene la identificacion del cliente
*@return la identificacion del cliente
*/
public long getIdentify(){

		return identify;
	}

/**
*Description este metodo establece la identificacion del cliente
*@param la identificacion del cliente
*/
public void setIdentify(long identify){
	this.identify = identify;
	}

/**
*Description este metodo obtiene la direccion del cliente
*@return la direccion del cliente
*/
public String getAddress(){

	return address;

}

/**
*Description este metodo establece la direccion del cliente
*@param la direccion del cliente
*/
public void setAddress(String address){

	this.address = address;

}

/**
*Description este metodo obtiene el telefono del cliente
*@return el telefono del cliente
*/
public String getCellPhone(){
return cellPhone;
}

/**
*Description este metodo establece el telefono del cliente
*@param el telefono del cliente
*/
public void setCellPhone(String cellPhone){

this.cellPhone = cellPhone;

}

/**
*Description este metodo obtiene el arraylist de las mascotas
*@return el arraylist de las mascotas
*/
public ArrayList<Pet> getPets(){
	 return pets;
 }

/**
*Description este metodo establece el numero del cuarto
*@param el numero del cuarto
*/
public void setPets(ArrayList<Pet> pets){
	 this.pets = pets;
 }

/**
*Descriptioneste metodo agrega al arraylist de mascotas
*@param el arraylist de mascotas nuevo
*/
public void addPet(ArrayList<Pet> clientsPets){
pets = clientsPets;
 }

 /**
**Description este metodo muestra la info del cliente
*@return la info del cliente
 */
public String infoClient(){
String msj = "";
msj += "----------------------------------------------------------------------------------------------------------------------------  \n";
msj += "Mi nombre es:" + nameClient + "\n";
msj += "----------------------------------------------------------------------------------------------------------------------------  \n";
msj += "Mi identificacion es:" + identify+ "\n";
msj += "----------------------------------------------------------------------------------------------------------------------------  \n";
msj += "Mi direccion es:" + address + "\n";
msj += "----------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Mi numero es:" + cellPhone + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

int j = 0;
for(int i = 0; i<pets.size(); i++){
	++j;
msj += "Pet"+ j + "";
msj += pets.get(i).showInfoPet();
}
return msj;
}

/**
*Description este metodo encuentra al animalito
*@param el nombre del animalito
*@return el animalito encontrado
*/
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

/**
*Description este metodo establece si se puede hospitalizar
*@param el nombre del animalito
*@param la historia clinica
*@param el medicamento
*/
public void startHospita(String namePe, ClinicalHistory newMedRec, Medicament medic){
boolean petts = false;

for(int i = 0; i < pets.size() && !petts; i++)
if(pets.get(i).getNamePet().equals(namePe)){
  petts = true;

	pets.get(i).addMedRec(newMedRec,medic);

	}
}

/**
*Description este metodo muestra la informacion de la hospitlizacion
*@return la info de la hospitalizacion
*/
public String showInfoHospi(){
String msj = "";

for(int i = 0; i < pets.size(); i++){

msj += pets.get(i).showHospitalization();

}

return msj;

}






}//final
