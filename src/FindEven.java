public class FindEven {
    public static void main(String[] args) {
        int Zahl = 10;
        int count = 1;


        while(count <= Zahl)
        {
            if(count % 2 == 0)
            {
            System.out.println("Output ="+ count);
            }
            count++;
        }

    }
}
