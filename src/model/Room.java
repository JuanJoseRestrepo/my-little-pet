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


public boolean RoomState(){
  boolean reedRum = false;



}



}
