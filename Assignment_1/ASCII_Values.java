package Assignment_1;
public class ASCII_Values {
    public static void main(String[] args) {
        //Uppercase A - Z
       for(char i = 'A'; i<='Z'; i++ ){
        System.out.println(i + " --> " + (int)i);
       }
       
       //Lowercase a - z
       for(char j = 'a'; j<='z'; j++){
        System.out.println(j + " --> " + (int)j);
       }
          //Uppercase Z - A
       for(char k = 'Z'; k>='A'; k-- ){
        System.out.println(k + " --> " + (int)k);
       }
       
       //Lowercase a - z
       for(char l = 'z'; l>='a'; l--){
        System.out.println(l + " --> " + (int)l);
       }
    }
}
