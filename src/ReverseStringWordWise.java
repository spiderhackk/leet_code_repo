
//Reverse the string as --"yadoT si yadnom"

public class ReverseStringWordWise {
    public static void main(String[] args) {
        String day = "Today is monday";
        String rev_ord = "";
        String rev_day=" ";
        String[]split_arr = day.split(" ");
        for (int index=0;index<split_arr.length;index++){
            String rev_word = split_arr[index];
            for (int rev_index=rev_word.length()-1;rev_index>=0;rev_index--){
                rev_ord =rev_ord+split_arr[index].charAt(rev_index);
            }
            rev_ord=rev_ord+" ";
            rev_day = String.join(" ",rev_ord+" ");
        }
        System.out.println(rev_day);

    }
}
