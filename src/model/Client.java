package model;
import java.util.ArrayList;

public class Client{

//Atributos
private String nameClient;
private String identify;
private String address;
private String cellPhone;

//Relaciones
private ArrayList<Pet> pet2;

	public Client(String nameClient,String identify, String address , String cellPhone){

	this.nameClient = nameClient;
	this.identify = identify;
	this.address= address;
	this.cellPhone = cellPhone;
  pet2 = new ArrayList<Pet>();

	}

	public String getNameClient(){

		return nameClient;
	}

	public void setNameClient(String nameClient){

		this.nameClient = nameClient;
	}

	public String getIdentify(){

		return identify;
	}

	public void setIdentify(String identify){

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
	public boolean idClient(String id){
		boolean msj = true;

  if(id == identify){
		msj = true;
	} else {
		msj = false;
	}

	return msj;
	}

	public void addPet(ArrayList<Pet> pet3){

		Pet Carlos = new Pet(pet3);

	}



public String infoPet(){
String msj = "";

for(int i = 0; i<pet2.size(); i++){
msj += "Mi nombre es:" + nameClient;
msj += "Mi identificacion es:" + identify;
msj += "Mi direccion es:" + address;
msj += "Mi numero es:" + cellPhone;
msj += pet2.get(i).showInfoSymptom();
}

return msj;


}





}
