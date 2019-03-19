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
public int getFrecuencyOfTheMedicament(int actualDay , int actualMonth){

int dia = 0;
int diasCorridos = 0;
int diasPreciso = 0;

dia += (month -1)* 30 + day;
diaActual += (actualMonth -1)* 30 + actualDay;

diasCorridos += 360-(dia + diaActual);

diasPreciso += (360 - diasCorridos)/7;

return diasPreciso;


}

}
