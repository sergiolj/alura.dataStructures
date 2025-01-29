package util;

public class OrdinalGenerator {
    public static String getOrdinal(int n){
        if(n % 100 >= 11 && n % 100 <=13){ //Values higher than 1100
            return n + "th";
        }
        switch (n % 10){
            case 1: return n + "st"; //First -> st
            case 2: return n + "nd"; //Second - > nd
            case 3: return n + "rd"; // Third -> rd
            default: return n + "th"; // Fourth, Fifth, sixth
        }
    }
}
