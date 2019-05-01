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
private Long identifyPetId;
private Long identifyClientId;

//Relaciones

private Pet petsWithTypeOfService;

public typeOfService(String service, double cost ,String dateThatItDoIt,Long identifyPetId,Long identifyClientId, Pet petsWithTypeOfService){

this.service = service;
this.cost = cost;
this.dateThatItDoIt = dateThatItDoIt;
this.identifyPetId = identifyPetId;
this.identifyClientId = identifyClientId;
this.petsWithTypeOfService = petsWithTypeOfService;


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

public Long getIdentifyPetId(){
  return identifyPetId;
}

public void setIdentifyPetId(Long identifyPetId){
  this.identifyPetId = identifyPetId;
}

public Long getIdentifyClientId(){
  return identifyClientId;
}

public void setIdentifyClientId(Long identifyClientId){
  this.identifyClientId = identifyClientId;
}

public Pet getPetsWithTypeOfService(){
  return petsWithTypeOfService;
}

public void setPetsWithTypeOfService(Pet petsWithTypeOfService){
	this.petsWithTypeOfService = petsWithTypeOfService;

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

}//finalRound
