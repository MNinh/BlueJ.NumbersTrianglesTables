


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0,stop);
    }

    public static String getRange(int start, int stop) {
        return getRange(start,stop,1);
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for(int i=start; i<stop; i+=step){
            range += i;
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String even = "";
        for(int i = start; i<stop; i++){
        if (i%2 == 0){
        even+=i;
    }
    
        
    }
    return even;
    }



    public static String getOddNumbers(int start, int stop) {
        String odd = "";
        for(int i = start; i<stop; i++){
        if (i%2 == 1){
        odd+=i;
        } 
    }
    return odd;
    }

    


    public static String getExponentiations(int start, int stop, int exponent) {
        String expo = "";
        int calc = 0;
        for(int i=start; i<=stop; i++){
            calc = (int)Math.pow(i,exponent);
            expo += calc;
            
    }
    return expo;
    }
}
