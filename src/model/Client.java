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
 public ArrayList<Pet> getPet2(){
	 return pet2;
 }
 public void setPet2(ArrayList<Pet> pet2){
	 this.pet2 = pet2;
 }

 public void addPet1(Pet pet3){
 pet2.add(pet3);

 }
	public void addPet(){

		Pet Carlos = new Pet("Carlos", 12,"Perro", 12.3);
		Pet Spunky = new Pet("Spunky", 8,"Gato", 23.1);
		Pet Bella = new Pet("Bella", 2,"Pajaro", 10.0);
		Pet Lupe = new Pet("Lupe", 1,"Otro", 9.5);
		Pet Oddie = new Pet("Oddie", 17,"Perro", 12.9);
		Pet Lennon = new Pet("Lennon", 4,"Perro", 31.0);
		Pet Steve = new Pet("Steve del Maincraft", 7,"Otro", 50.0);
		Pet Eunice = new Pet("Eunice", 14,"Otro", 25.0);


    pet2.add(Carlos);
		pet2.add(Spunky);
		pet2.add(Bella);
		pet2.add(Lupe);
		pet2.add(Oddie);
		pet2.add(Lennon);
		pet2.add(Steve);
		pet2.add(Eunice);


	}



public String infoClient(){
String msj = "";

for(int i = 0; i<pet2.size(); i++){
msj += "Mi nombre es:" + nameClient;
msj += "Mi identificacion es:" + identify;
msj += "Mi direccion es:" + address;
msj += "Mi numero es:" + cellPhone;
}
return msj;
}

public String infoPet(){
String msj = "";

for( int i = 0; i <pet2.size(); i++){

msj += msj += pet2.get(i).showInfoSymptom();

}
return msj;
}




}
