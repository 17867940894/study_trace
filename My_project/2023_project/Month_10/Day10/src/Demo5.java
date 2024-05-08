public class Demo5 {
    /*
    比较两个二维数组是否完全相同
     */
    public static void main(String[] args) {
        int[][] nums1 = {
                {11, 2, 3, 4, 5},
                {11, 2, 3, 4, 5},
                {11, 2, 3, 4, 5},
                {11, 2, 3, 4, 5}
        };
        int[][] nums2 = {
                {11, 2, 3, 4, 5},
                {11, 2, 3, 4, 5},
                {11, 2, 3, 4, 5},
                {11, 2, 3, 4, 5}
        };
        alike(nums1, nums2);
    }

    private static void alike(int[][] nums1, int[][] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            if (nums1.length != nums2.length) {
                System.out.println("不相同");
                return;
            }
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[i].length != nums2[i].length) {
                    System.out.println("不相同");
                    return;
                } else {
                    if (nums1[i][j] != nums2[i][j]) {
                        System.out.println("不相同");
                        return;
                    }
                }
            }
        }
        System.out.println("相同");
    }
}
