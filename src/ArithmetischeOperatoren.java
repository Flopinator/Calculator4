public class ArithmetischeOperatoren {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);

        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(b/a);
        System.out.println(a*b);
        System.out.println(a%b);

        printResult(2 + 3);
        int g = 2+4;
        printResult(g);
        int result = add(2,5);
        printResult(result);
        printResult(add(2,6));
    }

    public static void  printResult(int result){
    System.out.println(result);
    }

    public static int add(int a, int b){
        return a+b;
    }
}