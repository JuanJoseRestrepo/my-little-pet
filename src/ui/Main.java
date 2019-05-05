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
System.out.println("//////////////////////////4.HOSPITALIZAR ////////////////////////////////////////////////////");
System.out.println("//////////////////////////5.CALCULAR LOS INGRESOS////////////////////////////////////////////");
System.out.println("//////////////////////////6.PARA DAR DE ALTA/////////////////////////////////////////////////");
System.out.println("//////////////////////////7.MOSTRAR INFO CLIENTES////////////////////////////////////////////");
System.out.println("//////////////////////////8.MOSTRAR INFO MINICUARTOS/////////////////////////////////////////");
System.out.println("//////////////////////////9.ACTUALIZAR DIRECCION Y NUMERO////////////////////////////////////");
System.out.println("//////////////////////////10.AGREGAR MEDICINA////////////////////////////////////////////////");
System.out.println("//////////////////////////11.AGREGAR NOTAS///////////////////////////////////////////////////");
System.out.println("//////////////////////////12.AGREGAR SINTOMAS////////////////////////////////////////////////");
System.out.println("//////////////////////////13.MOSTRAR EL CALCULO DE LOS INGRESOS//////////////////////////////");
System.out.println("//////////////////////////14.EL COSTO DE SERVICIOS PROMEDIADOS///////////////////////////////");
System.out.println("//////////////////////////15.EL COSTO TOTAL DE LOS SERVICIOS ////////////////////////////////");
System.out.println("//////////////////////////16.INGRESAR UN NUEVO SERVICIO//////////////////////////////////////");
System.out.println("//////////////////////////17.MOSTRAR LA INFO CON FECHA INICIAL Y LA FINAL////////////////////");
System.out.println("//////////////////////////18.MOSTRAR EL CALCULO DE UNA SEMANA////////////////////////////////");
System.out.println("//////////////////////////19.SALIR///////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");

  while(userImput != 19){
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

   System.out.println("Digite la altura de su mascota");

   double heightOfP = reader.nextDouble();
   reader.nextLine();

   Pet pet3 = new Pet(nameP, ageOfM, typeOfM, weightOfM,heightOfP,client);
   clientsPets.add(pet3);
   principal.addClient(client,clientsPets);
   System.out.println("Se ha añadido la mascota con exito");
 }
   //principal.addClient(client,clientsPets);
 //TENEMOS QUE ELIMINAR
 } else if( userImput ==3){

   System.out.println(principal.showClinicalHistories());

  }else if(userImput == 4){
    System.out.println(principal.showClients());
    System.out.println("Ponga el id del cliente");
    long clientId = reader.nextLong();
    reader.nextLine();

    System.out.println("Ponga el nombre de la mascota");
    String petName = reader.nextLine();

    System.out.println("SOLO CREAR HISTORIAS CLINICAS DE PACIENTES HOSPITALIZADOS");

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

    System.out.println("POR CUESTIONES DE SEGURIDAD Y DEL USUARIO DIGITE LO SIGUIENTE:");

    System.out.println("Digite el dia de salida que usted cree que el animalito va a salir");
    int dai2 = reader.nextInt();
    reader.nextLine();

    System.out.println("Digite el mes de salida que usted cree que el animalito va a salir");
    int mon2 = reader.nextInt();
    reader.nextLine();

    System.out.println("Digite el año de salida que usted cree que el animalito va a salir");
    int yea2 = reader.nextInt();
    reader.nextLine();

    HistorialDated dateOut = new HistorialDated(dai2, mon2, yea2);

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
    reader.nextLine();

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

    Pet pet2 = principal.findPett(nameClie, idClie, namePe);

    ClinicalHistory newMedRec = new ClinicalHistory( nameClie, namePe , symp, diag, stat, dateIn,dateOut, pet2);

    Medicament medics = new Medicament(medi, dos, totaldos, frec);

    principal.hospitalizeVet(nameClie,idClie,namePe, newMedRec, medics);

    System.out.println(principal.hospitalize(clientId, petName));

  }else if(userImput ==5){
     System.out.println("Digite el tipo de animal de su Mascota");
     System.out.println("Perro ");
     System.out.println("Gato ");
     System.out.println("Pajaro ");
     System.out.println("Otro ");
     String typeAnimal = reader.nextLine();

    System.out.println("Digite el peso de de su Mascota");
     double weight = reader.nextDouble();
     reader.nextLine();

     System.out.println("Por favor digite el dia actual");
     int actualDay = reader.nextInt();
     reader.nextLine();

     System.out.println("Por favor digite el mes actual");
     int actualMonth = reader.nextInt();
     reader.nextLine();

     System.out.println("Por favor digite el año actual");
     int actualYear = reader.nextInt();
     reader.nextLine();

     principal.costOfhospis(typeAnimal, weight,actualDay, actualMonth, actualYear);
     System.out.println(principal.costOfhospis(typeAnimal,weight,actualDay, actualMonth, actualYear));


  }else if(userImput ==6){
    System.out.println(principal.showClients());

    System.out.println("Por favor digite la identificacion del usuario para dar de alto a su animal");
    long idClientt = reader.nextLong();
    reader.nextLine();

    System.out.println("Por favor digite el nombre de la mascota para darlo de alto");
    String nampe = reader.nextLine();

    System.out.println("UNA VEZ REALIZADA ESTA ACCION, SE SACARA AL ANIMALITO DEL CUARTO");

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

    System.out.println("Digite el dia de salida");
    int dai2 = reader.nextInt();
    reader.nextLine();

    System.out.println("Digite el mes de salida");
    int mon2 = reader.nextInt();
    reader.nextLine();

    System.out.println("Digite el año de salida ");
    int yea2 = reader.nextInt();
    reader.nextLine();

    HistorialDated dateOut = new HistorialDated(dai2, mon2, yea2);

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
    reader.nextLine();

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

    Pet pet2 = principal.findPett(nameClie, idClie, namePe);

    ClinicalHistory newMedRec = new ClinicalHistory( nameClie, namePe , symp, diag, stat, dateIn,dateOut, pet2);

    Medicament medics = new Medicament(medi, dos, totaldos, frec);

    principal.hospitalizeVet(nameClie, idClie, namePe, newMedRec, medics);


    System.out.println(principal.findToHospitalize(idClientt,nampe));

    //SALIR DEL PROGRAMA
 }else if( userImput == 7){
     System.out.println("Mostrar la informacion");

     System.out.println(principal.showClients());

 }else if( userImput == 8){

  System.out.println(principal.showRoom());

}else if( userImput == 9){

System.out.println("Digite el id del cliente por favor");
long idClientToVeterinary = reader.nextLong();
reader.nextLine();

System.out.println("Digite la dirección que quiere actualizar por favor");
String addresClientToVeterinary = reader.nextLine();

System.out.println("Por favor digite el telefono que quiere actualizar por favor");
String phoneClientToVeterinary = reader.nextLine();

System.out.println(principal.actualizePhoneAndAddressOfCLient(idClientToVeterinary,addresClientToVeterinary,phoneClientToVeterinary));

}else if(userImput == 10){

System.out.println("Digite el id del usuario para poder buscarlo");
long clientForVeterinary = reader.nextLong();
reader.nextLine();

System.out.println("Digite el nombre de la mascota del dueño");
String namePetLupe = reader.nextLine();

System.out.println("Digite el nombre del medicamento");
String medicamentForVeterinary = reader.nextLine();

System.out.println("Digite la dosis del medicamento");
double doseForVeterinary = reader.nextDouble();
reader.nextLine();

System.out.println("Digite el costo de la medicina");
double costForVeterinary = reader.nextDouble();
reader.nextLine();

System.out.println("Digite la frecuencia del medicamento");
int frecForVeterinary = reader.nextInt();
reader.nextLine();

System.out.println(principal.addMediceToHospitalization(clientForVeterinary,namePetLupe,medicamentForVeterinary, doseForVeterinary, costForVeterinary, frecForVeterinary));


}else if(userImput == 11){

  System.out.println("Por favor digite el id del cliente del animalito");
  long clientIdentify = reader.nextLong();
  reader.nextLine();

  System.out.println("Por favor digite el nombre del animal del dueño");
  String nameClientPet = reader.nextLine();


  System.out.println("Digite las notas que desea agregar al diagnostico del paciente");
  String notes = reader.nextLine();

  principal.addNotesToHospitalization(clientIdentify,nameClientPet,notes);

}else if(userImput == 12){

System.out.println("Digite el id del usuario");
long clientToPet = reader.nextLong();
reader.nextLine();

System.out.println("Digite el nombre del animal");
String petNameToPet = reader.nextLine();

System.out.println("Ahora por favor digite el nuevo sintoma del animalito");
String symptomPet = reader.nextLine();

principal.addNewSymptom(clientToPet,petNameToPet,symptomPet);

}else if(userImput == 13){

System.out.println("El costo del servicio de lavado de mascotas es:" + principal.calculatedService1());
System.out.println("El costo del servicio de lavado de mascotas a domicilios es:" + principal.calculatedService2());
System.out.println("El costo del servicio de corte de uñas de mascotas es:" + principal.calculatedService3());
System.out.println("El costo del servicio de profilaxis dental mascotas es:" + principal.calculatedService4());
System.out.println("El costo del servicio de aplicacion de vacunas para mascotas es:" + principal.calculatedService5());

}else if(userImput ==14){

System.out.println(principal.promediateCostOfServices());


}else if(userImput == 15){

System.out.println("El ingreso total de los servicios es:" + principal.calculatedCostTotalForTheService());

}else if(userImput == 16){
System.out.println("|--Por favor digite los siguientes digitos--|");

System.out.println("Por favor digite el tipo de servicio:" + typeOfService.service1 + "/"+ typeOfService.service2 + "/" + typeOfService.service3 + "/" + typeOfService.service4 + "/" +typeOfService.service5);
String serviceOf = reader.nextLine();

System.out.println("Por favor digite el costo:");
double costOfService = reader.nextDouble();
reader.nextLine();

System.out.println("Por favor digite el dia en el que se hace:");
String dateInService = reader.nextLine();

System.out.println("Por favor digite la identificacion del animalito:");
long identifyServicePet = reader.nextLong();
reader.nextLine();

System.out.println("Por favor digite la identificacion del cliente:");
long identifyServiceClient = reader.nextLong();
reader.nextLine();

System.out.println("Por favor digite el nombre de la mascota:");
String namePetService = reader.nextLine();

System.out.println("Por favor digite  la edad de la mascota:");
int agePetOld = reader.nextInt();
reader.nextLine();

System.out.println("Por favor digite el tipo de animal:" + Pet.DOG + "/" + Pet.CAT+ "/" + Pet.BIRD + "/" + Pet.OTHER);
String typeOfAnimalService = reader.nextLine();

System.out.println("Por favor digite el peso del animal:");
double weightAnimal = reader.nextDouble();
reader.nextLine();

System.out.println("Por favor digite la altura del animal:");
double heightAnimal = reader.nextDouble();
reader.nextLine();

System.out.println("Por favor digite el nombre de su dueño:");
String nameOfClientService = reader.nextLine();

System.out.println("Por favor digite la direccion:");
String clientDirection = reader.nextLine();

System.out.println("Por favor digite el numero:");
String numberOfClient = reader.nextLine();

Client theClient = new Client(nameOfClientService,identifyServiceClient,clientDirection,numberOfClient);
Pet p = new Pet(namePetService,agePetOld,typeOfAnimalService,weightAnimal,heightAnimal,theClient);
typeOfService m = new typeOfService(serviceOf,costOfService,dateInService,identifyServicePet,identifyServiceClient,p);

principal.addServiceWithPet(m,p);

}else if(userImput == 17){


System.out.println("Por favor digite la fecha inicial en el siguiente formato: AAAA-MM-DD");

String inicialDate = reader.nextLine();

System.out.println("Por favor digite la fecha final en el siguiente formato: AAAA-MM-DD");

String finalDate = reader.nextLine();

System.out.println(principal.getReportedAboutAnimalWithInicialDateAndFinalDate(inicialDate,finalDate));


}else if(userImput == 18){
  System.out.println("Digite el dia actual");
  int dayActual = reader.nextInt();
  reader.nextLine();

  System.out.println("Digite el mes actual");
  int monthActual = reader.nextInt();
  reader.nextLine();

  System.out.println("Digite el año actual");
  int actualYear = reader.nextInt();
  reader.nextLine();

  System.out.println(principal.calculatedCostForOneWeek(dayActual,monthActual,actualYear));



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

    Client Melissa = new Client("Melissa", 1005976323, "Sucre", "362141833");
		Pet Lupe = new Pet("Lupe",12, "Gato", 12.0,130.0,Melissa);
		ArrayList<Pet> PetsMelissa = new ArrayList<Pet>();
		PetsMelissa.add(Lupe);
		principal.addClient(Melissa,PetsMelissa);

		Client Jhonjairo = new Client("Jhon Jairo", 1006978545, "Cra 29a #10b -118", "2314525927");
		Pet Lennon = new Pet("Lennon", 13, "Perro", 23.0,130.0,Jhonjairo);
		ArrayList<Pet> PetsJhonjairo = new ArrayList<Pet>();
		PetsJhonjairo.add(Lennon);
		principal.addClient(Jhonjairo, PetsJhonjairo);

		Client Valeria = new Client("Valeria", 1002349856, "Calle 5a", "256441922");
		Pet Oddie = new Pet("Oddie",15, "Otro", 70.0,29.6,Valeria);
		Pet Bella = new Pet("Bella",19, "Perro", 39.0,87.0,Valeria);
		ArrayList<Pet> PetsValeria = new ArrayList<Pet>();
		PetsValeria.add(Oddie);
    PetsValeria.add(Bella);
		principal.addClient(Valeria,PetsValeria);

		Client Juanjose  = new Client("Juan Jose", 100987432, "Tras 2a #10b", "3132934055");
		Pet Spunky = new Pet("Spunky",2, "Gato",20.0,230.0,Juanjose);
		Pet Restrepo = new Pet("Restrepo",4,"Ave",3.2,134.8,Juanjose);
		ArrayList<Pet> PetsJuanjose = new ArrayList<Pet>();
		PetsJuanjose.add(Spunky);
    PetsJuanjose.add(Restrepo);
		principal.addClient(Juanjose, PetsJuanjose);

    Client Lina  = new Client("Lina", 100230032, "Siloe", "3132934055");
    Pet Yoko = new Pet("Yoko",9, "Otro",29.0,140.0,Lina);
    Pet Zeus = new Pet("Zeus",100,"Otro",113.2,150.0,Lina);
    ArrayList<Pet> PetsLina = new ArrayList<Pet>();
    PetsLina.add(Yoko);
    PetsLina.add(Zeus);
    principal.addClient(Lina, PetsLina);

    Client Ayuwoki  = new Client("Ayuwoki", 100123321, "Napoles", "3132934055");
    Pet Gucci = new Pet("Gang",9, "Otro",1220.0,156.0,Ayuwoki);
    ArrayList<Pet> PetsAyuwoki = new ArrayList<Pet>();
    PetsAyuwoki.add(Gucci);
    principal.addClient(Ayuwoki, PetsAyuwoki);

    Client Papo = new Client("Papo", 100987654,"La escritura MALO", "310123456");
    Pet Residente = new Pet("Residente", 12 , Pet.DOG, 120.0, 300.0, Papo);
    typeOfService s1 = new typeOfService(typeOfService.service1, typeOfService.washPets,"2008-08-12",(long)1009876541,(long)1009876541,Residente);

    principal.addServiceWithPet(s1,Residente);

    Client Cheto = new Client("Cheto", 100123456,"Sucre bueno", "3113072571");
    Pet Trump = new Pet("Trump", 17 , Pet.CAT, 150.0, 310.0, Cheto);
    typeOfService s2 = new typeOfService(typeOfService.service3, typeOfService.cutNails,"2010-03-13",(long)100123456,(long)100123456,Trump);

    principal.addServiceWithPet(s2,Trump);


    Room miniRoom1 = new Room(false, 1, Yoko);
		Room miniRoom2 = new Room(false, 2, Spunky);
		Room miniRoom3 = new Room(false, 3, Bella );
		Room miniRoom4 = new Room(false, 4, Zeus);
		Room miniRoom5 = new Room(false, 5, Oddie);
		Room miniRoom6 = new Room(false,6,Lennon);
		Room miniRoom7 = new Room(false, 7,Gucci);
		Room miniRoom8 = new Room(false, 8,Restrepo);
		principal.addMiniRoom(miniRoom1, miniRoom2, miniRoom3 ,miniRoom4, miniRoom5, miniRoom6, miniRoom7, miniRoom8);

}

}//final
