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
public String showRoomInfo(){
String msj = "";

msj += "Si esta ocupado: \n 1. TRUE y si no \n 2. FALSE si esta ocupado" + avaible;
msj += "El numero del cuarto es:" + numbOfRoom;

return msj;

}




}
