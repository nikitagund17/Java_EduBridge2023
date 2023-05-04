
public class SortArray {

    void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    void BinarySearch(int arr[]){
        
    }

    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 34, 22, 65, 1, 87, 4, 32, 89, 11 };
        SortArray s = new SortArray();

        s.bubbleSort(arr);
        s.print(arr);

    }
}
