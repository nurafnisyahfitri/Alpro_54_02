package ch03;
import java.util.Scanner;
public class variabelZ {
    public static void main(String[] args){
        Scanner ck = new Scanner(System.in); 
        int x, y, z;
        System.out.println("masukan nilai x");
        x = ck.nextInt();
        System.out.println("masukan nilai y");
        y = ck.nextInt();
        System.out.println("masukan nilai z ");
        z = ck.nextInt(); 
        if((x > y) && (x > z)){
            System.out.println("nilai x tertingg");
        }
        else if((y > x) && (y > z)) {
            System.out.println("nilai y tertinggi");
        }  
        else if ((z > x) && (z > y)){
            System.out.println("nilai z tertinggi");
        }
        else {
            System.out.println("tidak ada nilai tertinggi");
        }
            
        }
        
        
    }
    

