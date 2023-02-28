package Final_all;

public class Final_Exp1 {
    static final int a=4;
    final int r=4;
    public final int c=5;
    static private final String  d ="manu";
    public final String  f="Manu";

    //int final a =5 ; (Error cannot be defined like this);

    public static void main(String[] args) {
        Final_Exp1 a = new Final_Exp1();

        String rr =a.f;
        System.out.println();
        //a=4;  (Cannot change the value);
        System.out.println(a);
        //d="manu"; (Cannot change the value);

        //Final_Methord class call;
    }


}
