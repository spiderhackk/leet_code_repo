public class firstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "aabbc";
        int count=0;
        int len = s.length();
        int unique_char_index=-1;
        for (int i=0;i<len;i++){
            char ch = s.charAt(i);
            if (s.indexOf(ch)==s.lastIndexOf(ch)){
                unique_char_index=s.indexOf(ch);
                break;

            }
        }
        System.out.println(unique_char_index);
    }
}
