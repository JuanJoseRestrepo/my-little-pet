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

/**
 *Description este es el constructor que inicializa las variables
*@param service String el servicio
*@param cost double el costo del servicio
*@param dateThatItDoIt String la fecha en la que se hizo
*@param identifyPetId long el pet que tiene el servicio
*@param identifyClientId long la identificacion del animalito
*@param petsWithTypeOfService Pet la mascota
*/
private Pet petsWithTypeOfService;

public typeOfService(String service, double cost ,String dateThatItDoIt,Long identifyPetId,Long identifyClientId, Pet petsWithTypeOfService){

this.service = service;
this.cost = cost;
this.dateThatItDoIt = dateThatItDoIt;
this.identifyPetId = identifyPetId;
this.identifyClientId = identifyClientId;
this.petsWithTypeOfService = petsWithTypeOfService;


}

/**
 *Description este metodo obtiene el servicio
*@return String  el servicio
*/
public String getService(){
  return service;
}
/**
*Description este metodo establece el servicio
*@param service String el servicio
*/
public void setService(String service){
  this.service = service;
}
/**
*Description este metodo obtiene el costo del servicio
*@return double el costo del servicio
*/
public double getCost(){
  return cost;
}
/**
*Description este mtodo establece el costo del servicio
*@param cost double el costo del servicio
*/
public void setCost(double cost){
  this.cost = cost;
}
/**
*Description este metodo obtiene la fecha en la que se hizo
*@return String la fecha en la que se hizo
*/
public String getDateThatItDoIt(){
  return dateThatItDoIt;
}
/**
*Description este metodo establece en la fecha en la que se hizo
*@param dateThatItDoIt String la fecha que se hizo
*/
public void setDateThatItDoIt(String dateThatItDoIt){
  this.dateThatItDoIt = dateThatItDoIt;
}
/**
*Description este metodo obtiene la identificacion de la mascota
*@return long la identificacion de la mascota
*/
public Long getIdentifyPetId(){
  return identifyPetId;
}
/**
*Description este metodo establece la identificacion de la mascota
*@param identifyPetId long la identificacion de la mascota
*/
public void setIdentifyPetId(Long identifyPetId){
  this.identifyPetId = identifyPetId;
}
/**
*Description este metodo obtiene la identificacion del cliente
*@return long  la identificacion del cliente
*/
public Long getIdentifyClientId(){
  return identifyClientId;
}
/**
*Description este metodo establece la identificacion del cliente
*@param identifyPetId long la identificacion del cliente
*/
public void setIdentifyClientId(Long identifyClientId){
  this.identifyClientId = identifyClientId;
}
/**
 *Description este metodo obtiene el arraylist de las mascotas
*@return Pet  el arraylist de las mascotas
*/
public Pet getPetsWithTypeOfService(){
  return petsWithTypeOfService;
}
/**
*Description este metodo establece el arraylist de las mascotas
*@param petsWithTypeOfService Pet el arraylist de mascotas
*/
public void setPetsWithTypeOfService(Pet petsWithTypeOfService){
	this.petsWithTypeOfService = petsWithTypeOfService;

}

/**
*Description este metodo obtiene la informacion del servicio
*@return String la info del servicio
*/
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
