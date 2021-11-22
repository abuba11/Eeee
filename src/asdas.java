public class asdas {
    public static void main(String[] args){
        int number = 5;
        int degree = 3;
        System.out.println(degree(number, degree));

    }
    public static int degree(int number, int degree){
        int dec= 1;
       for (int i=0; i<degree; i++ ){
           dec *= number;
       }
       return dec;
    }
}
