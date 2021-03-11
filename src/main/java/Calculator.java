public class Calculator {
    public static void main(String[] args){
        System.out.println("5! = " + fact(5));
        System.out.println("3 ^ 4 = " + power(3,4));
    }

    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static double power(int a,int b){
        return java.lang.Math.pow(a,b);
    }

    public static double Log(int a){
        return java.lang.Math.log(a);
    }

    public static double sqrt(int a){
        return java.lang.Math.sqrt(a);
    }


}
