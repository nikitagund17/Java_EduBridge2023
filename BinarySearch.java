public class BinarySearch {

    void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    int IsFoundAt(int arr[], int num) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (num == arr[mid])
                return mid;

            else if (num > arr[mid])
                start = mid + 1;

            else
                end = mid - 1;

        }
        return -1;

    }

    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 34, 22, 65, 1, 87, 4, 32, 89, 11 };
        BinarySearch s = new BinarySearch();

        int num = 65;

        s.bubbleSort(arr);

        s.print(arr);

        System.out.println();
        int loc = s.IsFoundAt(arr, num);
        if (loc == -1) {
            System.out.println("Not Exits");
        }

        else {
            System.out.println(num + " found at index " + loc);
        }

    }
}
