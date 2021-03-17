package exempleCours;

public class exemple1 {
    public static void main(String[] args) {
        long N = 777777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (long i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (long i = N; i > 0 ; i--) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }
}
