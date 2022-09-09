public class main{
    public static void main(String[] args){
        // int[] rnos = new int[5] // referance variable 'rnos' that point to an array object that contains integer type objects
        
        //Or Directly;
        int[] rnos1 = {1, 2, 3, 4, 5};
        //Breking 
        int[] rnos; //Decleration of array. rnos is defined in stack 
        rnos = new int[5]; // Initialisation: here actually the object is created in the memory (Heap)
        System.out.println(rnos[0]);


        
        String[] name = new String[4];
        System.out.println(name[3]);
    }   
}