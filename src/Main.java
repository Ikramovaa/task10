public class Main {
    public static void main(String[] args) {
        System.out.println(trueFalse(44,45,44,56,90,100,6));
    }
        static boolean trueFalse ( int a, int...b){
            for (int i = 1; i < b.length; i++) {
                if (b[i] == a) {
                    a = b[i];
                   return true;}
            }return false;
        }
    }


