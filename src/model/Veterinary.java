
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

/**
* Description Este es el constructor, inicializa las variables
* @param name String el nombre de la veterinaria
*/
public Veterinary(String name){
this.name = name;
miniRoom = new Room[NUMBEROFROOM];
clients = new ArrayList<Client>();
typeOfServiceVeterinary = new ArrayList<typeOfService>();

}

/**
* Description Este metodo obtiene el nombre de la veterinaria
* @return String retorna el nombre de la veterinaria
*/
public String getName(){
return name;
}

/**
* Description Este metodo establece el nombre de la VETERINARIA
* @param name String el nombre de la veterinaria
*/
public void setName(String name){
this.name = name;
}

/**
*Description Este metodo obtiene los MINICUARTOS
*@return miniRoom retorna el minicuarto
*/
public Room[] getMiniRoom(){
  return miniRoom;
}

/**
* Description Este metodo establece el MINICUARTOS
* @param miniRoom Room entra el minicuarto
*/
public void setMiniRoom( Room[] miniRoom){
  this.miniRoom = miniRoom;
}

/**
* Description Este metodo accede al arraylist de CLIENTES
* @return ArrayList<Client> Client retorna los clientes
*/
public ArrayList<Client> getClients(){
  return clients;
}

/**
*Description Este metodo establece el arraylist de CLIENTES
*@param clients ArrayList<Client> el arraylist de clientes
*/
public void setClients( ArrayList<Client> clients){
  this.clients = clients;
}

/**
*Description Este metodo obtiene el tipo de servicios
*@return ArrayList<typeOfService> el tipo de servicio
*/
public ArrayList<typeOfService> gettypeOfServiceVeterinary(){
		return typeOfServiceVeterinary;
	}

/**
*Description este metodo establece el tipo de servicios
*@param typeOfServiceVeterinary ArrayList<typeOfService> el tipo de servicio
**/

public void setTypeOfServiceVeterinary(ArrayList<typeOfService> typeOfServiceVeterinary){
		this.typeOfServiceVeterinary = typeOfServiceVeterinary;
	}

/**
*Description Este metodo agrega el tipo de servicios
*@param m typeOfService el tipo de servivio
*@param p Pet La mascota
*/
public void addServiceWithPet(typeOfService m , Pet p){

typeOfServiceVeterinary.add(m);
typeOfServiceVeterinary.get((typeOfServiceVeterinary.size()-1)).setPetsWithTypeOfService(p);
}

/**
*Description este metodo establece los MINICUARTOS
*@param miniRoom1  Room minicuarto 1
*@param miniRoom2  Room minicuarto 2
*@param miniRoom3  Room minicuarto 3
*@param miniRoom4  Room minicuarto 4
*@param miniRoom5  Room minicuarto 5
*@param miniRoom6  Room minicuarto 6
*@param miniRoom7  Room minicuarto 7
*@param miniRoom8  Room minicuarto 8
*/
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

/**
*Description Este metodo evalua si hay mas de dos CLIENTES
*pre: los clientes no deben ser nulos
*post: el mensaje
*@param client Client el clientes
*@return String el mensaje de si se puedo agregar
*/
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
*@param addresClientToVeterinary long The new address of the client. This param could be empty.
*@param phoneClientToVeterinary String The new phone number of the client. This param could be empty.
*@param idClientToVeterinary the identify client
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


/**
*Description Este metodo agrega el cliente con sus mascotas
*@param client Client el cliente
*@param clientsPets ArrayList<Pet> el arraylist de pets creados en el main
*/
public void addClient(Client client, ArrayList<Pet> clientsPets){

  clients.add(client);
  clients.get((clients.size()-1)).addPet(clientsPets);

}

