public class DAY5_02_1 {
    //数组元素查找(查找指定元素第一次在数组中出现的索引)
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 8, 3, 6};
        int m = 8;
        for (int i = 0; i < a.length-1; i++) {
            if(m == a[i]){
                System.out.println(i+1);
            }
        }
    }
}