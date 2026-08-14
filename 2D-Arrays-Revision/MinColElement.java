public class MinColElement {
    public static void main(String args[])
    {
        int[][] matrix = {
    {10, 25, 5},
    {40, 15, 30},
    {7, 50, 20}
};
for(int j=0;j<matrix[0].length;j++)
{
    int colminimum=matrix[0][j];
    for(int i=0;i<matrix.length;i++)
{
    colminimum=Math.min(colminimum,matrix[i][j]);
    }
    System.out.println(colminimum);

}

}
}
