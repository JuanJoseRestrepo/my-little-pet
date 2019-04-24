package model;

import java.util.ArrayList;

public class typeOfService{
//Constantes
public final static String service1 = "Lavado de perros";
public final static String service2 = "Lavado de mascotas a domicilio";
public final static String service3 = "corte de uñas";
public final static String service4 = "Profilaxia dental";
public final static String service5 = "Aplicacion de vacunas";

public final static double washPets = 20000;
public final static double washPetsDelivery = 30000;
public final static double cutNails = 8000;
public final static double dentistProfi = 12000;
public final static double vacunnesAplication = 45000;

//Atributos
private String service;
private double cost;
private String dateThatItDoIt;
private String identifyPetId;
private String identifyClientId;

//Relaciones

private ArrayList<Pet> petsWithTypeOfService;

public typeOfService(String service, double cost ,String dateThatItDoIt,String identifyPetId,String identifyClientId){

this.service = service;
this.cost = cost;
this.dateThatItDoIt = dateThatItDoIt;
this.identifyPetId = identifyPetId;
this.identifyClientId = identifyClientId;
petsWithTypeOfService = new ArrayList<Pet>();

}

public String getService(){
  return service;
}

public void setService(String service){
  this.service = service;
}

public double getCost(){
  return cost;
}

public void setCost(double cost){
  this.cost = cost;
}

public String getDateThatItDoIt(){
  return dateThatItDoIt;
}

public void setDateThatItDoIt(String dateThatItDoIt){
  this.dateThatItDoIt = dateThatItDoIt;
}

public String getIdentifyPetId(){
  return identifyPetId;
}

public void setIdentifyPetId(String identifyPetId){
  this.identifyPetId = identifyPetId;
}

public String getIdentifyClientId(){
  return identifyClientId;
}

public void setIdentifyClientId(String identifyClientId){
  this.identifyClientId = identifyClientId;
}

public String serviceInformation(){
String msj = "";

msj = "El servicio es:" + service;
msj = "Su costo es:" + cost;
msj = "Su fecha de entra es:" + dateThatItDoIt;
msj = "Su identificacion es:" + identifyPetId;
msj = "La cedula del cliente es:" + identifyClientId;

return msj;
}

public void addPetNew(Pet p){

petsWithTypeOfService.add(p);

}




}//finalRound
