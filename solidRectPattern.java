package patterns;

public class solidRectPattern {
    public static void main(String[] args) {
         int n=5;
        for(int row=1;row<n-1;row++ ){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
