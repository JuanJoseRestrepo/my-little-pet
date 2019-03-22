package ui;

import model.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main{

//Relaciones

private Veterinary principal;
private Scanner reader;


public Main(){
  init();
  reader = new Scanner(System.in);

}

public static void main(String[] args) {
  Main m = new Main();
  m.showMenu();

}
public void showMenu(){
  int userImput =0;
System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////BIENVENIDO A MI PEQUENHA MASCOTA///////////////////////////////////");
System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("--------------------------------------------------------------------------------------------");
System.out.println("|              .....                  .............                                         |");
System.out.println("|          .....;;...                ................                                       |");
System.out.println("|      .......;;;;;/mmmmmmmmmmmmmm//..................                                      |");
System.out.println("|     ........;;;mmmmmmmmmmmmmmmmmmm.....................                                   |");
System.out.println("|   .........;;m/;;;;/mmmmmm/;;;;;/m......................                                  |");
System.out.println("|..........;;;m;;mmmm;;mmmm;;mmmmm;;m......................                                 |");
System.out.println("|..........;;;;;mmmnnnmmmmmmmmmmnnnmmmm/....................                                |");
System.out.println("|.........  ;;;;;n/#####/nmmmmn/#####/nmm/.................                                 |");
System.out.println("|.......     ;;;;n##...##nmmmmn##...##nmmmm/.............                                   |");
System.out.println("|....        ;;;n#.....|nmmmmn#.....#nmmmmm,l.........                                      |");
System.out.println("|..          mmmn/.../nmmmmmmn/.../nmmmm,m,lll.....                                         |");
System.out.println("|        /mmmmmmmmmmmmmmmmmmmmmmmmmmm,mmmm,llll..                                           |");
System.out.println("|    /mmmmmmmmmmmmmmmmmmmmmmm/mmmmn/mmmmmmm,lll/                                            |");
System.out.println("| /mmmmm/........../mmmmmmmmmmnnmnnmmmmmmmmm,ll                                             |");
System.out.println("|mmmmmm|...........|mmmmmmmmmmmmmmmmmmmmmmmm,ll                                             |");
System.out.println("|/mmmmmmm/......./mmmmmmmmmmmmmmmmmmmmmmmmm,llo                                             |");
System.out.println("|  /mmmmmmm/.../mmmmmmmmmmmmmmmmmmmmmmmmmm,lloo                                             |");
System.out.println("|    /mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm,ll/oooo                                            |");
System.out.println("|       /mmmmmmmmmmll..;;;.;;;;;;/mmm,lll/oooooo/                                           |");
System.out.println("|                 ll..;;;.;;;;;;/llllll/ooooooooo                                           |");
System.out.println("|                 ll.;;;.;;;;;/.llll/oooooooooo..o                                          |");
System.out.println("|                 ll;;;.;;;;;;..ll/ooooooooooo...oo                                         |");
System.out.println("|                 /;;;;.;;;;;..ll/ooooo...ooooo..oo/                                        |");
System.out.println("|               ;;;;;;;;;;;;..ll|oooo.....oooooooooo                                        |");
System.out.println("|              ;;;;;;.;;;;;;.ll/oooo.....ooooooo..../                                       |");
System.out.println("|              ;;;;;.;;;;;;;ll/ooooooooooooo.....oooo                                       |");
System.out.println("|               /;;;.;;;;;;/oooooooooooo.....oooooooo/                                      |");
System.out.println("|                /;;;.;;;;/ooooooooo.....ooooooooooooo                                      |");
System.out.println("|                  /;;;;/ooooooo.....ooooooooooo...ooo/                                     |");
System.out.println("|                  |o/;/oooo.....ooooooooooooo......ooo                                     |");
System.out.println("|                  oooooo....ooooooooooooooooooo.....oo/                                    |");
System.out.println("|                 oooo....oooooooooooooooooooooooo..oooo                                    |");
System.out.println("|                ___.oooooooooooooo....ooooooooooooooooo/                                   |");
System.out.println("|               /XXX/oooooooooooo.....ooooooooooooooooooo                                   |");
System.out.println("|               |XXX|ooooo.oooooo....ooooooooooooooooooooo                                  |");
System.out.println("|             /oo/X/oooo..ooooooooooooooooooo..oooooooooooo                                 |");
System.out.println("|           /ooooooo..ooooo..oooooooooooooo.....ooooooooo...                                |");
System.out.println("|         /ooooo...ooooo.....oooooooooooo.......ooooooo.....o                               |");
System.out.println("--------------------------------------------------------------------------------------------");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("//////////////////////////1.MOSTRAR LA INFORMACION DEL USUARIO///////////////////////////////");
System.out.println("//////////////////////////2.REGISTRARSE CON SU MASCOTA///////////////////////////////////////");
System.out.println("//////////////////////////3. BORRAR CLIENTE//////////////////////////////////////////////////");
System.out.println("//////////////////////////4.PARA HOSPITALIZAR////////////////////////////////////////////////");
System.out.println("//////////////////////////5.PARA VER DISPONIBILIDAD//////////////////////////////////////////");
System.out.println("//////////////////////////6.PARA DAR DE ALTA/////////////////////////////////////////////////");
System.out.println("//////////////////////////7.MOSTRAR HISTORIAL CLINICO DEL CUARTO/////////////////////////////");
System.out.println("//////////////////////////8.SALIR////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
  while(userImput != 8){
    userImput =reader.nextInt();
    reader.nextLine();
  //MIRAR QUE USUARIO TIENE ESA IDENTIFICACION
   if(userImput == 1){
     System.out.println("A continuacion digite su identificacion  ");
     System.out.println("ID");
     long id = reader.nextLong();
     reader.nextLine();

     principal.infoPet1(id);
  //REGISTRAR AL CLIENTE CON LA MASCOTA QUE EL DESEE
   }else if(userImput == 2){
   System.out.println("Digite el nombre del usuario");
   String name = reader.nextLine();

   System.out.println("Digite su identificacion");
   long iden = reader.nextLong();
   reader.nextLine();

   System.out.println("Digite su dirección ");
   String addres = reader.nextLine();

   System.out.println("Digite su celular");
   String celular = reader.nextLine();

   Client client = new Client(name,iden,addres,celular);

   System.out.println("Digite cuantas mascotas quiere tener ");
   int numberOfUser = reader.nextInt();

   for(int i = 0; i < numberOfUser; i++){

   System.out.println("Digite el nombre de su mascota ");
   String nameP = reader.nextLine();

   System.out.println("Digite la edad de su mascota ");
   int ageOfM = reader.nextInt();
   reader.nextLine();

   System.out.println("Digite el tipo de su mascota ");

   System.out.println("Perro ");
   System.out.println("Gato ");
   System.out.println("Pajaro ");
   System.out.println("Otro ");

   String typeOfM = reader.nextLine();

   System.out.println("Digite el peso de su mascota ");
   double weightOfM = reader.nextDouble();
   reader.nextLine();

   Pet pet3 = new Pet(nameP, ageOfM, typeOfM, weightOfM);

   principal.getClients().get(i).addPet(pet3);

   principal.addClient(client);
   }
 } else if(userImput == 2) {
   System.out.println("Adios");
   int idClient = reader.nextInt();
   reader.nextLine();

   String petName = reader.nextLine();
 //TENEMOS QUE ELIMINAR
 } else if( userImput ==3){

    System.out.println("¿A cual Cliente con su animalito desea borrar?");
    int numb = reader.nextInt();
    reader.nextLine();

    principal.getOutAnimal(numb);
  }else if(userImput == 4){

  }else if(userImput ==5){

  }else if(userImput ==6){

  }else if(userImput ==7){

    //SALIR DEL PROGRAMA
 }else{
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("/////////////////////////VUELVE PRONTO GUA GUA//////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("|                                   / /__                                                  |");
   System.out.println("|                                  (    @/___                                              |");
   System.out.println("|                                  /         O                                             |");
   System.out.println("|                                 /   (_____/                                              |");
   System.out.println("|                                /_____/   U                                               |");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
 }

}
}
// DE AHI EN ADELANTE ES CREAR LOS CLIENTES POR DEFECTO
public void init(){

principal = new Veterinary("Mi pequenhaa mascota");

}

public void addingClients(){

  principal.addClient(new Client("Ayuwoki",1234,"Cra 29a #10b-118", "310456097"));
  principal.addClient(new Client("Eunice",4321,"Calle 5 #10b- 1c", "3104509897"));
  principal.addClient(new Client("JhonJairo",2341,"Tras 2a #1c -13 ", "310466780"));
  principal.addClient(new Client("Clara",3421,"Cra 28b #1d -14", "310906097"));
  principal.addClient(new Client("Valeria",4123,"Calle 29a #118", "31126097"));
  principal.addClient(new Client("Suarez",3213,"Calle 1c #10b", "312556097"));
  principal.addClient(new Client("Carlos",1122,"Cra 13 #1c -10", "3111456097"));
  principal.addClient(new Client("Melissa",3311,"Cra 22c #10b -113", "332456097"));

}

public void addingPets(){
principal.getClients().get(0).addPet(new Pet("Carlos", 12,"Perro", 12.3));
principal.getClients().get(1).addPet(new Pet("Spunky", 8,"Gato", 23.1));
principal.getClients().get(2).addPet(new Pet("Bella", 2,"Pajaro", 10.0));
principal.getClients().get(3).addPet(new Pet("Lupe", 1,"Otro", 9.5));
principal.getClients().get(4).addPet(new Pet("Oddie", 17,"Perro", 12.9));
principal.getClients().get(5).addPet(new Pet("Lennon", 4,"Perro", 31.0));
principal.getClients().get(6).addPet(new Pet("Steve del Maincraft", 7,"Otro", 50.0));
principal.getClients().get(7).addPet(new Pet("Eunice", 14,"Otro", 25.0));


}
public void addingHistorial(){
Client c = null;
 c = principal.getClients().get(0);
 c.getPets().get(0).addHistory("Pulgas", "Grave", true,new HistorialDated(1,2,2000), new HistorialDated(3, 2 ,2000));
 c = principal.getClients().get(1);
 c.getPets().get(1).addHistory("Pulgas", "Grave", true, new HistorialDated(1,2,2000), new HistorialDated(3, 2 ,2000));
 c = principal.getClients().get(2);
 c.getPets().get(2).addHistory("Pulgas", "Grave", true, new HistorialDated(1,2,2000), new HistorialDated(3, 2 ,2000));
 c = principal.getClients().get(3);
 c.getPets().get(3).addHistory("Pulgas", "Grave", true, new HistorialDated(1,2,2000), new HistorialDated(3, 2 ,2000));
 c = principal.getClients().get(4);
 c.getPets().get(4).addHistory("Pulgas", "Grave", true, new HistorialDated(1,2,2000), new HistorialDated(3, 2 ,2000));
 c = principal.getClients().get(5);
 c.getPets().get(5).addHistory("Pulgas", "Grave", true, new HistorialDated(1,2,2000), new HistorialDated(3, 2 ,2000));
 c = principal.getClients().get(6);
 c.getPets().get(6).addHistory("Pulgas", "Grave", true, new HistorialDated(1,2,2000), new HistorialDated(3, 2 ,2000));
 c = principal.getClients().get(7);
 c.getPets().get(7).addHistory("Pulgas", "Grave", true, new HistorialDated(1,2,2000), new HistorialDated(3, 2 ,2000));
}

public void addingMedicaments(){

principal.getClients().get(0).getPets().get(0).getClientWithHisto().get(0).addMedicaments("Dolex", 12.0,1200,2 );
principal.getClients().get(1).getPets().get(1).getClientWithHisto().get(1).addMedicaments("Dolex", 12.0,1200,2 );
principal.getClients().get(2).getPets().get(2).getClientWithHisto().get(2).addMedicaments("Dolex", 12.0,1200,2 );
principal.getClients().get(3).getPets().get(3).getClientWithHisto().get(3).addMedicaments("Dolex", 12.0,1200,2 );
principal.getClients().get(4).getPets().get(4).getClientWithHisto().get(4).addMedicaments("Dolex", 12.0,1200,2 );
principal.getClients().get(5).getPets().get(5).getClientWithHisto().get(5).addMedicaments("Dolex", 12.0,1200,2 );
principal.getClients().get(6).getPets().get(6).getClientWithHisto().get(6).addMedicaments("Dolex", 12.0,1200,2 );
principal.getClients().get(7).getPets().get(7).getClientWithHisto().get(7).addMedicaments("Dolex", 12.0,1200,2 );




}





}
