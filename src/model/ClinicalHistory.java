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

public ClinicalHistory(String petInfo, String ownerInfo,String symptom, String diagnostic, boolean state, HistorialDated date1, HistorialDated date2,Pet petsAll){

this.symptom = symptom;
this.diagnostic = diagnostic;
this.state = state;
this.date1 = date1;
this.date2 = date2;
medicaments = new ArrayList<Medicament>();
}
public String getPetInfo(){
  return petInfo;
}
public void setPetInfo(String petInfo){
  this.petInfo = petInfo;
}
public String getOwnerInfo(){
  return ownerInfo;
}
public void setOwnerInfo( String ownerInfo){
  this.ownerInfo = ownerInfo;
}

public String getSymptom(){
  return symptom;
}

public void setSymptom(String symptom){
  this.symptom = symptom;
}
public String getDiagnostic(){
  return diagnostic;
}
public void setDiagnostic(String diagnostic){
  this.diagnostic = diagnostic;
}
public boolean getState(){
  return state;
}
public void setState(boolean state){
  this.state = state;
}
public HistorialDated getDate1(){
  return date1;
}
public void setDate1(HistorialDated date1){
  this.date1 = date1;
}
public HistorialDated getDate2(){
  return date2;
}
public void setDate2(HistorialDated date2){
  this.date2 = date2;
}
public ArrayList<Medicament> getMedicaments(){
 return medicaments;
}
public void setMedicaments(ArrayList<Medicament> medicaments){
 this.medicaments = medicaments;
}
public Pet getPetsAll(){
  return petsAll;
}
public void setPetsAll(Pet petsAll){
  this.petsAll = petsAll;
}

//MOSTRAR LA FECHA DE INGRESO
public String inicialDate1(){
String msj = "";

msj += date1.getDay() +"\n" + date1.getMonth() +"\n"+ date1.getYear();

return msj;
}
//MOSTRAR LA FECHA DE SALIDA
public String finalDate2(){
  String msj = "";

  msj += date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear();

  return msj;
}
//MOSTRAR LA INFORMACION DE LA HISTORIA CLINICA
public String infoAnimalHistory(){
  String msj = "";
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

public String infoAnimalHistoryHospi(){
  String msj = "";
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

//AGREGAR MEDICAMENTOS
public void addMedicaments(Medicament medic){

  medicaments.add(medic);

}

//COSTO POR HOSPITALIZACION
public int daysInHospitalization(int actualDay, int actualMonth, int actualYear){
int i =0;

i += date1.getFrecuencyOfTheMedicament(actualDay, actualYear, actualYear);

return i;
}

public double medicamentCosts(){
  double doseXcost = 0.0;

for(int i = 0; i < medicaments.size(); i++){
doseXcost += medicaments.get(i).calculatedDose();

}
 return doseXcost;
}


public void addNotes(String notes){

setDiagnostic(notes);

}


}//Final
