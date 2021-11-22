public class fssadfasdfa {
    public static void main(String[] args) {
        int[] array = {432, 5436, 123, 56};
        System.out.println(sumArr(array));
    }

    public static int sumArr(int[] array) {
        //int s = 432 + 5436 + 123 + 56;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];

        }
        return res;
    }
}
