// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         int startRow=0;
//       int startCol=0;
//       int endRow=matrix.length-1;
//       int endCol=matrix[0].length-1;
//       while(startRow<=endRow && startCol<=endCol){
//           for(int i=startCol;i<=endCol;i++){
//               System.out.print(matrix[startRow][i]+",");
//           }
//           for(int i=startRow+1;i<=endRow;i++){
//               System.out.print(matrix[i][endCol]+",");
//           }
//           for(int i=endCol-1;i>=startCol;i--){
//               if(startRow==endRow){
//                   break;
//               }
//               System.out.print(matrix[endRow][i]+",");
//           }
//           for(int i=endRow-1;i>=startRow+1;i--){
//               if(startCol==endCol){
//                   break;
//               }
//               System.out.print(matrix[i][startCol]+",");
//           }
//           startRow++;
//           startCol++;
//           endRow--;
//           endCol--;
//       }
//       return matrix;
//     }
// }
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;// rows
        int n = matrix[0].length;// columns
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                list.add(matrix[top][i]);
            top++;
            for (int i = top; i <= bottom; i++)
                list.add(matrix[i][right]);
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }
}