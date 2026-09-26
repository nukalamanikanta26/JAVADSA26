public class ContainerWithMostWater2 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    static int maxArea(int[] height)
    {
        int maxArea =0;
        for (int i=0;i< height.length-2;i++)
        {
            for (int j = i+1; j < height.length ; j++) {

                int l = Math.min(height[i],height[j]);
                int b = j-i;

                int area = l*b;
                maxArea = Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}


/* CONATINER WITH MOST WATER - LEETCODE 11 - BRUTE FORCE
 *  TIME COMPLEXITY : O(n^2)
 *  SPACE COMPLEXITY : O(1)  */