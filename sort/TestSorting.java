public class TestSorting{
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        int[] array = {8,6,4,3,1,7,2,5};

        mergeSort.sort(array, 0, array.length-1);

        for(int i : array)
            System.out.print(i + ", ");
    }
}