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
  System.out.println("Bienvenido a mi pequeña mascota");

  while(userImput != 2){
    userImput =reader.nextInt();
    reader.nextLine();

   if(userImput == 1){
     System.out.println("Digite su id");
     String id = reader.nextLine();
     System.out.println(principal.infoPet1(id));

   }else if(userImput == 2){
    ArrayList <Pet> pet3 = new ArrayList<Pet>();
   System.out.println("Digite el nombre del usuario");
   String name = reader.nextLine();

   System.out.println("Digite su identificacion");
   String iden = reader.nextLine();

   System.out.println("Digite su dirección ");
   String addres = reader.nextLine();

   System.out.println("Digite su celular");
   String celular = reader.nextLine();

   Client client = new Client(name,iden,addres,celular);

   System.out.println("Digite el nombre de su mascota ");
   String nameP = reader.nextLine();

   System.out.println("Digite la edad de su mascota ");
   int ageOfM = reader.nextInt();
   reader.nextLine();
   System.out.println("Digite el tipo de su mascota ");
   String typeOfM = reader.nextLine();

   System.out.println("Digite el peso de su mascota ");
    double weightOfM = reader.nextDouble();
     reader.nextLine();

   pet3.add(new Pet(nameP, ageOfM, typeOfM, weightOfM));

   System.out.println(principal.addClient(client,pet3));

 } else {
   System.out.println("Adios");
 }

}
}

public void init(){




}








}
