
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
miniRoom[0] = new Room(true, 1);
miniRoom[1] = new Room(false, 2);
miniRoom[2] = new Room(true, 3);
miniRoom[3] = new Room(true, 4);
miniRoom[4] = new Room(false, 5);
miniRoom[5] = new Room(true, 6);
miniRoom[6] = new Room(false, 7);
miniRoom[7] = new Room(true, 8);
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


public String addClient(Client client){
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
public void addClient(Client client){

  clients.add(client);

}
public void addClient1(){

Client Ayuwoki = new Client("Ayuwoki","1234","Cra 29a #10b-118", "310456097");
Client Eunice = new Client("Eunice","4321","Calle 5 #10b- 1c", "3104509897");
Client JhonJairo = new Client("JhonJairo","2341","Tras 2a #1c -13 ", "310466780");
Client Clara = new Client("Clara","3421","Cra 28b #1d -14", "310906097");
Client Valeria = new Client("Valeria","4123","Calle 29a #118", "31126097");
Client Suarez = new Client("Suarez","3213","Calle 1c #10b", "312556097");
Client Carlos = new Client("Carlos","1122","Cra 13 #1c -10", "3111456097");
Client Melissa = new Client("Melissa","3311","Cra 22c #10b -113", "332456097");

clients.add(Ayuwoki);
clients.add(Eunice);
clients.add(JhonJairo);
clients.add(Clara);
clients.add(Valeria);
clients.add(Suarez);
clients.add(Carlos);
clients.add(Melissa);


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
      return dispo;
  }

public String infoPet1(String id){
String msj = "";
boolean f = false;

 for(int i = 0 ; i<clients.size() && !f; i++){
  if(id.equals(clients.get(i).getIdentify())){

  msj += clients.get(i).infoClient() + "\n";
  msj += clients.get(i).infoPet();
  f = true;

} else{
  msj = "No existe el cliente";
  f = false;
}
}
return msj;
}









}
