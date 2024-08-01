public class palindrome{
    public static void main(String[] args) {
        String str="0P";
        str=str.toLowerCase();
        str=str.replaceAll("[^a-zA-Z0-9]", "");
        String newString="";
 
        int i=str.length()-1;

        while (i>=0) {
            newString=newString+str.charAt(i);
            i--;
        }

        if(newString.equals(str)){
            System.out.println("palindrome string");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}