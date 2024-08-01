public class largestString {
    public static String printLargest(String fruits[]){
        int n=fruits.length;
       
        String largest=fruits[0];
        int largestIndex=0;
        for(int i=1;i<n;i++){

            int j=0;
            while (j<fruits[i].length()) {
                if(fruits[largestIndex].charAt(j)<fruits[i].charAt(j)){
                    largestIndex=i;
                    break;
                }
                else if(fruits[largestIndex].charAt(j)==fruits[i].charAt(j)){
                    j++;
                }
                else{
                    break;
                }
            }
        }
        return fruits[largestIndex];

    }
    public static void main(String[] args) {
        String fruits[]={"zaple","kango","uanana","zaple","now","karoa","ldskfj"};
        System.out.println(printLargest(fruits));;
    }
}
