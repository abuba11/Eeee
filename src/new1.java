public class new1 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0]= 5;
        arr[1]= 10;
        arr[2]= 15;
        arr[3]= 20;
        arr[4]= 25;
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}
