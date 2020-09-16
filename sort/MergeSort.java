public class MergeSort{

    public void sort(int[] array, int left, int right){
        if(left < right){ // stop recursion
            int mid = (left+right)/2; // get mid

            sort(array, left, mid); // split left
            sort(array, mid+1, right); // split right
            
            merge(array, left, mid, right); // merge splits
        }
    }
    
    public void merge(int[] array, int left, int mid, int right){
        // length for vectors
        int length1 = mid - left + 1;
        int length2 = right - mid;

        // temporal arrays
        int arrayLeft[] = new int[length1];
        int arrayRight[] = new int[length2]; 

        for(int i=0; i<length1; i++)
            arrayLeft[i] = array[left + i];
        for(int j=0; j<length2; j++)
            arrayRight[j] = array[mid + 1 + j];
        
        // indexes
        int i = 0, j = 0;
        int k = left;

        // sorting
        while(i < length1 && j < length2){
            if(arrayLeft[i] <= arrayRight[j]){
                array[k] = arrayLeft[i];
                i++;
            }else{
                array[k] = arrayRight[j];
                j++;
            }
            k++;
        }

        // copy remaining elements: left
        while(i < length1){
            array[k] = arrayLeft[i];
            i++;
            k++;
        }
        // copy remaining elements: right
        while(j < length2){
            array[k] = arrayRight[j];
            j++;
            k++;
        }
    }
}