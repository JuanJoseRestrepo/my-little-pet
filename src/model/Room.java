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
public double priceOfHospital(){
double total = 0.0;

if(petRoom.getTypeOfPet().equals(petRoom.CAT)){
  if( petRoom.getWeightPet() >= 1.0 && 3.0 <= petRoom.getWeightPet()){
    total += 10000;
  }else if(petRoom.getWeightPet() >= 3.1 && 10.0 <= petRoom.getWeightPet()){
    total += 12000;
  }else if(petRoom.getWeightPet() >= 10.1 && 20.0 <= petRoom.getWeightPet()){
    total += 15000;
 }else if(petRoom.getWeightPet() > 20.0 ){
   total += 20000;
 }
} else if(petRoom.getTypeOfPet().equals(petRoom.DOG)){
  if( petRoom.getWeightPet() >= 1.0 && 3.0 <= petRoom.getWeightPet()){
    total += 15000;
  }else if(petRoom.getWeightPet() >= 3.1 && 10.0 <= petRoom.getWeightPet()){
    total += 17000;
  }else if(petRoom.getWeightPet() >= 10.1 && 20.0 <= petRoom.getWeightPet()){
    total += 20000;
 }else if(petRoom.getWeightPet() > 20.0 ){
   total += 25000;
 }

}else if(petRoom.getTypeOfPet().equals(petRoom.BIRD)){
  if( petRoom.getWeightPet() >= 1.0 && 3.0 <= petRoom.getWeightPet()){
    total += 10000;
  }else if(petRoom.getWeightPet() >= 3.1 && 10.0 <= petRoom.getWeightPet()){
    total += 12000;
  }else if(petRoom.getWeightPet() >= 10.1 && 20.0 <= petRoom.getWeightPet()){
    total += 20000;
 }else if(petRoom.getWeightPet() > 20.0 ){
   total += 25000;
 }

}else if(petRoom.getTypeOfPet().equals(petRoom.OTHER)){
  if( petRoom.getWeightPet() >= 1.0 && 3.0 <= petRoom.getWeightPet()){
    total += 10000;
  }else if(petRoom.getWeightPet() >= 3.1 && 10.0 <= petRoom.getWeightPet()){
    total += 17000;
  }else if(petRoom.getWeightPet() >= 10.1 && 20.0 <= petRoom.getWeightPet()){
    total += 30000;
 }else if(petRoom.getWeightPet() > 20.0 ){
   total += 30000;
 }
}

return total;

}
public String showRoomInfo(){
String msj = "";

msj += "Si esta ocupado: \n 1. TRUE y si no \n 2. FALSE si esta ocupado" + avaible;
msj += "El numero del cuarto es:" + numbOfRoom;

return msj;

}


}
