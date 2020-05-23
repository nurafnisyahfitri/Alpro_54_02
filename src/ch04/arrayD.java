package ch04;
public class arrayD {
    public static void main(String[] args){
        int kelipatan3[]={82,12,41,38,19,26,9,48,20,55,8,32,3};
        int index=0;
        int nomor=1;
                
        for(int i=1; i<=kelipatan3.length; i++){
            if(i%3==0){
                kelipatan3[index]=i;
                System.out.println("bilangan kelipatan 3 ke"+ nomor+" "+kelipatan3[index]);
                nomor++;
                index++;
            }
        }
    }
}
