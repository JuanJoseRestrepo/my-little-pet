 package model;

public class Room{

//Atributos

private boolean avaible;
private int numbOfRoom;

//Relaciones

private Pet petRoom;

public Room(boolean avaible, int numbOfRoom, Pet petRoom){
  this.avaible = avaible;
  this.numbOfRoom = numbOfRoom;
  this.petRoom = petRoom;
}
public boolean getAvaible(){
  return avaible;
}
public void setAvaible(boolean avaible){
  this.avaible = avaible;
}
public int getnumbOFRoom(){
  return numbOfRoom;
}
public void seNumbOfRoom(int numbOfRoom){
  this.numbOfRoom = numbOfRoom;
}
public Pet getPetRoom(){
  return petRoom;
}
public void setPetRoom(Pet petRoom){
  this.petRoom = petRoom;
}

//MOSTRAR LA INFORMACION DEL CUARTO
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
public String  costOfhospi(String typeAnimal, double weight,int actualDay, int actualMonth, int actualYear){
String total ="";

total += petRoom.costOfHospitalizate(typeAnimal, weight, actualDay, actualMonth, actualYear);

return total;
}

}//final
