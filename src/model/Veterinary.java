
package model;

import java.util.ArrayList;

public class Veterinary{

//COnstantes

public static final int NUMBEROFROOM = 8 ;

//Atributos

private String name;

//Relaciones
private Room[] miniRoom;
private ArrayList<Client> clients;
private ArrayList<typeOfService> typeOfServiceVeterinary;

public Veterinary(String name){
this.name = name;
miniRoom = new Room[NUMBEROFROOM];
clients = new ArrayList<Client>();
typeOfServiceVeterinary = new ArrayList<typeOfService>();

}

public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}
public Room[] getMiniRoom(){
  return miniRoom;
}
public void setMiniRoom( Room[] miniRoom){
  this.miniRoom = miniRoom;
}
public ArrayList<Client> getClients(){
  return clients;
}
public void setClients( ArrayList<Client> clients){
  this.clients = clients;
}

public ArrayList<typeOfService> gettypeOfServiceVeterinary(){
		return typeOfServiceVeterinary;
	}

public void setTypeOfServiceVeterinary(ArrayList<typeOfService> typeOfServiceVeterinary){
		this.typeOfServiceVeterinary = typeOfServiceVeterinary;
	}

public void addServiceWithPet(typeOfService m , Pet p){

typeOfServiceVeterinary.add(m);
typeOfServiceVeterinary.get((typeOfServiceVeterinary.size()-1)).setPetsWithTypeOfService(p);
}

public void addMiniRoom(Room miniRoom1, Room miniRoom2,Room miniRoom3 , Room miniRoom4, Room miniRoom5, Room miniRoom6,Room miniRoom7,Room miniRoom8){
  miniRoom[0] = miniRoom1;
  miniRoom[1] = miniRoom2;
  miniRoom[2] = miniRoom3;
  miniRoom[3] = miniRoom4;
  miniRoom[4] = miniRoom5;
  miniRoom[5] = miniRoom6;
  miniRoom[6] = miniRoom7;
  miniRoom[7] = miniRoom8;
}

//COMPARAR QUE EL CLIENTE INGRESADO NO SEA EL MISMO
public String addClient2(Client client){
 String msj = "Se guardo exitosamente el cliente";
 boolean decide = true;
 int acum = 0;
for(int c = 0; c< clients.size() && decide == true; c++){
  if(client == clients.get(c)){
    msj = "no pueden haber dos clientes repetidos";
    decide = false;
  }else{
    acum++;
  }
}
if(acum == clients.size()){
  clients.add(client);
}

return msj;
}

/**
*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.
*pre: The client was created before.
*post: The address and /or phone number of the client is updated.
*@Param The new address of the client. This param could be empty.
*@Param The new phone number of the client. This param could be empty.
*/

public String actualizePhoneAndAddressOfCLient(long idClientToVeterinary , String addresClientToVeterinary , String phoneClientToVeterinary){

   String msj = "No se pudo actualizar porque no existe o no se encontro";
boolean f = false;

for(int o = 0; o < clients.size() && !f; o++){
  Client k = clients.get(o);
if(idClientToVeterinary == k.getIdentify()){

  k.setAddress(addresClientToVeterinary);
  k.setCellPhone(phoneClientToVeterinary);
  f = true;

  }
}

    if(f){
      msj = "Se actualizo su identidad del cliente";
    }

return msj;
}


//AGREGAR NUEVOS USUARIOS DENTRO DE LA VETERINARIA
public void addClient(Client client, ArrayList<Pet> clientsPets){

  clients.add(client);
  clients.get((clients.size()-1)).addPet(clientsPets);

}

//MIRAR SI HAY UN CUARTO DISPONIBLE PARA AGREGAR AL ANIMAL
  public String addPetToAvailableRoom (Pet current){

    String msg = "";
    boolean found = false;

    for(int i =0; i< miniRoom.length && !found; i++){

      if(miniRoom[i].getAvaible()){
        found = true;
        miniRoom[i].setPetRoom(current);
        miniRoom[i].setAvaible(false);

        msg = "Se agrego exitosamente a "+current.getNamePet()+" en el cuarto " + (i+1);
      }
    }
    if(!found){
      msg = "No se pudo hospitalizar porque no se encontro un cuarto vacio.";
    }

    return msg;
  }

public String showClients(){
  String msj = "";
  msj += clients.size();
   for(int i = 0 ; i<clients.size(); i++){
     msj +=  (i+1) + clients.get(i).infoClient();
  }
  return msj;

}
//MIRAR SI SE PEDE HOSPITALIZAR PIDIENDO PRIMERO LOS DOS DATOS INICIALES
public String hospitalize(long clientId, String petName){

  String msg = "";
  Pet p = null;
  for(int i =0; i<clients.size() && p==null; i++){
    if(clients.get(i).getIdentify() == clientId){
        p = clients.get(i).findPet(petName);
        if(p==null){
          msg = "El cliente no tiene una mascota con ese nombre";
        }
    }
  }
 if(p!=null){
  msg = addPetToAvailableRoom(p);
 }

  return msg;
}
  //MOSTRAR LA INFORMACION DE LA MASCOTA
  public String infoPet1(long id){
  String msj = "";
  boolean  race = false;

   for(int i = 0 ; i<clients.size() && !race; i++){
    if(id == clients.get(i).getIdentify()){

     msj = i + clients.get(i).infoClient();
     race = true;

   }else {
     msj = "No se contro un usario con ese id";
   }


    }
      return msj;
  }

