public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        double quotient;
        int product;
        int difference;

        System.out.println(calculator(1,2, "-"));
        System.out.println(calculator(1,5, "+"));
        System.out.println(calculator(6,2, "*"));
        System.out.println(calculator(1,8, "/"));

    }
    public static double calculator(int a,int b, String operator){
        if(operator =="+"){
            return a+b;
        }
        if(operator=="-"){
            return a-b;
        }

        if (operator == "*") {
            return a*b;
        }
        if(operator=="/"){
            return a/b;

        }

        return 0;
    }

}