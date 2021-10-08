public class Calculator {
    public static void main(String[] args) {

        int a = 10;
        double b = 20;
        boolean c = true;
        char d = 'c';
        String e = "Hallo";
        int f = 3-4;
        /*System.out.println(f);
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        Arithmetic(10,20);*/
        printResult(Arithmetic(10,20));
    }

    public static int Arithmetic (int a, int b){
        int c = a-b;
        int d = a+b;
        int e = b/a;
        int f = a*b;
        int g = a%b;
        printResult(c);
        printResult(d);
        printResult(e);
        printResult(f);
        printResult(g);
        return 0 ;
    }

    public static void printResult(int result){
        System.out.println(result);
    }
}
