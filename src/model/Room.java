 package model;

public class Room{

//Atributos

private boolean avaible;
private int numbOfRoom;

//Relaciones

private Pet petRoom;

public Room(boolean avaible, int numbOfRoom){
  this.avaible = avaible;
  this.numbOfRoom = numbOfRoom;
}
public boolean getAvaible(){
  return avaible;
}
public void setAvaible(boolean avaible){
  this.avaible = avaible;
}
public int getnumbOFRoom(){
  return numb;
}
public void seNumbOfRoom(int numbOfRoom){
  this.numbOfRoom = numbOfRoom;
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



}
