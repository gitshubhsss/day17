public class substring {

    public static String printSubstring(String str,int startIndex,int endIndex){
        String subStr="";

        for(int i=startIndex;i<endIndex;i++){
            subStr=subStr+str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str="Hellow world";

        System.out.println(printSubstring(str,2,3));;
    }
}
