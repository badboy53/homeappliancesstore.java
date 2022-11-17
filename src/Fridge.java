public class Fridge {

    private double m;
    private double h;
    private double d;
    private String ak;
    private String as;
    private String ts;
    private double ke;
    private double xk;
    private double xs;
    private double eth;
    private String ekl;
    private String c;
    static int countF;

    /** prosorina adio function*/
    //private String periodicMaintanceF(){}


    /** constractor public
     * @param m
     * @param h
     * @param d
     * @param ak
     * @param as
     * @param ts
     * @param ke
     * @param xk    XORITIKOTHTA KATAPSIKSHS
     * @param xs    XORITIKOTHTA SINTIRISIS
     * @param eth   EPIPEDO THORIVOU
     * @param ekl   ENERGIAKH KLASH
     * @param c     COLOR
     * */
    public Fridge(double m, double h, double d, String ak, String as, String ts, double ke, double xk, double xs, double eth, String ekl, String c) {
        this.m = m;
        this.h = h;
        this.d = d;
        this.ak = ak;
        this.as = as;
        this.ts = ts;
        this.ke = ke;
        this.xk = xk;
        this.xs = xs;
        this.eth = eth;
        this.ekl = ekl;
        this.c = c;
        countF++;
    }

    /**toString method public
     * return
     * */
    public String toString(){
        return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + ", " + xk + ", " + xs + ", " + eth + ", " + ekl + ", " + c + '\n' + countF + '\n';
    }
}
