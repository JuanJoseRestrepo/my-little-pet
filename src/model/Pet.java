package model;
import java.util.ArrayList;

public class Pet{

	//COnstantes

	public final static String DOG = "Perro";
	public final static String CAT = "Gato";
	public final static String BIRD = "Ave";
	public final static String OTHER = "Otro";

	//Atributos
	private String namePet;
	private int ageOfPet;
	private String typeOfPet;
	private double weightPet;

  //Relaciones
	private ArrayList<ClinicalHistory> clientWithHisto;



	//Constructores
	public Pet(String namePet , int ageOfPet , String typeOfPet, double weightPet){
		this.namePet = namePet;
		this.ageOfPet = ageOfPet;
		this.typeOfPet = typeOfPet;
		this.weightPet = weightPet;
		clientWithHisto = new ArrayList<ClinicalHistory>();

	}

	public String getNamePet(){
		return namePet;
	}

	public void setNamePet(String namePet){
		this.namePet = namePet;
	}

	public int getAgeOfPet(){
		return ageOfPet;
	}

	public void setAgeOfPet(int ageOfPet){
		this.ageOfPet = ageOfPet;
	}

	public String getTypeOfPet(){
		return typeOfPet;
	}

	public void setTypeOfPet(){
		this.typeOfPet = typeOfPet;
	}

	public double getWeightPet(){
		return weightPet;
	}

	public void setWeightPet(){
		this.weightPet = weightPet;
	}

 public String showInfoPet(){
 String msj = "";

 msj += "El name es:" + namePet;
 msj += "Su edad es:" + ageOfPet;
 msj += "Mi peso es:" + weightPet;
 if(typeOfPet.equals(Pet.DOG)){
	  msj +="Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.CAT)) {
	 msj +="Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.BIRD)){
	  msj += "Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.OTHER)){
	  msj +="Mi tipo es" + typeOfPet;
	}
	return msj;

}

public String HospitalizatedAnimal(){
 String msj = "";
 for(int i = 0; i < clientWithHisto.size() ; i++){
 msj += "El name es:" + namePet;
 msj += "Su edad es:" + ageOfPet;
 msj += "Mi peso es:" + weightPet;
 if(typeOfPet.equals(Pet.DOG)){
 	 msj +="Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.CAT)) {
 	msj +="Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.BIRD)){
 	 msj += "Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.OTHER)){
 	 msj +="Mi tipo es" + typeOfPet;
  }
	msj+= clientWithHisto.get(i).infoAnimalHistory();
}

return msj;
}

}
