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
medicaments = new ArrayList<Medicament>();
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
public ArrayList<Medicament> getMedicaments(){
 return medicaments;
}
public void setMedicaments(ArrayList<Medicament> medicaments){
 this.medicaments = medicaments;
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
  for(int i = 0; i< medicaments.size(); i++){
  msj += "El sintomas es:" + symptom;
  msj += "El diagnostico es:" + diagnostic;
  msj += "La fecha inicial es:" + inicialDate1();
  msj += "La fecha de Salida es:"  + finalDate2();
  msj += medicaments.get(i).showInfoMedica();
}
  return msj;

}

//AGREGAR MEDICAMENTOS
public void addMedicaments(String nameOfMedicament, double dose, double totalDose, int frecuency){
  Medicament m = new Medicament(nameOfMedicament,dose,totalDose,frecuency);
  medicaments.add(m);

}

//OBTENER LOS DIAS ACTUALES
public int getFrecuencyOfTheMedicament(int actualDay , int actualMonth){

	int dia = 0;
	int diaActual = 0;
	int diasCorridos = 0;
	int diasPreciso = 0;

	dia += (date1.getMonth() -1)* 30 + date1.getDay();
	diaActual += (actualMonth -1)* 30 + actualDay;

	diasCorridos += 360-(dia + diaActual);

	diasPreciso += (360 - diasCorridos)/7;

  return diasPreciso;
}

}
