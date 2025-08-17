 
public class PatternPrinter {

    public static void main(String[] args) {
        int n = 3;
        for(int row = n; row>=1 ; row--){
            for(int col = n; col >=1; col--){
                for(int repeat = 1; repeat <= row; repeat++){
                    System.out.print(col);
                    }
                }
                System.out.println();
            }
          
            
        }
    }

