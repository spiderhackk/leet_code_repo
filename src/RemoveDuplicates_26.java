import java.util.ArrayList;

public class RemoveDuplicates_26 {
        public static int removeDuplicates(int[] nums) {
            //approach one:
            int k=0;
            ArrayList<Integer> newNums = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (newNums.contains(nums[i])){

                }
                else {
                    newNums.add(nums[i]);
                    k++;
                }
            }
            return k;

        }
        //approach two:

    public static int duplicateRemove(int [] nums){
        int len = nums.length;
        int count=0;
        int k=1;
        for(int currentIndex=0;currentIndex<len;currentIndex++){
            if(nums[currentIndex]!=nums[k-1]){
                nums[k]=nums[currentIndex];
                k++;
            }
        }
        return k;
    }



    public static void main(String[] args) {
        int [] nums ={1,1,2};
        int k = removeDuplicates(nums);
        int j = duplicateRemove(nums);
        System.out.println(k);
        System.out.println(j);
    }
}
