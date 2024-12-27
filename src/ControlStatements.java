public class ControlStatements {
    public static void main(String[] args) {
        // If-else statement
        int a = 10, b = 20;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than or equal to b");
        }
        // Nested if statement
        int num = 10;
        if (num > 0) {
            System.out.println("The number is positive.");
            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }

        // Ternary operator example
        int num1 = 10, num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of num1 and num2: " + max);
        
        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // For loop
        System.out.println("\nFor loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);

        // Break statement
        System.out.println("\nBreak statement:");
        for (int l = 0; l < 5; l++) {
            if (l == 3) {
                break;
            }
            System.out.println("l = " + l);
        }

        // Continue statement
        System.out.println("\nContinue statement:");
        for (int m = 0; m < 5; m++) {
            if (m == 3) {
                continue;
            }
            System.out.println("m = " + m);
        }
    }
}