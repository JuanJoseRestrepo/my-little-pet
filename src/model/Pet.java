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
	public ArrayList<ClinicalHistory> getClientWithHisto(){
 	 return clientWithHisto;
  }
  public void setPets(ArrayList<ClinicalHistory> clientWithHisto){
 	 this.clientWithHisto = clientWithHisto;
  }
	//MOSTRAR LA INFORMACION DE LA MASCOTA
 public String showInfoPet(){
 String msj = "";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj += "El name es:" + namePet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj += "Su edad es:" + ageOfPet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj += "Mi peso es:" + weightPet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj +="Mi tipo es" + typeOfPet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
	return msj;

}

//AGREGAR NUEVAS HISTORIAS CLINICAS

public void addMedRec(ClinicalHistory newMedRec, Medicament medic){

	newMedRec.setPetInfo(showInfoPet());
	clientWithHisto.add(newMedRec);

	clientWithHisto.get(clientWithHisto.size()-1).addMedicaments(medic);

}

}
