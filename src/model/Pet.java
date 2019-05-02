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
private double heightPet;

//Relaciones
private ArrayList<ClinicalHistory> clientWithHisto;
private Client cli1;

//Constructores
/**
*Description este constructor inicializa las variables
*@param namePet String el nombre del animalito
*@param ageOfPet int la edad del animalito
*@param typeOfPet String el tipo del animalito
*@param weightPet double el peso del animalito
*@param heightPet double la altura del animalito
*@param clie1 Client el cliente que contiene la mascota
*/
public Pet(String namePet , int ageOfPet , String typeOfPet, double weightPet,double heightPet,Client cli1){
		this.namePet = namePet;
		this.ageOfPet = ageOfPet;
		this.typeOfPet = typeOfPet;
		this.weightPet = weightPet;
		this.heightPet = heightPet;
		this.cli1 = cli1;
		clientWithHisto = new ArrayList<ClinicalHistory>();
	}

/**
*Description este metodo obtiene el nombre de la mascota
*@return String el nombre de la mascota
*/
public String getNamePet(){
		return namePet;
}

/**
*Description este metodo establece el nombre de la mascota
*@param namePet String el nombre de la mascota
*/
public void setNamePet(String namePet){
	this.namePet = namePet;
}

/**
*Description este metodo obtiene la edad de la mascota
*@return int la edad de la mascota
*/
public int getAgeOfPet(){
	return ageOfPet;
}

/**
*Description este metodo establece la edad de la mascota
*@param ageOfPet int la edad de la mascota
*/
public void setAgeOfPet(int ageOfPet){
	this.ageOfPet = ageOfPet;
}

/**
*Description este metodo obtiene el tipo de la mascota
*@return String el tipo de la mascota
*/
public String getTypeOfPet(){
	return typeOfPet;
}

/**
*Description este metodo establece el tipo de la mascota
*@param typeOfPet String el tipo de la mascota
*/
public void setTypeOfPet(String typeOfPet){
	this.typeOfPet = typeOfPet;
}

/**
*Description este metodo obtiene el peso del animalito
*@return double el peso del animalito
*/
public double getWeightPet(){
	return weightPet;
}

/**
*Description este metodo establece el peso de la mascota
*@param wieghtPet double el peso de la mascota
*/
public void setWeightPet(double weightPet){
	this.weightPet = weightPet;
}

/**
*Description este metodo obtiene el cliente de la mascota
*@return Client el cliente de la mascota
*/
public Client getCli1(){
	return cli1;
}

/**
*Description este metodo establece el cliente de la mascota
*@param cli1 Client el cliente cliente de la mascota
*/
public void setCli1(Client cli1){
	this.cli1 = cli1;
}

/**
*Description este metodo obtiene el arraylist de las historias clinicas
*@return ArrayList<ClinicalHistory> el arraylist de las historias clinicas
*/
public ArrayList<ClinicalHistory> getClientWithHisto(){
 return clientWithHisto;
}

/**
*Description este metodo establece el arraylist de las historias clinicas
*@param clientWithHisto ArrayList<ClinicalHistory> el arraylist de las historias clinicas
*/
public void setClientWithHisto(ArrayList<ClinicalHistory> clientWithHisto){
 this.clientWithHisto = clientWithHisto;
}

/**
*Description este metodo establece el arraylist de las historias clinicas
*@param clientWithHisto ArrayList<ClinicalHistory> el arraylist de las historias clinicas
*/
public void setPets(ArrayList<ClinicalHistory> clientWithHisto){
 this.clientWithHisto = clientWithHisto;
}

/**
*Description este metodo muestra la informacion de la mascota
*@return String la informacion de la mascota
*/
public String showInfoPet(){
 String msj = "";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj += "El name es:" + namePet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj += "Su edad es:" + ageOfPet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj += "Mi peso es:" + weightPet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj +="Mi tipo es:" + typeOfPet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj += "Mi IMB es:" + calculateIBMOfAnimal() +"\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

	return msj;

}

/**
*Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
*pre: The patient clinic story must be not null.
*post: New medicines were added to the patient clinic story.
*@param medicamentForVeterinary String The medicine name. This param must be not null.
*@param doseForVeterinary double The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned. This param must be not null.
*@param costForVeterinary double The medicine cost by each dose. This param could be empty.
*@param frecForVeterinary int The frequency of medicine application. This param could be empty.
*@return A message that indiques if medicine was added to the patient clinic story
*/
public String addPetToHistoryCLinical(String medicamentForVeterinary, double doseForVeterinary, double costForVeterinary, int frecForVeterinary){
String msj = "";

Medicament m = new Medicament(medicamentForVeterinary,doseForVeterinary,costForVeterinary,frecForVeterinary);
clientWithHisto.get((clientWithHisto.size()-1)).addMedicaments(m);

msj = "Se agrego";

return msj;


}

/**
*Description This method allows to calculate the body mass index for a pet.
*pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
*post: The BMI is calculated.
*@return double turn The pet body mass index.
*@throws I the height is zero, so an exception is thrown due to the division on zero does not exist.
*/

public double calculateIBMOfAnimal(){

return weightPet/(heightPet * heightPet);

}


