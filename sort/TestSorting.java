public class TestSorting{
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {8,6,4,3,1,7,2,5};
        mergeSort.sort(array, 0, array.length-1);
        print(array);

        int[] array2 = {8,6,4,3,1,7,2,5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array2);
        print(array2);
    }

    public static void print(int[] array){
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}