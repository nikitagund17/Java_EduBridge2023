public class DeepCopy {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50};
        int copiedArray[]=arr.clone();

        arr[0]=40;

        System.out.println("ARR : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("COpies Array: ");
        for(int i=0;i<copiedArray.length;i++){
            System.out.print(copiedArray[i]+" ");
        }

    }
}
