
package model;

public class Room{

//Atributos

private boolean avaible;
private int numbOfRoom;

//Relaciones

private Pet petRoom;

/**
*Description este constructor inicializa las variables
*@param la disponibilidad del cuarto
*@param el numero del cuarto
*@param la mascota dentro del cuarto
*/
public Room(boolean avaible, int numbOfRoom, Pet petRoom){
  this.avaible = avaible;
  this.numbOfRoom = numbOfRoom;
  this.petRoom = petRoom;
}

/**
*Description este metodo obtiene la disponibilidad del cuarto
*@return la disponibilidad del cuarto
*/
public boolean getAvaible(){
  return avaible;
}

/**
*Description este metodo establece la disponibilidad del cuarto
*@param la disponibilidad del cuarto
*/
public void setAvaible(boolean avaible){
  this.avaible = avaible;
}

/**
*Description este metodo obtiene el numero del cuarto
*@return el numero del cuarto
*/
public int getnumbOFRoom(){
  return numbOfRoom;
}

/**
*Description este metodo establece el numero del cuarto
*@param el numero del cuarto
*/
public void seNumbOfRoom(int numbOfRoom){
  this.numbOfRoom = numbOfRoom;
}
/**
*Description este metodo obtiene la mascota en el cuarto
*@return la mascota en el cuarto
*/
public Pet getPetRoom(){
  return petRoom;
}

/**
*Description este metodo establece la mascota en el cuarto
*@param la mascota en el cuarto
*/
public void setPetRoom(Pet petRoom){
  this.petRoom = petRoom;
}

/**
*Description este metodo muestra la informacion del cuarto hospitalizaco
*@return la informacion de la hospitlizacion
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
*@param el tipo del animal
*@param el peso de la mascota
*@param el dia actual
*@param el mes actual
*@param  el anho actual
*@return el precio de hospitalizacion
*/
public String  costOfhospi(String typeAnimal, double weight,int actualDay, int actualMonth, int actualYear){
String total ="";

total += petRoom.costOfHospitalizate(typeAnimal, weight, actualDay, actualMonth, actualYear);

return total;
}

/**
*Description este metodo agrega medicamentos al animalito
*@param el nombre del medicamento
*@param la dosis del medicamento
*@param el costo del medicamento
*@param la fecruencia del medicamento
*@return si se agrego el medicamento
*/
public String addMedicamentsToPet(String medicamentForVeterinary, double doseForVeterinary, double costForVeterinary, int frecForVeterinary){

String msj = "Se agrego";

msj += petRoom.addPetToHistoryCLinical(medicamentForVeterinary,doseForVeterinary,costForVeterinary,frecForVeterinary);

return msj;


}

/**
*Description este metodo agrega notas al animalito
*@param las notas
*/
public void addNotesToPet(String notes){

  petRoom.addNotesToHospitalizationFatality(notes);
}

/**
*Description este metodo agrega nuevos sintomas a la historia clinica
*@param el sintoma nuevo
*/
public void addNotesToSympTom(String symptomPet){

  petRoom.addNewSymptomHistory(symptomPet);

}

}//final
