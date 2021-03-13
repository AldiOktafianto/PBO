
package Galon;

import java.util.Scanner;

public class Tugas {

  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  double galon,liter;

  System.out.print("masukan jumlah galon:");

  galon = scan.nextDouble();

  

  liter = galon * 3.785;

  

  System.out.print("jumlah liter="+liter);

  

  }

}


