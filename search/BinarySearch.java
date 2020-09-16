public class BinarySearch{
    
    public int find(int[] array, int target){
        
        int start = 0;
        int end = array.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(array[mid] == target)
                return mid;
            if(target < array[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}