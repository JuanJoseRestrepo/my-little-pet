
package model;

import java.util.ArrayList;

public class Veterinary{

//COnstantes

public static final int NUMBEROFROOM = 8 ;

//Atributos

private String name;

//Relaciones
private Room [] miniRoom;
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

public void addClient(Client client,ArrayList<Pet> pet3){

clients.add(client);
pet2.add(pet3);

}

public Room dispobinilityRoom(){
  Room dispo = null;

  for(int i= 0; i < miniRoom.length ; i++){
    if(miniRoom[i] != null){
        dispo = null;
      } else{
        dispo = miniRoom[i];
      }
    }
  }

  return dispo;
}

public String infoPet1(){
String msj = "";
 for(int i = 0 ; i<clients.size(); i++){
  msj += clients.idClient();
  msj += clients.infoPet();
}
return msj;
}









}
