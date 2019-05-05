package model;
import java.util.ArrayList;

public class ClinicalHistory{

//Constantes

private final static boolean STATE_OPEN = true;
private final static boolean STATE_CLOSE = false;

//Atributos
private String petInfo;
private String ownerInfo;
private String symptom;
private String diagnostic;
private boolean state;


//Relaciones
private ArrayList<Medicament> medicaments;
private HistorialDated date1;
private HistorialDated date2;
private Pet petsAll;

//Constructores

/**
*Description este constructor inicializa las variables
*@param petInfo String el nombre de la mascota
*@param ownerInfo String el nombre del cliente
*@param symptom String el sintoma de la mascota
*@param diagnostic String el diagnostico de la mascota
*@param state boolean  estado de la mascota
*@param date1 HistorialDated la fecha inicial
*@param date2 HistorialDated la fecha final
*@param petsAll Pet a mascota en el registro del historial
*/
public ClinicalHistory(String petInfo, String ownerInfo,String symptom, String diagnostic, boolean state, HistorialDated date1, HistorialDated date2,Pet petsAll){

this.symptom = symptom;
this.diagnostic = diagnostic;
this.state = state;
this.date1 = date1;
this.date2 = date2;
this.petInfo = petInfo;
this.ownerInfo = ownerInfo;
medicaments = new ArrayList<Medicament>();
}

/**
*Description este metodo obtiene el nombre de la mascota
*@return String el nombre de la mascota
*/
public String getPetInfo(){
  return petInfo;
}

/**
*Description este metodo establece el nombre de la mascota
*@param petInfo String el nombre de la mascota
*/
public void setPetInfo(String petInfo){
  this.petInfo = petInfo;
}

/**
*Description este metodo obtiene el nombre del cliente
*@return String el nombre del cliente
*/
public String getOwnerInfo(){
  return ownerInfo;
}

/**
*Description este metodo establece el nombre del cliente
*@param ownerInfo String el nombre del cliente
*/
public void setOwnerInfo( String ownerInfo){
  this.ownerInfo = ownerInfo;
}

/**
*Description este metodo obtiene el sintoma de la mascota
*@return String el sintoma de la mascota
*/
public String getSymptom(){
  return symptom;
}

/**
*Description este metodo estable el sintoma de la mascota
*@param symptom String el sintoma de la mascota
*/
public void setSymptom(String symptom){
  this.symptom = symptom;
}

/**
*Description este metodo obtiene el diagnostico de la mascota
*@return String el diagnostico de la mascota
*/
public String getDiagnostic(){
  return diagnostic;
}

/**
*Description este metodo establece el diagnostico de la mascota
*@param diagnostic String el diagnostico de la mascota
*/
public void setDiagnostic(String diagnostic){
  this.diagnostic = diagnostic;
}

/**
*Description este metodo obtiene el estado del animal
*@return boolean el estado del animal
*/
public boolean getState(){
  return state;
}

/**
*Description este metodo estable el estado del animal
*@param state boolean el estado del animal
*/
public void setState(boolean state){
  this.state = state;
}

/**
*Description este metodo obtiene el historial de la mascota
*@return HistorialDated el historial de la mascota
*/
public HistorialDated getDate1(){
  return date1;
}

/**
*Description este metodo establece el historial de la mascota
*@param date1 HistorialDated el historial de la mascota
*/
public void setDate1(HistorialDated date1){
  this.date1 = date1;
}

/**
*Description este metodo obtiene el historial de la mascota
*@return HistorialDated el historial de la mascota
*/
public HistorialDated getDate2(){
  return date2;
}

/**
*Description este metodo establece el historial de la mascota
*@param date2 HistorialDated el historial de la mascota
*/
public void setDate2(HistorialDated date2){
  this.date2 = date2;
}

/**
*Description este metodo obtiene los medicamentos
*@return ArrayList el arraylist de los medicamentos
*/
public ArrayList<Medicament> getMedicaments(){
 return medicaments;
}

/**
*Description este metodo establece los medicamentos
*@param medicaments ArrayList el arraylist de los medicamentos
*/
public void setMedicaments(ArrayList<Medicament> medicaments){
 this.medicaments = medicaments;
}

/**
*Description este metodo obtiene a la mascota
*@return Pet  la mascota
*/
public Pet getPetsAll(){
  return petsAll;
}

/**
*Description este metodo estable a la mascota
*@param petsAll Pet a mascota
*/
public void setPetsAll(Pet petsAll){
  this.petsAll = petsAll;
}

/**
*Description este metodo obtiene la fecha inicial
*@return String la fecha inicial
*/
public String inicialDate1(){
String msj = "";

msj += date1.getDay() +"\n" + date1.getMonth() +"\n"+ date1.getYear();

return msj;
}

/**
*Description este metodo obtiene la fecha final
*@return String la fecha final
*/
public String finalDate2(){
  String msj = "";

  msj += date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear();

  return msj;
}

/**
*Description este metodo obtiene la informacion de la historia clinica
*@return String  la info de la historia clinica
*/
public String infoAnimalHistory(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre del dueño es:" + ownerInfo;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre del pet es:" + petInfo;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El sintomas es:" + symptom;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El diagnostico es:" + diagnostic;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La fecha inicial es:" + inicialDate1();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La fecha de Salida posible es:"  + finalDate2();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
    for(int i = 0; i< medicaments.size(); i++){
  msj += medicaments.get(i).showInfoMedica();
}
  return msj;

}

/**
*Description este metodo obtiene la informacion de la historia clinica
*@return String  la info de la historia clinica
*/
public String infoAnimalHistoryHospi(){
  String msj = "";

  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre del dueño es:" + ownerInfo;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre del pet es:" + petInfo;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El sintomas es:" + symptom;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El diagnostico es:" + diagnostic;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La fecha inicial es:" + inicialDate1();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La fecha de Salida es:"  + finalDate2();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
    for(int i = 0; i< medicaments.size(); i++){
  msj += medicaments.get(i).showInfoMedica();
}
  return msj;

}

/**
*Description este metodo agrega medicamentos
*@param medic Medicament el medicamento ha agregar
*/
public void addMedicaments(Medicament medic){

  medicaments.add(medic);

}

/**
*Description este metodo da los dias de hospitalizacion
*@param actualDay el dia actual
*@param actualMonth el mes actual
*@param  actualYear el year actual
*@return int  los dias de hospitalizacion
*/
public int daysInHospitalization(int actualDay, int actualMonth, int actualYear){
int i =0;

i += date1.getFrecuencyOfTheMedicament(actualDay, actualYear, actualYear);

return i;
}

/**
*Description este metodo obtiene el costo de los medicamentos
*@return double el costo de los medicamentos
*/
public double medicamentCosts(){
  double doseXcost = 0.0;

for(int i = 0; i < medicaments.size(); i++){
doseXcost += medicaments.get(i).calculatedDose();

}
 return doseXcost;
}


/**
*Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.
*pre: The patient clinic story must be not null.
*post: New notes were added to the possible diagnostic in the patient clinic story.
*@param notes String The notes of possible diagnostic. This param must be not null.
*/
public void addNotes(String notes){

setDiagnostic(notes + getDiagnostic());

}

/**
*Description This method allows to add a new symptom presented during the hospitalization at the patient stories.
*pre: The patient clinic story must be not null.
*post: A new symptom were added to the patient clinic story.
*@param symptomPet String The new symptom presented. This param must be not null.
*/
public void addNewSymptomFinally(String symptomPet){

setSymptom(symptomPet + getSymptom());

}


}//Final
