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
*@param  la dosis
*@param  el nombre del medicamento
*@param  la dosis total
*@param  la frecuencia
*/
public Medicament(String nameOfMedicament, double dose, double totalDose, int frecuency){

this.nameOfMedicament = nameOfMedicament;
this.dose = dose;
this.totalDose = totalDose;
this.frecuency = frecuency;
}

/**
*Description este metodo obtiene el nombre del medicamento
*@return el nombre del medicamento
*/
public String getNameOfMedicament(){
  return nameOfMedicament;
}

/**
*Description este metodo  establece el nombre del medicamento
*@param el nombre del medicamento
*/
public void setNameOfMedicament(String nameOfMedicament){
  this.nameOfMedicament = nameOfMedicament;
}

/**
*Description este metodo obtiene la dosis
*@return dosis
*/
public double getDose(){
  return dose;
}

/**
*Description este metodo establece la dosis
*@param dosis
*/
public void setDose(double dose){
  this.dose = dose;
}

/**
*Description este metodo obtiene el total de la dosis
*@return dosis
*/
public double getTotalDose(){
  return totalDose;
}

/**
*Description este metodo establece el total de la dosis
*@param dosis
*/
public void setTotalDose(double totalDose){
  this.totalDose = totalDose;
}

/**
*Description este metodo obtiene la freccuencia de la dosis
*@return la frecuencia de la dosis
*/
public int getFrecuency(){
  return frecuency;
}

/**
*Description este metodo establece la frecuencia de la dosis
*@param la frecuencia de la dosis
*/
public void setFrecuency(int frecuency){
  this.frecuency = frecuency;
}

/**
*Description este metodo muestra la info de los medicamentos
*@return la info de los medicamentos
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
*@return el calculo de la dosis
*/
public double calculatedDose(){
double doseXcost = 0.0;

doseXcost += dose * totalDose;

return doseXcost;



}


}
