package model;

public class Client{

//Atributos
private String namePet;
private String address;
private int cellPhone;

//Relaciones
private Pet masc1;

	public Client(String namePet, String address , int cellPhone, Pet masc1){

	this.namePet = namePet;
	this.address= address;
	this.cellPhone = cellPhone;
	this.masc1 = masc1;
		}

	public String getNamePet(){

		return namePet;
	}

	public void setNamePet(String namePet){

		this.namePet = namePet;
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
