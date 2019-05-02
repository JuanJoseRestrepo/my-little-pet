
package model;

public class Room{

//Atributos

private boolean avaible;
private int numbOfRoom;

//Relaciones

private Pet petRoom;

/**
*Description este constructor inicializa las variables
*@param avaible boolean la disponibilidad del cuarto
*@param numbOfRoom int el numero del cuarto
*@param petRoom Pet la mascota dentro del cuarto
*/
public Room(boolean avaible, int numbOfRoom, Pet petRoom){
  this.avaible = avaible;
  this.numbOfRoom = numbOfRoom;
  this.petRoom = petRoom;
}

/**
*Description este metodo obtiene la disponibilidad del cuarto
*@return boolean la disponibilidad del cuarto
*/
public boolean getAvaible(){
  return avaible;
}

/**
*Description este metodo establece la disponibilidad del cuarto
*@param avaible boolean la disponibilidad del cuarto
*/
public void setAvaible(boolean avaible){
  this.avaible = avaible;
}

/**
*Description este metodo obtiene el numero del cuarto
*@return int el numero del cuarto
*/
public int getnumbOFRoom(){
  return numbOfRoom;
}

/**
*Description este metodo establece el numero del cuarto
*@param numbOfRoom int el numero del cuarto
*/
public void seNumbOfRoom(int numbOfRoom){
  this.numbOfRoom = numbOfRoom;
}
/**
*Description este metodo obtiene la mascota en el cuarto
*@return Pet la mascota en el cuarto
*/
public Pet getPetRoom(){
  return petRoom;
}

/**
*Description este metodo establece la mascota en el cuarto
*@param petRoom Pet la mascota en el cuarto
*/
public void setPetRoom(Pet petRoom){
  this.petRoom = petRoom;
}

/**
*Description este metodo muestra la informacion del cuarto hospitalizaco
*@return String la informacion de la hospitlizacion
*/
public String showInfoRoomPetHospit(){
String msj = "";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Si esta ocupado: \n 1. TRUE y si no 2. FALSE si esta ocupado:"+ "" + avaible + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero del cuarto es:" + numbOfRoom + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La informacin del animalito es:" + petRoom.showInfoPet() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Si tiene hospitalziacion:" + petRoom.showInfoPetHospit() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
return msj;

}

/**
*Description este metodo calcula el costo de hospitalizacion
*@param typeAnimal String  el tipo del animal
*@param weight double  el peso de la mascota
*@param actualDay int el dia actual
*@param actualMonth int el mes actual
*@param actualYear int el anho actual
*@return String el precio de hospitalizacion
*/
public String  costOfhospi(String typeAnimal, double weight,int actualDay, int actualMonth, int actualYear){
String total ="";

total += petRoom.costOfHospitalizate(typeAnimal, weight, actualDay, actualMonth, actualYear);

return total;
}

/**
*Description este metodo agrega medicamentos al animalito
*@param medicamentForVeterinary String el nombre del medicamento
*@param doseForVeterinary double la dosis del medicamento
*@param costForVeterinary double el costo del medicamento
*@param frecForVeterinary int la fecruencia del medicamento
*@return String si se agrego el medicamento
*/
public String addMedicamentsToPet(String medicamentForVeterinary, double doseForVeterinary, double costForVeterinary, int frecForVeterinary){

String msj = "Se agrego";

msj += petRoom.addPetToHistoryCLinical(medicamentForVeterinary,doseForVeterinary,costForVeterinary,frecForVeterinary);

return msj;


}

/**
*Description este metodo agrega notas al animalito
*@param notes String las notas
*/
public void addNotesToPet(String notes){

  petRoom.addNotesToHospitalizationFatality(notes);
}

/**
*Description este metodo agrega nuevos sintomas a la historia clinica
*@param symptomPet String el sintoma nuevo
*/
public void addNotesToSympTom(String symptomPet){

  petRoom.addNewSymptomHistory(symptomPet);

}

}//final
