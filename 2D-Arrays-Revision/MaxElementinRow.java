public class MaxElementinRow {
    public static void main(String args[])
    {
        int[][] matrix = {
    {10, 25, 5},
    {40, 15, 30},
    {7, 50, 20}
};
 for(int i=0;i<matrix.length;i++)
 {   
    int maxe=matrix[i][0];
    for(int j=0;j<matrix[i].length;j++)
    {
        maxe=Math.max(maxe,matrix[i][j]);

    }
    System.out.println(maxe);
 }
    }
}
