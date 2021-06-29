public class Makes10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        makes10 (a,b);
    }

    static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10){
            return true;
        } else {
            return false;
        }


    }

}



