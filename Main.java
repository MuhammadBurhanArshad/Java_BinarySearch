public class Main {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};

        BinarySearch binarySearch = new BinarySearch();

        System.out.println("Number found on " + binarySearch.binarySearch(myArray, 5) + " index");
    }
}