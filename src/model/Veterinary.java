
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
miniRoom[0] = new Room(true, 1, null);
miniRoom[1] = new Room(false, 2, new Pet("Spunky", 8,"Gato", 23.1));
miniRoom[2] = new Room(true, 3, null );
miniRoom[3] = new Room(true, 4, null);
miniRoom[4] = new Room(false, 5, new Pet("Oddie", 17,"Perro", 12.9));
miniRoom[5] = new Room(true, 6, null);
miniRoom[6] = new Room(false, 7,new Pet("Steve del Maincraft", 7,"Otro", 50.0));
miniRoom[7] = new Room(true, 8, null);
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
public void addClient(Client client){

  clients.add(client);
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

 for(int i = 0 ; i<clients.size(); i++){
  if(id == clients.get(i).getIdentify()){

   msj = clients.get(i).infoClient();
   msj = i + clients.get(i).infoClient();

} else{
  msj = "No existe el cliente";
 }
}
return msj;
}

//MOSTRAR LA INFORMACION DEL CUARTO
public String showRoom(){
String msj = "";

for(int i = 0 ; i < miniRoom.length; i++){
 if(miniRoom[i] != null){
 msj += miniRoom[i].showRoomInfo();

} else {
  msj += "No existe el cuarto";
  }
}
  return msj;
}
//ELIMINAR AL ANIMAL CON EL CLIENTE
public void getOutAnimal(int numb){
boolean recorrido = false;
String msj = "";
for(int i = 0; i < clients.size() && !recorrido; i++){
  if(clients != null){
    clients.get(i).deletedPet(numb);
    clients.remove(numb);
    msj = "Se elimino el cliente";
  } else{
    msj = "No existe el cliente";
  }
  }
}
//DAR DE ALTA AL ANIMAL
public String darAlta(Pet petName){
 boolean recorrido = false;
 String msj = "";
    for(int i = 0; i < miniRoom.length && !recorrido; i++){
      if(!miniRoom[i].getAvaible()){
        if(miniRoom[i].getPetRoom().equals(petName)){
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

}
