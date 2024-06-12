public class SearchelementInSortedMatrix {
   public static void search(int arr[][],int key){
  int row=0,col=arr.length-1;
  while(row<arr.length&&col>=0){

if(key==arr[row][col]){
    System.out.println("Search is sucessful : ("+row+","+col+")");
    return;
}
    
else if(key>arr[row][col]){
    row++;
}
else{
col--;
}
}
  System.out.println("element not found ");
return;
   } 

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
        search(arr,9);}

}
