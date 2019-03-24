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
System.out.println("/////////////////////////////////////XXXXXXXXX//////////////////////////////////////////////");
System.out.println("////////////////////////////////XXXXXXXXXXXXXXXXXXX/////////////////////////////////////////");
System.out.println("///////////////////////////XXXXXXXXXXXXXXXXXXXXXXXXXXXXX///////////////////////////////////");
System.out.println("//////////////////////////XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX///////////////////////////////////");
System.out.println("/////////////////////////BIENVENIDO A MI PEQUENHA MASCOTA///////////////////////////////////");
System.out.println("//////////////////////////XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX///////////////////////////////////");
System.out.println("/////////////////////////////XXXXXXXXXXXXXXXXXXXXXXXXX//////////////////////////////////////");
System.out.println("/////////////////////////////////XXXXXXXXXXXX///////////////////////////////////////////////");
System.out.println("////////////////////////////////////XXXXX///////////////////////////////////////////////////");
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
System.out.println("//////////////////////////3.MOSTRAR INFO MEDICA//////////////////////////////////////////////");
System.out.println("//////////////////////////4.PARA BUSCAR A SU MASCOTA EN EL HOSPITAL//////////////////////////");
System.out.println("//////////////////////////5.CREAR HISTORIAL CLINICO//////////////////////////////////////////");
System.out.println("//////////////////////////5.PARA VER DISPONIBILIDAD//////////////////////////////////////////");
System.out.println("//////////////////////////6.PARA DAR DE ALTA/////////////////////////////////////////////////");
System.out.println("//////////////////////////7.MOSTRAR HISTORIAL CLINICO DEL CUARTO/////////////////////////////");
System.out.println("//////////////////////////8.MOSTRAR INFO/////////////////////////////////////////////////////");
System.out.println("//////////////////////////9.SALIR////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
  while(userImput != 9){
    userImput =reader.nextInt();
    reader.nextLine();
  //MIRAR QUE USUARIO TIENE ESA IDENTIFICACION
   if(userImput == 1){
     System.out.println("A continuacion digite su identificacion  ");
     System.out.println("ID");
     long id = reader.nextLong();
     System.out.println(principal.infoPet1(id));

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

   System.out.println("Digite el numero de mascotas que quiere tener");
   int numberOfUser = reader.nextInt();
   reader.nextLine();

   ArrayList<Pet> clientsPets = new ArrayList<Pet>();

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
   clientsPets.add(pet3);
   principal.addClient(client,clientsPets);
   System.out.println("Se ha añadido la mascota con exito");
 }
   //principal.addClient(client,clientsPets);
 //TENEMOS QUE ELIMINAR
 } else if( userImput ==3){

   System.out.println(principal.showClinicalHistories());

  }else if(userImput == 4){

    System.out.println("Ponga el id del cliente");
    long clientId = reader.nextLong();
    reader.nextLine();

    System.out.println("Ponga el nombre de la mascota");
    String petName = reader.nextLine();

    System.out.println(principal.hospitalize(clientId, petName));

  }else if(userImput ==5){

      System.out.println("Digite el dia de ingreso");
      int dai = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el mes de ingreso");
      int mon = reader.nextInt();
      reader.nextLine();

      System.out.println("Digite el año de ingreso ");
      int yea = reader.nextInt();
      reader.nextLine();

      HistorialDated dateIn = new HistorialDated(dai, mon, yea);

      System.out.println("Digite el nombre del dueño ");
      String nameClie = reader.nextLine();

      System.out.println("Digite el id del cliente");
      long idClie = reader.nextLong();
      reader.nextLine();

      System.out.println("Digite el nombre completo de la mascota");
      String namePe = reader.nextLine();

      System.out.println("Digite el sintoma del animal");
      String symp = reader.nextLine();

      System.out.println("Digite el diagnostico ");
      String diag = reader.nextLine();

      System.out.println("Digite el estado");
      boolean stat = reader.nextBoolean();
      reader.nextInt();

      Pet pet2 = principal.retrievePet(nameClie, idClie, namePe);

      System.out.println("Por favor digite el numero de medicinas que quiere consumir el animalito");
      int medica = reader.nextInt();
      reader.nextLine();

      ClinicalHistory newMedRec = new ClinicalHistory("", "", symp, diag, stat, dateIn, pet2);

      System.out.println("Digite el nombre del medicamento");
      String medi = reader.nextLine();

      System.out.println("Digite la dosis");
      double dos = reader.nextDouble();
      reader.nextLine();

      System.out.println("Digite la total de dosis");
      double totaldos = reader.nextDouble();
      reader.nextLine();

      System.out.println("Digite la frecuencia del medicamento");
      int frec = reader.nextInt();
      reader.nextLine();

      Medicament medics = new Medicament(medi, dos, totaldos, frec);

      principal.startHospitalizeVet(nameClie, idClie, namePe, newMedRec, medics);


  }else if(userImput ==6){
     System.out.println("Por favor digite el dia actual");
     int actualDay = reader.nextInt();
     reader.nextLine();

     System.out.println("Por favor digite el mes actual");
     int actualMonth = reader.nextInt();
     reader.nextLine();

     System.out.println("Por favor digite el año actual");
     int actualYear = reader.nextInt();
     reader.nextLine();
     
     principal.calculatedPay(actualDay, actualMonth, actualYear);
     System.out.println(principal.calculatedPay(actualDay, actualMonth, actualYear));


  }else if(userImput ==7){

    //SALIR DEL PROGRAMA
 }else if( userImput == 8){
     System.out.println("Mostrar la informacion");

     System.out.println(principal.showClients());

 }else{
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
   System.out.println("/////////////////////////VUELVE PRONTO!!!!!!!!//////////////////////////////////////////////");
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

    Client Melissa = new Client("Melissa", 1006127263, "Infinite Loop", "362141833");
		Pet Lupe = new Pet("Lupe",12, "Gato", 12.0);
		ArrayList<Pet> PetsMelissa = new ArrayList<Pet>();
		PetsMelissa.add(Lupe);
		principal.addClient(Melissa,PetsMelissa);

		Client Jhonjairo = new Client("Jhon Jairo", 1003364632, "Cra 29a #10b -118", "2314525927");
		Pet Lennon = new Pet("Lennon", 13, "Perro", 23.0);
		ArrayList<Pet> PetsJhonjairo = new ArrayList<Pet>();
		PetsJhonjairo.add(Lennon);
		principal.addClient(Jhonjairo, PetsJhonjairo);

		Client Valeria = new Client("Valeria", 100360287, "Calle 5a", "256441922");
		Pet Oddie = new Pet("Paul",15, "Otro", 70.0);
		Pet Bella = new Pet("Daisy",19, "Dog", 39.0);
		ArrayList<Pet> PetsValeria = new ArrayList<Pet>();
		PetsValeria.add(Oddie);
    PetsValeria.add(Bella);
		principal.addClient(Valeria,PetsValeria);

		Client Juanjose  = new Client("Juan Jose", 1001223483, "Tras 2a #10b", "3132934055");
		Pet Spunky = new Pet("Spunky",2, "Cat",20.0);
		Pet Restrepo = new Pet("Restrepo",4,"Bird",3.2);
		ArrayList<Pet> PetsJuanjose = new ArrayList<Pet>();
		PetsJuanjose.add(Spunky);
    PetsJuanjose.add(Restrepo);
		principal.addClient(Juanjose, PetsJuanjose);

}






}
