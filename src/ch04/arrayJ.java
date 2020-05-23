package ch04;
public class arrayJ {
    public static void main(String[] args){
        int array[]={82,12,41,38,19,26,9,48,20,55,8,32,};
        int selisih;
        System.out.println("selisih angka genap didalam angka genap sebelumnya");
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if((array[i]%2==0)&&(array[j]%2==0)){
                    selisih=array[i]-array[j];
                    System.out.println("selisih"+array[i]+"selisih"+array[j]+":"+selisih);
                }
            }
        }
    }
}