//MOSTRAR LA INFORMACION DEL CUARTO
public String showRoom(){
String msj = "";

for(int i = 0 ; i < miniRoom.length; i++){
if(miniRoom[i] !=null){
 msj += miniRoom[i].showInfoRoomPetHospit();
}else {
  msj += "No se encontro ningun cuarto";
}

}
    return msj;
}

//DAR DE ALTA AL ANIMAL
public String darAlta(Pet petNames){
 boolean recorrido = false;
 String msj = "";
    for(int i = 0; i < miniRoom.length && !recorrido; i++){
      if(!miniRoom[i].getAvaible()){
        if(miniRoom[i].getPetRoom().equals(petNames)){
          miniRoom[i].setPetRoom(null);
          recorrido= true;
          miniRoom[i].setAvaible(true);
          msj = "Se saco el animalito del cuarto";
        }
      }else{
        msj = "No se encontro su animal hospitalizado";
      }
    }
    return msj;
  }

public boolean avaibleRoom(){
boolean f = false;

for(int i = 0; i < miniRoom.length; i++){
  if(miniRoom[i].getAvaible()){
   f = true;
 }

}
  return f;
}


public Pet findPett(String nameClie, long idClie, String  namePe){

		boolean theStop = false;
    Pet relationshipOfPet = null;

		for(int i= 0;i < clients.size() && !theStop;i++){
			if (!clients.get(i).getNameClient().equals(nameClie) && clients.get(i).getIdentify() == idClie){
        relationshipOfPet = clients.get(i).findPet(namePe);

				theStop = true;
			}
		}

		return relationshipOfPet;

	}

		public void hospitalizeVet(String nameClie, long idClie , String namePe, ClinicalHistory newMedRec, Medicament medic){
		boolean theStop = false;

		for(int i = 0;i < clients.size() && !theStop;i++){
			if(clients.get(i).getNameClient().equals(nameClie) && clients.get(i).getIdentify() == idClie){

				theStop = true;
				clients.get(i).startHospita(namePe, newMedRec, medic);


			}else{
        Pet petRelation = clients.get(i).findPet(namePe);

      }

		}
	}
//Posibles fechas clinicas
public String showClinicalHistories(){

String clinical = "";


for(int i = 0; i < clients.size(); i++){

  clinical += clients.get(i).showInfoHospi();

  }
  return clinical;
}

public String findToHospitalize(long idClientt, String nampe){
  String msg = "";
  Pet p = null;
  for(int i =0; i<clients.size() && p==null; i++){
    if(idClientt == clients.get(i).getIdentify()){
        p = clients.get(i).findPet(nampe);
        if(p==null){
          msg = "El cliente no tiene una mascota con ese nombre";
        }
      }
  }
 if(p!=null){
  msg = darAlta(p);
 }

  return msg;
}

public String costOfhospis(String typeAnimal, double weight,int actualDay, int actualMonth, int actualYear){
String msj = "";

for(int i = 0; i < miniRoom.length ;i++){

msj = miniRoom[i].costOfhospi(typeAnimal, weight, actualDay, actualMonth, actualMonth);

}

return msj;

}

/**
*Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
*pre: The patient clinic story must be not null.
*post: New medicines were added to the patient clinic story.
*@param The medicine name. This param must be not null.
*@param The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned. This param must be not null.
*@param The medicine cost by each dose. This param could be empty.
*@param The frequency of medicine application. This param could be empty.
*@return A message that indiques if medicine was added to the patient clinic story
*/

public String addMediceToHospitalization(long clientForVeterinary,String namePetLupe,String medicamentForVeterinary, double doseForVeterinary, double  costForVeterinary, int frecForVeterinary){
String msj = "";
boolean f = false;
for(int i = 0; i < miniRoom.length && !f; i++){
  if(miniRoom[i] != null){
    if(miniRoom[i].getPetRoom().getCli1().getIdentify() == clientForVeterinary){
    if(miniRoom[i].getPetRoom().getNamePet().equals(namePetLupe)){
      msj = "Se agrego el medicamento" + miniRoom[i].addMedicamentsToPet(medicamentForVeterinary,doseForVeterinary,costForVeterinary,frecForVeterinary);
      f = true;
    }
  }
}
}
return msj;
}

public void addNotesToHospitalization(long clientIdentify, String nameClientPe, String notes){

boolean perro = false;

for(int i = 0; i < miniRoom.length && perro == false; i++){
  if(miniRoom[i] != null){
    if(miniRoom[i].getPetRoom().getCli1().getIdentify() == clientIdentify){
    if(miniRoom[i].getPetRoom().getNamePet().equals(nameClientPe)){
      miniRoom[i].addNotesToPet(notes);
      perro = true;
    }
    }
  }
  }
}


