public class DAY5_02 {
    public static void main(String[] args) {
//数组元素对调
        int[] a ={1,4,8,5,7,9};
        for (int i = 0 ,  j = 5 ; i<=j ; i++ ) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            System.out.println(a[i]);
        }
    }
}