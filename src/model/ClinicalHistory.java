package model;


public class ClinicalHistory{

//Constantes

private final static char STATE_OPEN = 'O';
private final static char STATE_CLOSE = 'C';

//Atributos

private String symptom;
private String diagnostic;
private boolean state;

//Relaciones
private ArrayList<Client> clientWithHisto;
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

public String inicialDate1(){
String msj = "";

msj += date1.getDay() +"/" + date1.getMonth() +"/"+ date1.getYear();

return msj;
}

public String finalDate2(){
  String msj = "";

  msj += date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear();

  return msj;
}

public String infoAnimalHistory(){
 String msj = "";

  msj += "El sintomas es:" + symptom;
  msj += "El diagnostico es:" + diagnostic;
  msj += "La fecha inicial es:" + fecha1();
  msj += "La fecha de Salida es:"  + fecha2();

  return msj;

}

public String estadodDelAnimal(){
String msj = "";
boolean state1 = false;

return msj;
}

}
