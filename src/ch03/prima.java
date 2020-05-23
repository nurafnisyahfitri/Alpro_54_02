package ch03;
import java.util.Scanner;
public class prima {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bil,cek=0;
        System.out.println("masukkan angka:");
        bil = sc.nextInt();
        for(int i=2; i<=bil; i++){
            if(bil%i==0){
                cek++;
               
            }
        }
        if(cek==1){
            System.out.println("bilangan prima");
        }else{
            System.out.println("bukan bilangan prima");
        }
    }
}
