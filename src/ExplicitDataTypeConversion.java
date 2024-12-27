public class ExplicitDataTypeConversion {
   

        public static void main(String[] args) {
            double x = 100.04;
            System.out.println("Double value: " + x);
    
            // Explicit conversion from double to long
            long y = (long) x;
            System.out.println("Long value after explicit conversion: " + y);
    
            // Explicit conversion from long to int
            int z = (int) y;
            System.out.println("Int value after explicit conversion: " + z);
        }
    }
    

