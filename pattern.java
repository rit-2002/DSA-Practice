public class RightTriangleStarPattern {
    public static void main(String[] args) {
        int rows = 5; 
        
        for (int i = 1; i <= rows; i++) {       // Outer loop for rows
            for (int j = 1; j <= i; j++) {     // Inner loop for stars
                System.out.print("* ");
            }
            System.out.println();               // Move to next line
        }
    }
}
