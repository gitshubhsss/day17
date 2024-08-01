public class logestsubstring {

    public static int lengthOfLongestSubstring(String s) {
        
        String substring="";
        int count=0;
        substring=substring+s.charAt(0);
        for(int i=1;i<s.length();i++){

            for(int j=0;j<substring.length();j++){
                if(s.charAt(i)==substring.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                substring=substring+s.charAt(i);
            }
        }
        return substring.length();
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));;
    }
}