/**
*Description este metodo evalua si se puede agregar un pet al minicuarto
*pre: Los minicuartos no deben ser nulos
*@param current Pet el pet para evaluarlo
*@return String un mensaje diciendo si se puede agregar
*/
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
/**
*Description este metodo muestra la info de los CLIENTES
*pre: los clientes != null
*@return String  la informacion del cliente
*/
public String showClients(){
  String msj = "";
  msj += clients.size();
   for(int i = 0 ; i<clients.size(); i++){
     msj +=  (i+1) + clients.get(i).infoClient();
  }
  return msj;

}
/**
*Description este metodo evalua si se puede hospitalizar a un animal
*pre: los clientes != null
*post: un mensaje diciendo si se puede agregar
*@param petName String la identificacion del cliente
*@param clientId long  nombre del animalito
*@return un mensaje
*/
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
/**
*Description este metodo muestra la informacion del cliente
*@param id long el id del cliente
*@return String un mensaje con la informacion
*/
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

/**
*Description este metodo muestra la informacion del CUARTO
*pre: los minicuartos != null
*post: un mensaje diciendo si se puede MOSTRAR
*@return String un mensaje
*/
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

/**
*Description este metodo da de alta a un animalito hospitalizado en un minicuartos
*pre: el minicuarto != null
*post: sacar al animalito del minicuarto
*@param petNames Pet el nombre del animalito
*@return String un mensaje que diga si se saco al animalito
*/
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

/**
*Description este metodo encuentra a un animalito y a su cliente
*pre: clientes != null
*@param nameClie String el nombre del cliente
*@param idClie long la identificiacion del cliente
*@param namePe String el nombre del pet del cliente
*@return el animalito si se encontro
*/
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
/**
*Description este metodo hospitaliza a un animalito
*@param nameClie String el nombre del cliente
*@param idClie long la identificacion del cliente
*@param namePe String el nombre del animalito
*@param newMedRec ClinicalHistoryuna historia clinica del animalito
*@param medic Medicament un medicamento del animalito
*/
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
/**
*Description este metodo muestra las historias clinicas
*pre: historias clinicas != null
*pre: clientes != null
*@return String muestra la informacion de las historias clinicas
*/
public String showClinicalHistories(){

String clinical = "";


for(int i = 0; i < clients.size(); i++){

  clinical += clients.get(i).showInfoHospi();

  }
  return clinical;
}
/**
* Description este metodo busca si se puede hospitalizar a un ANIMALITO
* pre: clientes != null
* pre: pets != null
* @param idClient long la identificacion del cliente
* @param  nampe St nombre del animalito
* @return String un mensaje que diga si se pudo hospitalizar
*/
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

/**
*Description este metodo mira el costo de hospitalizacion
*@param typeAnimal String el tipo de mascota
*@param weightt double el peso del animal
*@param actualDay int  dia actual
*@param actualMonth int el mes actual
*@param actualYear int  año actual
*@return el costo de hospitalizacion
*/
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
*@param clientForVeterinary long the identify of client 
*@param namePetLupe String the namePet
*@param medicamentForVeterinary String The medicine name. This param must be not null.
*@param doseForVeterinary double  The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned. This param must be not null.
*@param costForVeterinary double  The medicine cost by each dose. This param could be empty.
*@param frecForVeterinary int  The frequency of medicine application. This param could be empty.
*@return String  A message that indiques if medicine was added to the patient clinic story
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

/**
*Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.
*pre: The patient clinic story must be not null.
*post: New notes were added to the possible diagnostic in the patient clinic story.
*@param notes String The notes of possible diagnostic. This param must be not null.
*@param clientIdentify long the identify client
*@param nameClientPe String the name of the pet
*/

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

/**
*Description This method allows to add a new symptom presented during the hospitalization at the patient stories.
*pre: The patient clinic story must be not null.
*post: A new symptom were added to the patient clinic story.
*@param symptomPet String The new symptom presented. This param must be not null.
*/

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

/**
*Description esste metodo calcula el servicio 1
*pre: tipoDeServicio !=null
*post: el costo del servicio 1
*@return double el costo del servicio
*/
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

