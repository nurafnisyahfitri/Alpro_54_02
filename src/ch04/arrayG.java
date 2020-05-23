package ch04;
public class arrayG {
    public static void main(String[] args){
        int array[]={82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("bilangan kelipatan 5 dari array diatas adalah");
        for(int i=0; i<array.length; i++){
            if(array[i]%5==0){
                System.out.println(array[i]+"");
            }
        }
    }
}
