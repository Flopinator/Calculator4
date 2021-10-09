public class ArrayDemo1 {

    public static void main(String[] args) {

        int[] Array1 = new int[3];
        Array1[0] = 3;
        Array1[1] = 4;
        Array1[2] = 5;

        int[] Array2 = new int[3];
        Array2[0] = 7;
        Array2[1] = 1;
        Array2[2] = 3;

        int sumFor = 0;
        System.out.print("+, ");
        for(int i = 0; i < Array1.length; i++)
        {
            sumFor = Array1[i]+Array2[i];
            System.out.print("sumFor = " + sumFor +", ");
        }

        int sumMult = 0;
        System.out.println();
        System.out.print("*, ");
        for(int i = 0; i < Array1.length; i++)
        {
            sumMult = Array1[i]*Array2[i];
            System.out.print("sumMult = " + sumMult+", ");
        }

    }
}
