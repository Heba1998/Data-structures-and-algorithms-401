class Main{
 public static void BinarySearch(int arr[], int first, int last, int key){
   int mid = (first + last)/2;
   while( first <= last ){
      if ( arr[mid] < key ){
        first = mid + 1;   
      }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
      }else{
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   if ( first > last ){
      System.out.println(-1);
   }
 }
 public static void main(String args[]){
		int arr[] = {4, 8, 15, 16, 23, 42};
		int key = 15;
        int last=arr.length-1;
		BinarySearch(arr,0,last,key);	
 }
}
