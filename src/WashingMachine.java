public class WashingMachine {
    private double m;
    private double h;
    private double d;
    private String ak;
    private String as;
    private String ts;
    private double ke;
    private double xp;
    private double kn;
    private double eths;
    private double dp;
    private String apst;
    static int countWM;


    /** prosorina adio function */
    //private String periodicMaintanceWM(){}

    /** constractor public
     * @param m
     * @param h
     * @param d
     * @param ak
     * @param as
     * @param ts
     * @param ke
     * @param xp    XORITIKOTHTA PLHSHS
     * @param kn    KATANALOSI NEROY
     * @param eths  EPIPEDO THORIVOU STHPSIMATOS
     * @param dp    DIARKEIA PROGRAMMATOS
     * @param apst  APODOSH STIPSIMATOS
     * */
    public WashingMachine(double m, double h, double d, String ak, String as, String ts, double ke, double xp, double kn, double eths, double dp, String apst) {
        this.m = m;
        this.h = h;
        this.d = d;
        this.ak = ak;
        this.as = as;
        this.ts = ts;
        this.ke = ke;
        this.xp = xp;
        this.kn = kn;
        this.eths = eths;
        this.dp = dp;
        this.apst = apst;
        countWM++;
    }

    /**toString method public
     * return
     * */
    public String toString() {
        return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + ", " + xp + ", " + kn + ", " + eths + ", " + dp + ", " + apst + '\n' + countWM + '\n';
    }
}


