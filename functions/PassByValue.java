public class PassByValue{
    public static void main(String[] args){
        String naam = "Chutka";
        ChangeName(naam);
        System.out.print(naam);
    }
    
    static String ChangeName(String naam){
        naam = "Dipanshu";
        return naam;
    }

    
}