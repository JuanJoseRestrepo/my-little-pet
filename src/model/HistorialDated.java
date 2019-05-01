package model;


public class HistorialDated{

//Atributos
private int day;
private int month;
private int year;

//Constructores
/** 
*Description este constructor inicializa las variables
*@param el dia
*@param el mes
*@param el anho
*/
public HistorialDated(int day, int month, int year){
  this.day = day;
  this.month = month;
  this.year = year;
}

/**
*Description este metodo obtiene el dia
*@return el dia
*/
public int getDay(){
  return day;
}

/**
*Description este metodo establece el dia
*@param el dia
*/
public void setDay(int day){
  this.day = day;
}

/**
*Description este metodo obtiene el mes
*@return el mes
*/
public int getMonth(){
  return month;
}

/**
*Description este metodo establece  el mes
*@param el mes
*/
public void setMonth(){
  this.month= month;
}

/**
*Description este metodo obtiene el anho
*@return el anho
*/
public int getYear(){
  return year;
}

/**
*Description este metodo establece el anho
*@param el anho
*/
public void setYear(int year){
  this.year = year;
}

/**
*Description este metodo obtiene los dias
*@return los dias que se van a utilizar
*/
public int getFrecuencyOfTheMedicament(int actualDay , int actualMonth, int actualYear){

	int dia = 0;
	int diaActual = 0;
	int diasCorridos = 0;
	int diasPreciso = 0;

	dia += (actualMonth - month)*30;
	diaActual += (actualDay - dia);
	diasCorridos += (actualYear - year)*360;

	diasPreciso += (dia + diaActual + diasCorridos);

  return diasPreciso;
}
}
