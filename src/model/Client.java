package model;
import java.util.ArrayList;

public class Client{

//Atributos
private String namePet;
private String identify;
private String address;
private int cellPhone;

//Relaciones
private Pet masc1;
private ArrayList<Pet> pet2;

	public Client(String namePet,String identify, String address , int cellPhone, Pet masc1){

	this.namePet = namePet;
	this.identify = identify;
	this.address= address;
	this.cellPhone = cellPhone;
	this.masc1 = masc1;
  pet2 = new ArrayList<pet2>();

	}

	public String getNamePet(){

		return namePet;
	}

	public void setNamePet(String namePet){

		this.namePet = namePet;
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

	public int getCellPhone(){

		return cellPhone;
	}

	public void setCellPhone(int cellPhone){

		this.cellPhone = cellPhone;

	}

}
