public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int countZeros = 0;
        int j = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 0) {
                countZeros++;
            }
        }
        int sub = nums.length - countZeros;
        for (int ind = 0; ind < nums.length; ind++) {
            if (nums[ind] != 0) {
                nums[j] = nums[ind];
                j++;

            }

        }
        for (int item = 0; item < nums.length; item++) {
            if (sub <= item) {
                nums[item] = 0;
            }
            System.out.println(nums[item]);
        }

    }
}
