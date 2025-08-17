import java.util.*;

class Matrix{
    public static void searchInaMatric(int matrix[][], int target)
    {
        int row = -1;
        int col = -1;

        for(int i = 0; i < matrix.length; i++)
        {
            boolean found = false;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == target)
                {
                    row = i;
                    col = j;
                    found = true;
                    break;
                }
            }
            if(found)
            break;

        }
        System.out.println(row + " " + col);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //row
        int row = sc.nextInt();
        //col
        int col = sc.nextInt();

        //define matrix
        int matrix[][] =  new int[row][col];

        //adding values
        for(int i = 0; i < row; i++)
        {
            for(int j= 0; j < col; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        //printing values
        for(int i = 0; i < row; i++)
        {
            for(int j= 0; j < col; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        searchInaMatric(matrix,3);

        sc.close();

    }
}