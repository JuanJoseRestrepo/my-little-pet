package model;
import java.util.ArrayList;

public class ClinicalHistory{

//Constantes

private final static boolean STATE_OPEN = true;
private final static boolean STATE_CLOSE = false;

//Atributos

private String symptom;
private String diagnostic;
private boolean state;


//Relaciones
private ArrayList<Medicament> medicaments;
private HistorialDated date1;
private HistorialDated date2;


//Constructores

public ClinicalHistory(String symptom, String diagnostic, boolean state, HistorialDated date1, HistorialDated date2){

this.symptom = symptom;
this.diagnostic = diagnostic;
this.state = state;
this.date1 = date1;
this.date2 = date2;

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
public void setDiagnostic(){
  this.diagnostic = diagnostic;
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

public String inicialDate1(){
String msj = "";

msj += date1.getDay() +"\n" + date1.getMonth() +"\n"+ date1.getYear();

return msj;
}

public String finalDate2(){
  String msj = "";

  msj += date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear();

  return msj;
}

public String infoAnimalHistory(){
 String msj = "";
  for(int i = 0; i< medicaments.size(); i++){
  msj += "El sintomas es:" + symptom;
  msj += "El diagnostico es:" + diagnostic;
  msj += "La fecha inicial es:" + inicialDate1();
  msj += "La fecha de Salida es:"  + finalDate2();
  msj += medicaments.get(i).showInfoMedica();
}
  return msj;

}

public double calculateDoseOfAnimal1(){
  double dosee = 0.0;
for(int i = 0; i < medicaments.size() ; i++){

  dosee += medicaments.get(i).getDose();


}
return dosee;
}

public String showDate(int actualDay , int actualMonth){
String msj = "";

msj+= date1.getFrecuencyOfTheMedicament()

return msj;


}


}
