package ch03;
import java.util.Scanner;
public class variabel {
    public static void main(String[] args){
        Scanner ck = new Scanner(System.in); 
        int x, y;
        System.out.println("masukan angka x");
        x = ck.nextInt();
        System.out.println("masukan angka y");
        y = ck.nextInt();
        if(x > y){
            System.out.println("nilai x tertingg");
        }
        else if(x < y) {
            System.out.println("nilai y tertinggi");
        }   
		else {
			System.out.println("tidak ada nilai tertinggi");
        }
            
        }
        
        
    }
    
