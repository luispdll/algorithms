public class TestSearch{
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1,4,6,7,8,9};

        int index = binarySearch.find(array, 5);
        System.out.println(index);
    }
}