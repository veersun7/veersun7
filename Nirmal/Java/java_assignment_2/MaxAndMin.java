public class MaxAndMin{
    public static void findMinAndMax(int[] nums)
    {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] > max) {
                max = nums[i];
            }
             else if (nums[i] < min) {
            min = nums[i];
            }
        }
        System.out.println("The minimum array is " + min);
        System.out.println("The maximum array is " + max);
    }
     public static void main(String[] args)
    {
        int[] nums = { 51, 74, 23, 41, 99, 16, 36, 72, 81, 93 };
         findMinAndMax(nums);
    }
}