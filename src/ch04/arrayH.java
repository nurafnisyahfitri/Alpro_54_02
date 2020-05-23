package ch04;
public class arrayH {
    public static void main(String[] args){
        int array[]={82,12,41,38,19,26,9,48,20,55,8,32,3};
        int total=0;
        System.out.println("panjang Elemen Array="+ array.length);
        for(int i=0; i<array.length; i++){
            total+= array[i];
        }
        System.out.println("jumlah Elemen Array="+total);
    }
}
