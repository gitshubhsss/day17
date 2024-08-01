public class shortestPath {
    public static void main(String[] args) {
        String directions="WNEENESENNN";
        int x=0;
        int y=0;

        int x2=0;
        int y2=0;
        for(int i=0;i<directions.length();i++){ 
            if(directions.charAt(i)=='W'){
                 x2=x2-1;
            }else if(directions.charAt(i)=='E'){
                x2=x2+1;
            }else if(directions.charAt(i)=='N'){
                y2=y2+1;
            }else{
                y2=y2-1;
            }
        }
        double distance= Math.pow(x2, 2)-x+Math.pow(y2, 2)-y;
        int minDistance=(int)Math.sqrt(distance);

        System.out.println(minDistance);

       
    }
}
