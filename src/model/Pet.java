package model;

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

	//Constructores
	public Pet(String namePet , int ageOfPet , String typeOfPet, double weightPet, HistorialRecord pet1){
		this.namePet = namePet;
		this.ageOfPet = ageOfPet;
		this.typeOfPet = typeOfPet;
		this.weightPet = weightPet;
		this.pet1 = pet1;

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

	public HistorialRecord getPet1(){
		return pet1;
	}

	public void setPet1(HistorialRecord pet1){
		this.pet1 = pet1;
	}

 public double CostOfPet(){
	 double totalCost = 0.0;
   if(typeOfPet.equals(Pet.CAT )){
		 if( weightPet >= 1.0 && 3.0 <= weightPet){
			 totalCost += 10000;
		 }else if(weightPet >= 3.1 && 10.0 <= weightPet){
			 totalCost += 12000;
		 }else if(weightPet >= 10.1 && 20.0 <= weightPet){
			 totalCost += 15000;
	  }else if(weightPet > 20.0 ){
			totalCost += 20000;
    }
	} else if(typeOfPet.equals(Pet.DOG)){
		if( weightPet >= 1.0 && 3.0 <= weightPet){
			totalCost += 15000;
		}else if(weightPet >= 3.1 && 10.0 <= weightPet){
			totalCost += 17000;
		}else if(weightPet >= 10.1 && 20.0 <= weightPet){
			totalCost += 20000;
	 }else if(weightPet > 20.0 ){
		 totalCost += 25000;
	 }
 } else if( typeOfPet.equals(Pet.BIRD)){
	 if( weightPet >= 1.0 && 3.0 <= weightPet){
		 totalCost += 10000;
	 }else if(weightPet >= 3.1 && 10.0 <= weightPet){
		 totalCost += 12000;
	 }else if(weightPet >= 10.1 && 20.0 <= weightPet){
		 totalCost += 20000;
	}else if(weightPet > 20.0 ){
		totalCost += 25000;
	}
} else if( typeOfPet.equals(Pet.OTHER)){
	if( weightPet >= 1.0 && 3.0 <= weightPet){
		totalCost += 10000;
	}else if(weightPet >= 3.1 && 10.0 <= weightPet){
		totalCost += 17000;
	}else if(weightPet >= 10.1 && 20.0 <= weightPet){
		totalCost += 30000;
 }else if(weightPet > 20.0 ){
	 totalCost += 30000;
 }
}
	 return totalCost;
 }

 public String showInfoSymptom(){
 String msj = "";


 msj += "El name es:" + namePet;
 msj += "Su edad es:" + ageOfPet;
 if(typeOfPet.equals(Pet.DOG)){
	  msj +="Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.CAT)) {
	 msj +="Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.BIRD)){
	  msj += "Mi tipo es" + typeOfPet;
 }else if(typeOfPet.equals(Pet.OTHER)){
	  msj +="Mi tipo es" + typeOfPet;
 }

 msj += "Mi peso es:" + weightPet;

 msj += pet1.stateOfAnimal();

 return msj;


 }



}
