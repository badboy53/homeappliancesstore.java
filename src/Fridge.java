public class Fridge extends Device{
    private  double xk;
    private  double xs;
    private  double eth;
    private  String ekl;
    private  String c;
    static int countF = 0;

    //private String periodicMaintanceF(){}

    public Fridge(double m, double h, double d, String ak, String as, String ts, double ke,
                  double xk, double xs, double eth, String ekl, String c) {
        super(m, h, d, ak, as, ts, ke);
        this.xk = xk;
        this.xs = xs;
        this.eth = eth;
        this.ekl = ekl;
        this.c = c;
        countF++;
    }

    public String toString(){
            return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + + xk + ", " + xs + ", " + eth + ", " + ekl + ", " + c + '\n' + countF + '\n';
    }
}
