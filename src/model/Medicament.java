package model;

public class Medicament{

//Atributos

private String nameOfMedicament;
private double dose;
private double totalDose;
private int frecuency;

//Relaciones
private HistorialDated  med1;

//Constructores
/**
*Description este constructor inicialzia las variables
*@param  nameOfMedicament String la dosis
*@param  dose double el nombre del medicamento
*@param  totalDose double la dosis total
*@param  frecuency int la frecuencia
*/
public Medicament(String nameOfMedicament, double dose, double totalDose, int frecuency){

this.nameOfMedicament = nameOfMedicament;
this.dose = dose;
this.totalDose = totalDose;
this.frecuency = frecuency;
}

/**
*Description este metodo obtiene el nombre del medicamento
*@return String el nombre del medicamento
*/
public String getNameOfMedicament(){
  return nameOfMedicament;
}

/**
*Description este metodo  establece el nombre del medicamento
*@param nameOfMedicament String el nombre del medicamento
*/
public void setNameOfMedicament(String nameOfMedicament){
  this.nameOfMedicament = nameOfMedicament;
}

/**
*Description este metodo obtiene la dosis
*@return double dosis
*/
public double getDose(){
  return dose;
}

/**
*Description este metodo establece la dosis
*@param dose double dosis
*/
public void setDose(double dose){
  this.dose = dose;
}

/**
*Description este metodo obtiene el total de la dosis
*@return double dosis
*/
public double getTotalDose(){
  return totalDose;
}

/**
*Description este metodo establece el total de la dosis
*@param totalDose int dosis
*/
public void setTotalDose(double totalDose){
  this.totalDose = totalDose;
}

/**
*Description este metodo obtiene la freccuencia de la dosis
*@return int  la frecuencia de la dosis
*/
public int getFrecuency(){
  return frecuency;
}

/**
*Description este metodo establece la frecuencia de la dosis
*@param frecuency int la frecuencia de la dosis
*/
public void setFrecuency(int frecuency){
  this.frecuency = frecuency;
}

/**
*Description este metodo muestra la info de los medicamentos
*@return String la info de los medicamentos
*/
public String showInfoMedica(){
String msj = "";

msj += "El medicamento es:" + nameOfMedicament;
msj += "La dosis es:" + dose;
msj += "Total de dosis" + calculatedDose();
msj += "La frecuencia es" + frecuency;

return msj;

}

/**
*Description este metodo calcula la dosis
*@return double el calculo de la dosis
*/
public double calculatedDose(){
double doseXcost = 0.0;

doseXcost += dose * totalDose;

return doseXcost;



}


}
