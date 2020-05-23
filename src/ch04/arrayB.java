package ch04;
import java.util.Scanner;

public class arrayB {
  public static void main(String[] args){
      Scanner afni=new Scanner(System.in);
      int array[]={82,12,41,38,19,26,9,48,20,55,8,32,3};
      int arrayY;
      boolean benar=false;
      System.out.println("masukan Nilai array=");
      arrayY= afni.nextInt();
      for(int baris=0; baris<array.length; baris++){
          if(array[baris]==arrayY){
              System.out.println("\nNilai angka array:"+arrayY+"\nberada pada baris ke:"+baris);
              benar=true;
          }
      }
      if(benar==false){
          System.out.println("Nilai angka array:"+arrayY+"tidak ada dalam array ini");
      }
  }  
}
