public class DigonalSum {
  public static int digonalSum(int arr[][]){
    int sum=0;
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[0].length;j++){
    //         if(i==j){
    //             sum+=arr[i][j];
    //         }else if(i+j==arr.length-1){
    //             sum+=arr[i][j];

    //         }
    //     }

    // }


    //solve in a single loop
    for(int i=0;i<arr.length;i++){
        sum+=arr[i][i];
        if(i!=arr.length-1-i)
        sum+=arr[i][arr.length-1-i];
    }
    return sum;
  }  

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
        System.out.println(digonalSum(arr));
    }
}



// public class DiagonalSum {
//   public static int diagonalSum(int arr[][]) {
//     int sum = 0;
//     int n = arr.length;
//     for (int i = 0; i < n; i++) {
//         for (int j = 0; j < arr[0].length; j++) {
//             if (i == j) {
//                 sum += arr[i][j];
//             } else if (i + j == n - 1) {
//                 sum += arr[i][j];
//             }
//         }
//     }
//     // If the matrix is of odd length, subtract the center element which was added twice
//     if (n % 2 != 0) {
//         // sum -= arr[n / 2][n / 2];
//     }
//     return sum;
//   }

//   public static void main(String[] args) {
//     int arr[][] = { { 1, 2, 3 },
//                     { 4, 5, 6 },
//                     { 7, 8, 19 } };
//     System.out.println(diagonalSum(arr)); // Should output 25
//   }
// }
