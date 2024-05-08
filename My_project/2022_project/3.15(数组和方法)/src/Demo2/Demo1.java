package Demo2;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] a = {1, 23, 3, 4, 6};
        int[] b = {1, 23, 3, 4, 6};
        System.out.println(Arrays.binarySearch(a, 1));//查询数组内Key的下标位置，如果查询不到，返回负数
        System.out.println(Arrays.equals(a, b));//比较两个一维数组是否相等

          //数组的复制
          int[] arr = {1,3,4,6,8};
          int[] newArr = Arrays.copyOf(arr,5);//复制到一个新数组
          System.out.println(Arrays.toString(newArr));

          //copyOfRange(arr,from,to) from:开始的位置(包含) to:目标位置(不包含) 含头不含尾

          int[] newArr2 = Arrays.copyOfRange(arr,1,3);
          System.out.println(Arrays.toString(newArr2));

          //其中System也提供了赋值数组的方法。
          //arraycopy(object str,int srcPos,object dest,int destPos,int length)
          /*
          *arraycopy(srcArr,srcPos,destArr,destPos,len)
          srcArr:要复制的源数组
          srcPos:从srcArr的srcPos位置开始复制
          destArr:复制到的目标数组
          destPos:目标数组从destPos开始存放
          en:从源数组中复制len个长度
          int[] arr2 = new int[arr.length];
          System.arraycopy(arr,1,arr2,0,4);
          System.out.println(Arrays.toString(arr2));

           */

    }
}