public class Sort_Colors_75 {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        int len = arr.length;
        for (int index=0;index<(len-1);index++){
            boolean swap = false;
            for (int inInd=0;inInd<len-index-1;inInd++){
                if (arr[inInd]>arr[inInd+1]){
                    int temp=arr[inInd];
                    arr[inInd]=arr[inInd+1];
                    arr[inInd+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        for(int num : arr){
            System.out.println("Number is "+ num);
        }

    }
}
