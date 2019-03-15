
package model;

import java.util.ArrayList;

public class HistorialRecord{

//Atributos

private String nameOfThePet;
private String nameOfTheClient;

//Relaciones
private ArrayList<ClinicalHistory> history;

public HistorialRecord(String nameOfThePet , String nameOfTheClient){

this.nameOfThePet = nameOfThePet;

this.nameOfTheClient = nameOfTheClient;

history = new ArrayList<ClinicalHistory>();


}

public String getNameOfThePet(){
  return nameOfThePet;
}
public void setNameOfThePet(String nameOfTheClient){
  this.nameOfTheClient = nameOfTheClient;
}
public String getNameOfTheClient(){
  return nameOfTheClient;
}
public void setNameOfTheClient(String nameOfTheClient){
  this.nameOfTheClient = nameOfTheClient;
}




}
