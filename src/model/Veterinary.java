
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
private ArrayList<HistorialDated> histo;

public Veterinary(String name){
this.name = name;
miniRoom = new Room[NUMBEROFROOM];
clients = new ArrayList<Client>();
histo = new ArrayList<HistorialDated>();
}
public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}

public int dispobinilityRoom(){
  int dispo = 0;

  for(int i= 0; i < miniRoom.lenght ; i++){
    if(dispo != null){
      if(dispo == null){
        dispo += miniRoom[i];
      }
    }
  }

  return dispo;
}









}
