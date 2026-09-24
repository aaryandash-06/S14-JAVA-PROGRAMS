package Assignment_3;
public class CopyElements {
        public static void main(String[] args) {
        int[] og_array = {10,20,30,40,50};
        int [] cp_array = new int[og_array.length];
        for(int i = 0; i<og_array.length; i++){
            cp_array[i] = og_array[i];
        }
        System.out.println("Original Array: " + java.util.Arrays.toString(og_array));
        System.out.println("Copied Array: " + java.util.Arrays.toString(cp_array));
    }
}