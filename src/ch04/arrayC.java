package ch04;
import java.util.Scanner;

public class arrayC {
    public static void main(String[] args){
        Scanner ck = new Scanner(System.in);
        int[] angka={82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("angka ganjil");
        for(int i=0; i<angka.length; i++){
            if(angka[i]%2!=0){
                System.out.println(angka[i]+"");
            }
        }
        }
    }

