public class BinarySearch {

    public int binarySearch(int[] array, int number){
        int mid = 0, low = 0, high = array.length - 1;

        while (low <= high){
            mid = (low + high)/2;

            if(array[mid] == number){
                return mid;
            }else if(array[mid] < number){
                low = mid + 1;
            }else if(array[mid] > number){
                high = mid - 1;
            }else{
                return -1;
            }
        }

        return -1;
    }
}