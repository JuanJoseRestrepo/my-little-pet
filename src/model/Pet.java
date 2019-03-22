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
//MOSTRAR LA INFORMACION DEL ANIMAL HOSPITALIZADO
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
//AGREGAR NUEVAS HISTORIAS CLINICAS
public void addHistory(String symptom, String diagnostic, boolean state, HistorialDated date1, HistorialDated date2){
	ClinicalHistory ch = new ClinicalHistory(symptom, diagnostic, state , date1 , date2);
	clientWithHisto.add(ch);
}

//COSTO POR HOSPITALIZACION
public double costOfHospitalizate(int actualDay, int actualMonth){
double total = 0.0;

for(int i = 0; i < clientWithHisto.size(); i++){


	int diasPreciso = clientWithHisto.get(i).getFrecuencyOfTheMedicament(actualDay, actualMonth);

if(typeOfPet.equals(CAT)){
	if(weightPet >= 1.0 && 3.0 <= weightPet){
		total += (double) (diasPreciso * 10000);
	}else if(weightPet >= 3.1 && 10.0 <= weightPet){
		total += (double) (diasPreciso* 12000);
	}else if(weightPet >= 10.1 && 20.0 <= weightPet){
		total += (double) (diasPreciso * 15000);
 }else if(weightPet > 20.0 ){
	 total +=(double) (diasPreciso * 20000);
 }
} else if(typeOfPet.equals(DOG)){
	if( weightPet >= 1.0 && 3.0 <= weightPet){
		total += (double) (diasPreciso * 15000);
	}else if(weightPet >= 3.1 && 10.0 <= weightPet){
		total += (double)(diasPreciso * 17000);
	}else if(weightPet >= 10.1 && 20.0 <= weightPet){
		total += (double) (diasPreciso * 20000);
 }else if(weightPet > 20.0 ){
	 total += (double) (diasPreciso * 25000);
 }

}else if(typeOfPet.equals(BIRD)){
	if( weightPet >= 1.0 && 3.0 <= weightPet){
		total += (double) (diasPreciso * 10000);
	}else if(weightPet >= 3.1 && 10.0 <= weightPet){
		total +=(double)  (diasPreciso * 12000);
	}else if(weightPet >= 10.1 && 20.0 <= weightPet){
		total += (double) (diasPreciso * 20000);
 }else if(weightPet > 20.0 ){
	 total +=(double) (diasPreciso * 25000);
 }

}else if(typeOfPet.equals(OTHER)){
	if(  weightPet >= 1.0 && 3.0 <= weightPet){
		total += (double)  (diasPreciso * 10000);
	}else if(weightPet >= 3.1 && 10.0 <= weightPet){
		total += (double) (diasPreciso * 17000);
	}else if(weightPet >= 10.1 && 20.0 <= weightPet){
		total += (double) (diasPreciso * 30000);
 }else if(weightPet > 20.0 ){
	 total += (double) (diasPreciso * 30000);
 }
}
}

return total;

}



}