/**
*Description esste metodo calcula el servicio 2
*pre: tipoDeServicio !=null
*post: el costo del servicio 2
*@return double el costo del servicio
*/
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
/**
*Description esste metodo calcula el servicio 3
*pre: tipoDeServicio !=null
*post: el costo del servicio 3
*@return int el costo del servicio
*/
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
/**
*Description esste metodo calcula el servicio 4
*pre: tipoDeServicio !=null
*post: el costo del servicio 4
*@return el costo del servicio
*/
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

/**
*Description esste metodo calcula el servicio 5
*pre: tipoDeServicio !=null
*post: el costo del servicio 5
*@return int el costo del servicio
*/
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

/**
*Description esste metodo calcula cuantas veces aparece el servicio 1
*pre: tipoDeServicio !=null
*post: las veces que aparece el servicio 1
*@return int el numero de veces del servicio 1
*/
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

/**
*Description esste metodo calcula cuantas veces aparece el servicio 2
*pre: tipoDeServicio !=null
*post: las veces que aparece el servicio 2
*@return int el numero de veces del servicio 2
*/
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

/**
*Description esste metodo calcula cuantas veces aparece el servicio 3
*pre: tipoDeServicio !=null
*post: las veces que aparece el servicio 3
*@return  int el numero de veces del servicio 3
*/
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

/**
*Description esste metodo calcula cuantas veces aparece el servicio 4
*pre: tipoDeServicio !=null
*post: las veces que aparece el servicio 4
*@return int el numero de veces del servicio 4
*/
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

/**
* Description esste metodo calcula cuantas veces aparece el servicio 5
*pre: tipoDeServicio !=null
*@return int el numero de veces del servicio 5
*post: las veces que aparece el servicio 5
*/
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



/**
*Description esste metodo calcula el costo promedio de todos los servicios
*@return double el promedio total de todos los servicios
*/
public double promediateCostOfServices(){
double costTotal = 0.0;

costTotal += (calculatedService1() + calculatedService2() + calculatedService3() + calculatedService4() + calculatedService5())/(calculatedCostForServiceAparrance()+calculatedCosForServicesAparrance2()+calculatedCosForServicesAparrance3()+calculatedCosForServicesAparrance4()+calculatedCosForServicesAparrance5());

return costTotal;

}

/**
* Description esste metodo calcula el valor de todos los servicios
* @return double el calculo total de todos los servicios
*/
public double calculatedCostTotalForTheService(){
double m = 0.0;

m += (calculatedService1() + calculatedService2() + calculatedService3() + calculatedService4() + calculatedService5());

return m;

}
/**
*Description esste metodo genera un reporte acerca de la informacion que se encuentre en esas fechas
*pre: debe estar en formato AAAA-MM-DD
*@param inicialDate String la fecha inicial
*@param finalDate String la fecha final
*@return el servicio que se presento dentro de esas fechas
*/
public String getReportedAboutAnimalWithInicialDateAndFinalDate(String inicialDate,String finalDate){
String msj = "";

for(int i = 0; i < typeOfServiceVeterinary.size();i++){

typeOfService sd1 = typeOfServiceVeterinary.get(i);

if(inicialDate.compareTo(sd1.getDateThatItDoIt()) <= 0 && sd1.getDateThatItDoIt().compareTo(finalDate) <= 0){

  msj = "La siguiente informacion es:" + "\n" +sd1.serviceInformation();

}else{
  msj = "No se encontro la fecha o ingreso una fecha que no es o una equivocada";
}


}

return msj;

}

/**
* Description este metodo calcula los ingresos por una semana
* @param dayActual int el dia actual
* @param monthActual int el mes actual
* @param actualYear int el anho actual
* @return el costo por una semana
*/
public double calculatedCostForOneWeek(int dayActual, int monthActual, int actualYear){

double promediateWeek = 0.0;
int fechaActual = (dayActual + 7);

if(fechaActual > 30){
   promediateWeek = calculatedCostTotalForTheService()/(fechaActual % 30);
}else if(fechaActual < 30){
   promediateWeek = calculatedCostTotalForTheService()/fechaActual;
}


return promediateWeek;


}





}//finalxd
