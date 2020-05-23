package ch04;
public class arrayI {
    public static void main(String[] args){
        int array[]={82,12,41,38,19,26,9,48,20,55,8,32,3};
        int selisih;
        for(int i=0; i<array.length; i++){
            selisih=array[i]-array[i+1];
            System.out.println("selisih="+selisih);
        }
    }
}