public void addNewSymptom(long clientToPet, String petNameToPet,String symptomPet){

boolean stop = false;
for(int i = 0; i < miniRoom.length && !stop ; i++){
  if(miniRoom[i] != null){
    if(miniRoom[i].getPetRoom().getCli1().getIdentify() == clientToPet){
    if(miniRoom[i].getPetRoom().getNamePet().equals(petNameToPet)){
      miniRoom[i].addNotesToSympTom(symptomPet);
      stop = true;
  }
}
}
}
}

public double calculatedService1(){
  double m = 0.0;

for(int k = 0; k < typeOfServiceVeterinary.size(); k++){
typeOfService services = typeOfServiceVeterinary.get(k);

if(services.getService().equals(typeOfService.service1)){
  m += typeOfService.washPets;
}

}
return m;
}

public double calculatedService2(){
double m = 0.0;

for(int k = 0; k < typeOfServiceVeterinary.size(); k++){
typeOfService services = typeOfServiceVeterinary.get(k);

if(services.getService().equals(typeOfService.service2)){
  m += typeOfService.washPetsDelivery;
}
}
  return m;
}

public double calculatedService3(){
double m = 0.0;

for(int k = 0; k < typeOfServiceVeterinary.size();k++){
typeOfService services = typeOfServiceVeterinary.get(k);

if(services.getService().equals(typeOfService.service3)){
m += typeOfService.cutNails;
}

}
return m;
}

public double calculatedService4(){
double m = 0.0;

for(int k = 0; k < typeOfServiceVeterinary.size(); k++){
  typeOfService services = typeOfServiceVeterinary.get(k);
  if(services.getService().equals(typeOfService.service4)){
    m += typeOfService.dentistProfi;
  }
}

return m;
}

public double calculatedService5(){
double m = 0.0;

for(int k = 0; k < typeOfServiceVeterinary.size(); k++){
typeOfService services = typeOfServiceVeterinary.get(k);

if(services.getService().equals(typeOfService.service5)){
  m += typeOfService.vacunnesAplication;
}
}
  return m;
}

///////////////
public int calculatedCostForServiceAparrance(){
	int k  = 0;

for(int i = 0; i < typeOfServiceVeterinary.size(); i++){
typeOfService services = typeOfServiceVeterinary.get(k);
	if(services.getService().equals(typeOfService.service1)){
			k++;
	}
}
return k;
}

public int calculatedCosForServicesAparrance2(){
int k = 0;

for(int i = 0; i < typeOfServiceVeterinary.size(); i++){
typeOfService services = typeOfServiceVeterinary.get(k);
	if(services.getService().equals(typeOfService.service2)){
			k++;
	}
}
return k;
}

public int calculatedCosForServicesAparrance3(){
int k= 0;

for(int i = 0; i < typeOfServiceVeterinary.size(); i++){
typeOfService services = typeOfServiceVeterinary.get(k);
  if(services.getService().equals(typeOfService.service3)){
  			k++;
  	}
  }
  return k;
}

public int calculatedCosForServicesAparrance4(){

int k = 0;

for(int i = 0; i < typeOfServiceVeterinary.size(); i++){
typeOfService services = typeOfServiceVeterinary.get(k);
  if(services.getService().equals(typeOfService.service4)){
  			k++;
  	}
  }
  return k;
}

public int calculatedCosForServicesAparrance5(){
int k =0;

for(int i = 0; i < typeOfServiceVeterinary.size(); i++){
typeOfService services = typeOfServiceVeterinary.get(k);
  if(services.getService().equals(typeOfService.service5)){
  			k++;
  	}
  }
  return k;
}




public double promediateCostOfServices(){
double costTotal = 0.0;

costTotal += (calculatedService1() + calculatedService2() + calculatedService3() + calculatedService4() + calculatedService5())/(calculatedCostForServiceAparrance()+calculatedCosForServicesAparrance2()+calculatedCosForServicesAparrance3()+calculatedCosForServicesAparrance4()+calculatedCosForServicesAparrance5());

return costTotal;

}

public double calculatedCostTotalForTheService(){
double m = 0.0;

m += (calculatedService1() + calculatedService2() + calculatedService3() + calculatedService4() + calculatedService5());

return m;

}

public String getReportedAboutAnimalWithInicialDateAndFinalDate(String inicialDate,String finalDate){
String msj = "";

for(int i = 0; i < typeOfServiceVeterinary.size();i++){

typeOfService sd1 = typeOfServiceVeterinary.get(i);

if(inicialDate.compareTo(sd1.getDateThatItDoIt()) <= 0 && sd1.getDateThatItDoIt().compareTo(finalDate) <= 0){

  msj = "La siguiente informacion es:" + sd1.serviceInformation();

}else{
  msj = "No se encontro la fecha o ingreso una fecha que no es o una equivocada";
}


}

return msj;

}





}//finalxd
