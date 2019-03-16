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
   System.out.println("Vuelva Pronto");
 } else {
   System.out.println("Adios");
 }

}
}

public void init(){




}








}
