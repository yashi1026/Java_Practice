public class LCM {
    public static void main(String args[]){
        int a=4,b=6;
        int max=(a>b)?a:b;
        while(true){
            if(max % a == 0 && max % b == 0){
                System.out.println("LCM is:"+ max);
                break;
            }
            max++;
        }
    }
}
