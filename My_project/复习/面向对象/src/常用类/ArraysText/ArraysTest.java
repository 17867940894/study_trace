package 常用类.ArraysText;

public class ArraysTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,30,54};
        //System.out.println(Arrays.toString(a));//TODO 遍历一维数组
        int[] b = {1,2,3,4,5,6,7,8,9,30,54};
        /*Arrays.sort(b);//TODO 将数组升序排列
        System.out.println(Arrays.binarySearch(b , 0));//TODO  在一个数组里查询key值，前提是数组是升序的且值不重复  在比它大的数的下标返回+1 * -1*/

        /*Arrays.sort(b);
        System.out.println(Arrays.toString(b));*/

        /*String[] s = {"c","abc","a","b","cd"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));//[a, abc, b, c, cd]TODO 根据字母a到z排序，首字母相同，后一位字母综上所述*/
        /*Arrays.fill(a,5);
        System.out.println(Arrays.toString(a));//[5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5] TODO 将数组内的所有元素填充为指定元素*/
        //System.out.println(Arrays.equals(a,b));//TODO 可以比较数据类型的内容和一维数组
        /*int[] c = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(c));//TODO 拷贝指定指定长度的数组内容，超出的值为默认值，反之从0到n-1下标位值拷贝*/


    }
}
