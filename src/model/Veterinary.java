
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

public Veterinary(String name){
this.name = name;
miniRoom = new Room[NUMBEROFROOM];
clients = new ArrayList<Client>();

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

}//finalxd
