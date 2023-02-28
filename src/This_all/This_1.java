package This_all;

public class This_1 {
    private int a;
    private String s;
    private boolean t;

    public int getA() {
        return a;
    }

    /*public void setA(int a) {
        this.a = a;
    }

     */
    // Now we will explore more;
    public void setA(int data){
        a=data;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }
}
class Main{
    public static void main(String[] args) {
        This_1 th = new This_1();
        th.setA(4);
        th.setS("manu");
        System.out.println(th.getA());
        System.out.println(th.getS());
    }
}
