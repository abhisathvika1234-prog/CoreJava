public class FindMaxRowElement {
    /*Find the maximum element in each column AND print its row index.
       input :10  25   5
              40  15  30
              7  50  20
       Output: Column 0 → Max = 40, Row = 1
               Column 1 → Max = 50, Row = 2
               Column 2 → Max = 30, Row = 1 */
               
    public static void main(String args[])
    {
        int[][] matrix={{10,25,5},
                        {40,15,30},
                        {7,50,30}};

        for(int j=0;j<matrix[0].length;j++)
        {
            int maxcol=matrix[0][j];
            int row=0;
            for(int i=0;i<matrix.length;i++)
            {
               if(matrix[i][j]>maxcol)
               {
                //row changes only when if you found max in that col
                 maxcol=matrix[i][j];
                 row=i;
               }
               
                
            }
             System.out.println("Column " + j + " → Max = " + maxcol + ", Row = " + row);
        }

    }
}
