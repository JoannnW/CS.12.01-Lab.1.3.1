import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        boolean found = false;
        for (int i=0;i<array.length; i++){
            if (array[i] == value){
                found = true;
                return i;
            }
        }
        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {
        boolean found = false;
        int listSize = list.size();
        for(int i = 0; i < listSize; i++){
            if(list.get(i).equals(string)){
                found = true;
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] array, int value) {
        boolean found = false;
        int high = array.length-1;
        int low = 0; //rmb it's zero, not 1
        int mid;
        for (int i = 0; i < array.length; i++){
            mid = (low + high) / 2;
            if (value == array[mid]){
                return mid;
            }
            else if (value > array[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }


        }
        return -1;

    }

    public static int binarySearch(String[] array, String string) {
        boolean found = false;
        int low = 0;
        int high = array.length-1;
        int mid;
        for (int i = 0; i < array.length; i++){
            mid = (low + high) / 2;
            if (array[mid].compareTo(string) == 0){
                found = true;
                return mid;
            }
            else if (array[mid].compareTo(string) < 0){
                low = mid + 1;
            }
            else if (array[mid].compareTo(string) > 0){
                high = mid - 1;

            }
        }

        return -1;

    }
}
