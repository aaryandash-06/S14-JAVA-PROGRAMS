package Theory;

public class Loops {
    public static void main(String[] args){
        int n = 2;
     //   FOR LOOP
        for(int i=1; i<=10; i++){
            System.out.println(n +" * " + i +" = "+ n*i);

      //  WHILE LOOP
        int j = 1;
        while (i<=10) {
            System.out.println(n + " * " + j + " = " + n*j);
            j++;

       // DO WHILE LOOP
        int k = 1;
        do{
            System.out.println(n + " * " + k + " = " + k*i);
            k++;
        }while(k<=10);

        
         }
      }
    }
}

    
