 import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {
        // Write you code here.
        ArrayList<Integer> ans=new ArrayList<>();
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        while(top<=bottom && left<=right){
         for(int i=left ;i<=right;i++){
        ans.add(matrix[top][i]);
         }
         top++;
         for(int i=top;i<=bottom;i++){
             ans.add(matrix[i][right]);
         }
         right--;

         if(top<=bottom){
             for(int i=right;i>=left;i--){
                 ans.add(matrix[bottom][i]);
             }
             bottom--;
         }
         if(left<=right){
             for(int i=bottom;i>=top;i--){
             ans.add(matrix[i][left]);
         }
         left++;
         }
        }
        return ans;
    }
}
//Sumit Kumar jha