/**
*Description este metodo agrega la historia clinica y los medicamentos
*@param newMedRec ClinicalHistory la historia clinica
*@param medic Medicament los medicamentos
*/
public void addMedRec(ClinicalHistory newMedRec, Medicament medic){

	newMedRec.setPetInfo(showInfoPet());
	clientWithHisto.add(newMedRec);

	clientWithHisto.get((clientWithHisto.size()-1)).addMedicaments(medic);

}

/**
*Description este metodo calcula el costo de hospitalizacion
*@param typeAnimal String el tipo del animalito
*@param weight double el peso del animalito
*@param actualDay int el mes actual
*@param actualMonth int el dia actual
*@param actualYear int el anho actual
*@return double el costo de hospitalizacion
*/
public double costOfHospitalizate(String typeAnimal, double weight,int actualDay, int actualMonth, int actualYear){

double total = 0.0;

for(int i = 0; i < clientWithHisto.size(); i++){
	int diasPreciso = clientWithHisto.get(i).daysInHospitalization(actualDay, actualMonth, actualYear);
	double medicamentCost = clientWithHisto.get(i).medicamentCosts();

if(typeAnimal.equals(CAT)){
	if(weight >= 1.0 && 3.0 <= weight){
		total += (double) (diasPreciso * 10000)+ medicamentCost;
	}else if(weight >= 3.1 && 10.0 <= weight){
		total += (double) (diasPreciso* 12000)+ medicamentCost;
	}else if(weight >= 10.1 && 20.0 <= weight){
		total += (double) (diasPreciso * 15000)+ medicamentCost;
 }else if(weight > 20.0 ){
	 total +=(double) (diasPreciso * 20000)+ medicamentCost;
 }
} else if(typeAnimal.equals(DOG)){
	if(weight>= 1.0 && 3.0 <= weight){
		total += (double) (diasPreciso * 15000)+ medicamentCost;
	}else if(weight >= 3.1 && 10.0 <= weight){
		total += (double)(diasPreciso * 17000)+ medicamentCost;
	}else if(weight >= 10.1 && 20.0 <= weight){
		total += (double) (diasPreciso * 20000)+ medicamentCost;
 }else if(weight > 20.0 ){
	 total += (double) (diasPreciso * 25000)+ medicamentCost;
 }

}else if(typeAnimal.equals(BIRD)){
	if( weight >= 1.0 && 3.0 <= weight){
		total += (double) (diasPreciso * 10000)+ medicamentCost;
	}else if(weight >= 3.1 && 10.0 <= weight){
		total +=(double)  (diasPreciso * 12000)+ medicamentCost;
	}else if(weight >= 10.1 && 20.0 <= weight){
		total += (double) (diasPreciso * 20000)+ medicamentCost;
 }else if(weight > 20.0 ){
	 total +=(double) (diasPreciso * 25000)+ medicamentCost;
 }

}else if(typeAnimal.equals(OTHER)){
	if( weight >= 1.0 && 3.0 <= weight){
		total += (double)  (diasPreciso * 10000)+ medicamentCost;
	}else if(weight >= 3.1 && 10.0 <= weight){
		total += (double) (diasPreciso * 17000)+ medicamentCost;
	}else if(weight >= 10.1 && 20.0 <= weight){
		total += (double) (diasPreciso * 30000)+ medicamentCost;
 }else if(weight > 20.0 ){
	 total += (double) (diasPreciso * 30000)+ medicamentCost;
  }

 }
}
return total;

}

/**
*Description este metodo muestra la info de la hospitalizacion
*@return String la info de la hospitalizacion
*/
public String showHospitalization(){
String msj = "";
int k =0;

for(int i= 0; i < clientWithHisto.size(); i++){
++k;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El name es:" + namePet + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Su edad es:" + ageOfPet + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Mi peso es:" + weightPet + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj +="Mi tipo es" + typeOfPet + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Mi IMB es:" + calculateIBMOfAnimal() +"\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Histo" + k + "";
msj += clientWithHisto.get(i).infoAnimalHistory();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
}
 return msj;


}

/**
*Description este metodo muestra la info de la hospitalizacion
*@return String la info de la hospitalizacion
*/
public String showInfoPetHospit(){
String msj = "";

for(int k = 0; k  < clientWithHisto.size(); k++){

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El name es:" + namePet + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Su edad es:" + ageOfPet + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Mi peso es:" + weightPet + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj +="Mi tipo es:" + typeOfPet + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Mi IMB es:" + calculateIBMOfAnimal() +"\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El animal es:" + clientWithHisto.get(k).infoAnimalHistoryHospi() +"\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

	}
	 return msj;
}

/**
*Description este metodo agrega notas a la hospitalizacion
*@param notes String las notas
*/
public void addNotesToHospitalizationFatality(String notes){

clientWithHisto.get((clientWithHisto.size()-1 )).addNotes(notes);

}

/**
*Description este metodo agrega el nuevo sintoma a la hospitalizacion
*@param symptomPet String el sintoma del animalito
*/
public void addNewSymptomHistory(String symptomPet){

clientWithHisto.get((clientWithHisto.size()-1)).addNewSymptomFinally(symptomPet);

}



}//final
