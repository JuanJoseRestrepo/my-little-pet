package model;


public class HistorialDated{

//Atributos
private int day;
private int month;
private int year;

//Constructores
/**
*Description este constructor inicializa las variables
*@param day int el dia
*@param month int el mes
*@param year int el anho
*/
public HistorialDated(int day, int month, int year){
  this.day = day;
  this.month = month;
  this.year = year;
}

/**
*Description este metodo obtiene el dia
*@return int el dia
*/
public int getDay(){
  return day;
}

/**
*Description este metodo establece el dia
*@param day int el dia
*/
public void setDay(int day){
  this.day = day;
}

/**
*Description este metodo obtiene el mes
*@return int el mes
*/
public int getMonth(){
  return month;
}

/**
*Description este metodo establece  el mes
*@param month int el mes
*/
public void setMonth(int month){
  this.month= month;
}

/**
*Description este metodo obtiene el anho
*@return int el anho
*/
public int getYear(){
  return year;
}

/**
*Description este metodo establece el anho
*@param year int el anho
*/
public void setYear(int year){
  this.year = year;
}

/**
*Description este metodo obtiene los dias
*@param actualDay el dia actual 
*@param actualMonth el mes actual
*@param actualYear el year actual
*@return int  los dias que se van a utilizar
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
