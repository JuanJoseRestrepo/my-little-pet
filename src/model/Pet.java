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



	//Constructores
	public Pet(String namePet , int ageOfPet , String typeOfPet, double weightPet,double heightPet){
		this.namePet = namePet;
		this.ageOfPet = ageOfPet;
		this.typeOfPet = typeOfPet;
		this.weightPet = weightPet;
		this.heightPet = heightPet;
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
	public void setClientWithHisto(ArrayList<ClinicalHistory> clientWithHisto){
	 this.clientWithHisto = clientWithHisto;
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
 msj +="Mi tipo es:" + typeOfPet + "\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
 msj += "Mi IMB es:" + calculateIBMOfAnimal() +"\n";
 msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
	return msj;

}

/**
*Description This method allows to calculate the body mass index for a pet.
*pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
*post: The BMI is calculated.
*@ return The pet body mass index.
*@ throws  I the height is zero, so an exception is thrown due to the division on zero does not exist.
*/

public double calculateIBMOfAnimal(){

return weightPet/(heightPet * heightPet);

}

//AGREGAR NUEVAS HISTORIAS CLINICAS

public void addMedRec(ClinicalHistory newMedRec, Medicament medic){

	newMedRec.setPetInfo(showInfoPet());
	clientWithHisto.add(newMedRec);

	clientWithHisto.get((clientWithHisto.size()-1)).addMedicaments(medic);

}

/**
*Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
*pre: The patient clinic story must be not null.
*post: New medicines were added to the patient clinic story.
*@ param The medicine name. This param must be not null.
*@ param The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned. This param must be not null.
*@ param The medicine cost by each dose. This param could be empty.
*@ param The frequency of medicine application. This param could be empty.
*@ return A message that indiques if medicine was added to the patient clinic story
*/
public String addMedicamentToPets(String nameCLientPetToHisto,String medicamentForVeterinary, double doseForVeterinary, double costForVeterinary, int frecForVeterinary){

String msj = "";


for(int i = 0; i < clientWithHisto.size(); i++){
	ClinicalHistory clinical = clientWithHisto.get(i);
	if(nameCLientPetToHisto.equals(clinical.getPetInfo())){

		Medicament medic = new Medicament(medicamentForVeterinary,doseForVeterinary,costForVeterinary,frecForVeterinary);

		clinical.addMedicaments(medic);

		msj = "Se agrego exitosamente";
	}
}
return msj;
}

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
msj += "El animal es:" + clientWithHisto.get(k).infoAnimalHistoryHospi();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

	}
	 return msj;
}


public void addNotesToHospitalizationFatality(String namePeToClient,String notes){

	boolean t = false;

for(int i = 0; i < clientWithHisto.size() && !t ;i++){
if(namePeToClient.equals(clientWithHisto.get(i).getOwnerInfo())){
	t = true;
	clientWithHisto.get(i).addNotes(notes);
}

}

}




}//final
