public class ArrayDemo {

    public static void main(String[] args) {

        double[] articles = new double[5];
        articles[0] = 2.4;
        articles[1] = 2.0;
        articles[2] = 2.9;

       /* double sum = articles[0] + articles[1] + articles[2] + articles[3] + articles[4];
        System.out.println("sum = " + sum);*/

        double sum = 0;
        sum = sum +articles[0];
        sum = sum +articles[1];
        sum = sum +articles[2];
        sum = sum +articles[3];
        sum = sum +articles[4];
        System.out.println(sum);

        double sumFor = 0;
        for (int i = 0; i < articles.length; i++)
        {
            sumFor = sumFor + articles[i];
        }
        System.out.println("sumFor = " + sumFor);


    }
}
