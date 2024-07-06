public class findIndexOfFirstOccurrenceString {
    public static void main(String[] args) {
        String haystack = "";
        String needle = "a";
        String matchString = "";
        int index = 0;
        int returnIndex = -1;
        int firstCount = 0;
        int start=0;
        if (haystack.length()<needle.length()){
            System.out.println(returnIndex);
        }else {
            for (int i = start; i < haystack.length(); i++) {
                int len = haystack.length()-i;
                if (len<needle.length()){
                    break;
                }
                index = i;
                for (int j = 0; j < needle.length(); j++) {

                    char ch = haystack.charAt(i);
                    matchString=matchString+ch;
                    i++;
                }

                if (needle.equals(matchString)){
                    returnIndex=i-matchString.length();
                    break;
                }
                else {
                    matchString="";
                }
                i=index;
            }
        }
        System.out.println(returnIndex);
    }
}
