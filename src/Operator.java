public class Operator {
    
        public static void main(String[] args) throws Exception {
            // Arithmetic Operators
            int a = 10, b = 5;
            System.out.println("Arithmetic Operators:");
            System.out.println("a + b = " + (a + b)); // Addition
            System.out.println("a - b = " + (a - b)); // Subtraction
            System.out.println("a * b = " + (a * b)); // Multiplication
            System.out.println("a / b = " + (a / b)); // Division
            System.out.println("a % b = " + (a % b)); // Modulus
    
            // Relational Operators/Comparison Operator
            System.out.println("\nRelational Operators:");
            System.out.println("a == b: " + (a == b)); // Equal to
            System.out.println("a != b: " + (a != b)); // Not equal to
            System.out.println("a > b: " + (a > b)); // Greater than
            System.out.println("a < b: " + (a < b)); // Less than
            System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
            System.out.println("a <= b: " + (a <= b)); // Less than or equal to
    
            // Logical Operators /Conditional Operator
            boolean x = true, y = false;
            System.out.println("\nLogical Operators:");
            System.out.println("x && y: " + (x && y)); // Logical AND
            System.out.println("x || y: " + (x || y)); // Logical OR
            System.out.println("!x: " + (!x)); // Logical NOT
    
            // Bitwise Operators
            int c = 5, d = 7;
            System.out.println("\nBitwise Operators:");
            System.out.println("c & d: " + (c & d)); // Bitwise AND
            System.out.println("c | d: " + (c | d)); // Bitwise OR
            System.out.println("c ^ d: " + (c ^ d)); // Bitwise XOR
            System.out.println("~c: " + (~c)); // Bitwise NOT
            System.out.println("c << 1: " + (c << 1)); // Left shift
            System.out.println("c >> 1: " + (c >> 1)); // Right shift
    
            // Assignment Operators
            int e = 10;
            System.out.println("\nAssignment Operators:");
            e += 5; // e = e + 5
            System.out.println("e += 5: " + e);
            e -= 3; // e = e - 3
            System.out.println("e -= 3: " + e);
            e *= 2; // e = e * 2
            System.out.println("e *= 2: " + e);
            e /= 4; // e = e / 4
            System.out.println("e /= 4: " + e);
            e %= 3; // e = e % 3
            System.out.println("e %= 3: " + e);
    
            // Unary Operators
            int f = 10;
            System.out.println("\nUnary Operators:");
            System.out.println("f++: " + (f++)); // Post-increment
            System.out.println("++f: " + (++f)); // Pre-increment
            System.out.println("f--: " + (f--)); // Post-decrement
            System.out.println("--f: " + (--f)); // Pre-decrement
    
            // Ternary Operator
            int g = 10, h = 20;
            System.out.println("\nTernary Operator:");
            int max = (g > h) ? g : h;
            System.out.println("Max of g and h: " + max);
        }
    }

