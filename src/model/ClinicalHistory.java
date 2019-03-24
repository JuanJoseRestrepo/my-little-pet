package model;
import java.util.ArrayList;

public class ClinicalHistory{

//Constantes

private final static boolean STATE_OPEN = true;
private final static boolean STATE_CLOSE = false;

//Atributos
private String petInfo;
private String ownerInfo;
private String symptom;
private String diagnostic;
private boolean state;


//Relaciones
private ArrayList<Medicament> medicaments;
private HistorialDated date1;
private HistorialDated date2;
private Pet petsAll;

//Constructores

public ClinicalHistory(String petInfo, String ownerInfo,String symptom, String diagnostic, boolean state, HistorialDated date1,Pet petsAll){

this.symptom = symptom;
this.diagnostic = diagnostic;
this.state = state;
this.date1 = date1;
this.date2 = date2;
medicaments = new ArrayList<Medicament>();
}
public String getPetInfo(){
  return petInfo;
}
public void setPetInfo(String petInfo){
  this.petInfo = petInfo;
}
public String getOwnerInfo(){
  return ownerInfo;
}
public void setOwnerInfo( String ownerInfo){
  this.ownerInfo = ownerInfo;
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
public Pet getPetsAll(){
  return petsAll;
}
public void setPetsAll(Pet petsAll){
  this.petsAll = petsAll;
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
  msj += "El sintomas es:" + symptom;
  msj += "El diagnostico es:" + diagnostic;
  msj += "La fecha inicial es:" + inicialDate1();
  msj += "La fecha de Salida es:"  + finalDate2();
    for(int i = 0; i< medicaments.size(); i++){
  msj += medicaments.get(i).showInfoMedica();
}
  return msj;

}

//AGREGAR MEDICAMENTOS
public void addMedicaments(Medicament medic){

  medicaments.add(medic);

}

//COSTO POR HOSPITALIZACION
public double costOfHospitalizate(int actualDay, int actualMonth, int actualYear){

double total = 0.0;
int diasPreciso = date1.getFrecuencyOfTheMedicament(actualDay, actualMonth, actualYear);
for(int i = 0; i <  medicaments.size(); i++){
double doseXcost = medicaments.get(i).calculatedDose();

if(petsAll.getTypeOfPet().equals(Pet.CAT)){
	if(petsAll.getWeightPet() >= 1.0 && 3.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso * 10000)+ doseXcost;
	}else if(petsAll.getWeightPet() >= 3.1 && 10.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso* 12000)+ doseXcost;
	}else if(petsAll.getWeightPet() >= 10.1 && 20.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso * 15000)+ doseXcost;
 }else if(petsAll.getWeightPet() > 20.0 ){
	 total +=(double) (diasPreciso * 20000)+ doseXcost;
 }
} else if(petsAll.getTypeOfPet().equals(Pet.DOG)){
	if( petsAll.getWeightPet() >= 1.0 && 3.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso * 15000)+ doseXcost;
	}else if(petsAll.getWeightPet() >= 3.1 && 10.0 <= petsAll.getWeightPet()){
		total += (double)(diasPreciso * 17000)+ doseXcost;
	}else if(petsAll.getWeightPet() >= 10.1 && 20.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso * 20000)+ doseXcost;
 }else if(petsAll.getWeightPet() > 20.0 ){
	 total += (double) (diasPreciso * 25000)+ doseXcost;
 }

}else if(petsAll.getTypeOfPet().equals(Pet.BIRD)){
	if( petsAll.getWeightPet() >= 1.0 && 3.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso * 10000)+ doseXcost;
	}else if(petsAll.getWeightPet() >= 3.1 && 10.0 <= petsAll.getWeightPet()){
		total +=(double)  (diasPreciso * 12000)+ doseXcost;
	}else if(petsAll.getWeightPet() >= 10.1 && 20.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso * 20000)+ doseXcost;
 }else if(petsAll.getWeightPet() > 20.0 ){
	 total +=(double) (diasPreciso * 25000)+ doseXcost;
 }

}else if(petsAll.getTypeOfPet().equals(Pet.OTHER)){
	if(  petsAll.getWeightPet() >= 1.0 && 3.0 <= petsAll.getWeightPet()){
		total += (double)  (diasPreciso * 10000)+ doseXcost;
	}else if(petsAll.getWeightPet() >= 3.1 && 10.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso * 17000)+ doseXcost;
	}else if(petsAll.getWeightPet() >= 10.1 && 20.0 <= petsAll.getWeightPet()){
		total += (double) (diasPreciso * 30000)+ doseXcost;
 }else if(petsAll.getWeightPet() > 20.0 ){
	 total += (double) (diasPreciso * 30000)+ doseXcost;
 }

}

}
return total;

}

}
