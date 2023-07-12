公共 class DAY5_02 {
    公共 static void main(String[] args) {
//数组元素对调
        int[] a ={1,4,8,5,7,9};
        for (int i = 0 ,  j = 5 ; i<=j ; i++ ) {
                int temp = a[i];                       第一次这里写错了   int temp = a[i]
                a[i] = a[j];                                              a[j] = temp
                a[j] = temp;                                               a[i] = a[j]
            System.out.println(a[i]);                        最后输出的是148577
        }
    }
}
