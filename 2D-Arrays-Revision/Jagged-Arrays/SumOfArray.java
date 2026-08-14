/*🟢 Task 2 — Sum of every row

Expected:

Row 0 sum = 60
Row 1 sum = 90
Row 2 sum = 300
Row 3 sum = 100 */

public class SumOfArray {
    public static void main(String args[])
    {
        int[][] matrix= { {10, 20, 30}, {40, 50}, {60, 70, 80, 90}, {100}};
        for(int i=0;i<matrix.length;i++)
        {
            int sum=0;
            for(int j=0;j<matrix[i].length;j++)
            {
                sum+=matrix[i][j];
                

            }
            System.out.println(sum);
        }

    }
}
