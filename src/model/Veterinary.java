
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
private ArrayList<ClinicalHistory> historyClinicals;

public Veterinary(String name){
this.name = name;
miniRoom = new Room[NUMBEROFROOM];
clients = new ArrayList<Client>();
histo = new ArrayList<HistorialHistory>();
}
public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}

public Room dispobinilityRoom(){
  Room dispo = null;

  for(int i= 0; i < miniRoom.length ; i++){
      Room disp1 = miniRoom[i].RoomState();
    if(dispo != null){
      if(dispo == null){
        dispo = disp1;
      }
    }
  }

  return dispo;
}

public String infoPet1(){
String msj = "";

  msj += clients.idClient();
  msj += clients.infoPet();

return msj;
}









}
