 package model;

public class Room{

//Atributos

private boolean avaible;
private int day;
private double price;
private double totalPrice;

//Relaciones

private Pet petRoom;

public Room(boolean avaible, int day, double price, double totalPrice, Pet petRoom){
  this.avaible = avaible;
  this.day = day;
  this.price = price;
  this.totalPrice = totalPrice;
  this.petRoom = petRoom;
}
public boolean getAvaible(){
  return avaible;
}
public void setAvaible(boolean avaible){
  this.avaible = avaible;
}
public int getDay(){
  return day;
}
public void setDay(int day){
  this.day = day;
}
public double getPrice(){
  return price;
}
public void setPrice(double price){
  this.price = price;
}
public double getTotalPrice(){
  return totalPrice;
}
public void setTotalPrice(double totalPrice){
  this.totalPrice = totalPrice;
}
public Pet getPetRoom(){
  return petRoom;
}
public void setPetRoom(Pet petRoom){
  this.petRoom = petRoom;
}
public double priceOfHospital(){
double total = 0.0;

if(petRoom.getTypeOfPet().equals(petRoom.getTypeOfPet(petRoom.CAT))){
  if( weightPet >= 1.0 && 3.0 <= weightPet){
    totalCost += 10000;
  }else if(weightPet >= 3.1 && 10.0 <= weightPet){
    totalCost += 12000;
  }else if(weightPet >= 10.1 && 20.0 <= weightPet){
    totalCost += 15000;
 }else if(weightPet > 20.0 ){
   totalCost += 20000;
 }
} else if(petRoom.getTypeOfPet().equals(petRoom.getTypeOfPet(petRoom.DOG)){
  if( weightPet >= 1.0 && 3.0 <= weightPet){
    totalCost += 15000;
  }else if(weightPet >= 3.1 && 10.0 <= weightPet){
    totalCost += 17000;
  }else if(weightPet >= 10.1 && 20.0 <= weightPet){
    totalCost += 20000;
 }else if(weightPet > 20.0 ){
   totalCost += 25000;
 }

}else if(petRoom.getTypeOfPet().equals(petRoom.getTypeOfPet(petRoom.BIRD)){
  if( weightPet >= 1.0 && 3.0 <= weightPet){
    totalCost += 10000;
  }else if(weightPet >= 3.1 && 10.0 <= weightPet){
    totalCost += 12000;
  }else if(weightPet >= 10.1 && 20.0 <= weightPet){
    totalCost += 20000;
 }else if(weightPet > 20.0 ){
   totalCost += 25000;
 }

}else if(petRoom.getTypeOfPet().equals(petRoom.getTypeOfPet(petRoom.OTHER)){
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



}

}
