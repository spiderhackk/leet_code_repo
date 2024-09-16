import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {


        int nums [] = {3,3,4};
        //Solution one
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println(nums[n/2]);

        //Solution two
        int totalCount = 0;
        int lastCount = 0;
        int lastNumber = 0;

        for (int index =0;index<nums.length;index++){
            for (int ind=0;ind<nums.length;ind++){
                if (nums[index]==nums[ind]){
                    totalCount++;
                }
            }
            if (totalCount>lastCount){
                lastCount=totalCount;
                lastNumber=nums[index];

            }
            totalCount=0;

        }
        System.out.println(lastNumber);
        System.out.println(lastCount);
    }
}
