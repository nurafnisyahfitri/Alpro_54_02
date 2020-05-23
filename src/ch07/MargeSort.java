package ch07;
public class MargeSort {
   public static void main(String[] args) {
        Sort Sort = new Sort();
            int a [] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
            System.out.println("sorted array");
           boolean swapped = true;
           int mulai = 0;
           int selesai = a.length;
           
           while(swapped == true){
               swapped = false;
               for(int i = mulai; i<selesai-1; ++i){
                   if(a[i] > a[i + 1]){
                       int temp = a[i];
                       a[i]= a[i + 1];
                       swapped = true;
                   }
               }
               if(swapped == false)
                   break;
               swapped = false;
               selesai = selesai - 1;
               
               for(int i = selesai -1; i >= mulai; i--){
                   if(a[i] > a[i + 1]){
                       int temp = a[i];
                       a[i] = a[i + 1];
                       swapped = true;
                       mulai = mulai + 1;
                   }
           }
              int n = a.length;
                      for(int i = 0; i < n; i++)
                          System.out.println(a[i] +"");
                      System.out.println();
               
           }
           }

    private static class Sort {

        public Sort() {
        }
    }
    }