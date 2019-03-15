package model;


public class ClinicalHistory{

//Constantes

private final static String STATE_OPEN = "abierto";
private final static String STATE_CLOSE = "cerrado";

//Atributos

private String symptom;
private String diagnostic;
private boolean state;

//Relaciones

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













}
