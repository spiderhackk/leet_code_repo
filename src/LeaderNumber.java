//Find the leader number from array of right element
public class LeaderNumber {
    public static void main(String[] args) {
        int [] arr ={9,2,3,7,4,2};
        for (int out_index=0;out_index<arr.length;out_index++){
            for (int in_index=out_index+1;in_index<arr.length;in_index++){
                if (arr[out_index]<arr[in_index]){
                    break;
                }
            System.out.println(arr[out_index]);
            break;
            }

        }
    }
}
