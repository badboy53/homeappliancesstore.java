public class AirCondition {
    private double m;
    private double h;
    private double d;
    private String ak;
    private String as;
    private String ts;
    private double ke;
    private double ips;
    private double kps;
    private double kth;
    private double esm;
    private double eksm;
    static int countAC;


    /** prosorina adio function */
    //private String periodicMaintanceAC(){}

    /** constractor public
     * @param m
     * @param h
     * @param d
     * @param ak
     * @param as
     * @param ts
     * @param ke
     * @param ips   ISXIS PSIKSHS
     * @param kps   KATANALOSH PSIKSHS
     * @param kth   KATANALOSH THERMANSHS
     * @param esm   ISXIS THORIVOU ESOTERIKHS MONADAS
     * @param eksm  ISXIS THORIVOU EKSOTERIKHS MONADAS
     * */
    public AirCondition(double m, double h, double d, String ak, String as, String ts, double ke, double ips, double kps, double kth, double esm, double eksm) {
        this.m = m;
        this.h = h;
        this.d = d;
        this.ak = ak;
        this.as = as;
        this.ts = ts;
        this.ke = ke;
        this.ips = ips;
        this.kps = kps;
        this.kth = kth;
        this.esm = esm;
        this.eksm = eksm;
        countAC++;
    }

    /**toString method public
     * return
     * */
    public String toString(){
        return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + ", " + ips + ", " + kps + ", " + kth + ", " + esm + ", " + eksm + '\n' + countAC + '\n';
    }
}
