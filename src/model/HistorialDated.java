package model;


public class HistorialDated{

//Atributos
private int day;
private int month;
private int year;

//Constructores

public HistorialDated(int day, int month, int year){
  this.day = day;
  this.month = month;
  this.year = year;
}

public int getDay(){
  return day;
}
public void setDay(int day){
  this.day = day;
}
public int getMonth(){
  return month;
}
public void setMonth(){
  this.month= month;
}
public int getYear(){
  return year;
}
public void setYear(int year){
  this.year = year;
}
//OBTENER LOS DIAS ACTUALES
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
