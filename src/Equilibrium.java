
public class Equilibrium {
    public static void main(String[] args) {
        int [] arr = {3,2,5,3,2};
        int rcount=0;
        int lcount=0;

        for(int out_index=0;out_index<arr.length;out_index++){
            for(int r_index=out_index+1;r_index<arr.length;r_index++){
                rcount=rcount+arr[r_index];
            }
            for(int l_index=0;l_index<out_index;l_index++){
                lcount=lcount+arr[l_index];
            }

            if(lcount==rcount){
                System.out.println("Equilibrium Index is: "+out_index);
            }
            rcount=0;
            lcount=0;

        }

    }
}
