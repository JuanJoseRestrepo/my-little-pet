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

 public void addPet(ArrayList<Pet> clientsPets){
 pets = clientsPets;

 }
//MOSTRAR LA INFORMACION DEL USUARIO
public String infoClient(){
String msj = "";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Mi nombre es:" + nameClient + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Mi identificacion es:" + identify+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
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

public void startHospita(String namePe, ClinicalHistory newMedRec, Medicament medic){
boolean petts = false;

for(int i = 0; i < pets.size() && !petts; i++)
if(pets.get(i).getNamePet().equals(namePe)){
  petts = true;

	pets.get(i).addMedRec(newMedRec,medic);

	}
}

public String showInfoHospi(){
String msj = "";

for(int i = 0; i < pets.size(); i++){

msj += pets.get(i).showHospitalization();

}

return msj;

}

public String addMedicamentsToPets(String namePetLupe, String nameCLientPetToHisto,String medicamentForVeterinary,double doseForVeterinary,double costForVeterinary,int frecForVeterinary){

String msj = "";
boolean t = false;

for(int i = 0; i < pets.size() && !t ; i++){
	Pet m = pets.get(i);
	if(namePetLupe.equals(m.getNamePet())){
		 msj = "" + m.addMedicamentToPets(nameCLientPetToHisto,medicamentForVeterinary, doseForVeterinary, costForVeterinary, frecForVeterinary);
		 t = true;
	}
}

return msj;
}


public void addNotesToPet(String nameClientPet,String namePeToClient, String notes){

boolean t = false;

for(int o = 0; o < pets.size() && !t; o++){
Pet pet1 = pets.get(o);
if(nameClientPet.equals(pet1.getNamePet())){

t = true;
pet1.addNotesToHospitalizationFatality(namePeToClient,notes);

}



}





}




}//final
