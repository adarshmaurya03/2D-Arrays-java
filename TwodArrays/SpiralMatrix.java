public class SpiralMatrix {
    public static void spiral(int arr[][]) {
        int SR = 0;
        int ER = arr.length - 1;
        int SC = 0;
        int EC = arr[0].length - 1;
        while (SR <= ER && SC <= EC) {

            // print top boundary
            for (int j = SC; j <= EC; j++) {
                System.out.print(arr[SR][j]);
            }
            // print endind colomn
            for (int i = SR + 1; i <= ER; i++) {
                System.out.print(arr[i][EC]);
            }

            // print bottom row
            for (int j = EC - 1; j >= SC; j--) {
                if(ER==SR){
                    break;
                }
                System.out.print(arr[ER][j]); 
            }

            for (int i = ER - 1; i >= SR + 1; i--) {
                if(EC==SC){
                    break;
                }
                System.out.print(arr[i][SC]);
            }
            SR++;
            SC++;
            EC--;
            ER--;

        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
        spiral(arr);
    }
}
