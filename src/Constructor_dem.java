public class Constructor_dem {
    private int n,a;
    public Constructor_dem(){
        this(2);//constructor chaining
        System.out.println("No args constructor");
    }

    public Constructor_dem(int n){
            this.n=n;
    }
    public Constructor_dem(int n,int a){
        this.a=a;
        this.n=n;
    }
    //private Constructor_dem(){}

    public int getN() {
        return n;
    }
    public int getA(){
        return a;
    }

    public static void main(String[] args) {
        Constructor_dem c = new Constructor_dem();
        Constructor_dem r = new Constructor_dem(2);
        Constructor_dem t = new Constructor_dem(7,4);
        System.out.println(r.getN());
        System.out.println(t.getN()+" "+t.getA());

    }
}
