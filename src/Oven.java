public class Oven {
    private double m;
    private double h;
    private double d;
    private String ak;
    private String as;
    private String ts;
    private double ke;
    private int tps;
    private double tf;
    private String diak;
    private String pso;
    private String sk;
    static int countOv;


    /** prosorina adio function */
    //private String periodicMaintanceOv(){}

    /** constractor public
     * @param m
     * @param h
     * @param d
     * @param ak
     * @param as
     * @param ts
     * @param ke
     * @param tps   ARITHMOS TROPOY PSISIMATOS
     * @param tf    XORITIKOTITA FOURNOU
     * @param diak  DIAKOPTES
     * @param pso   PSIFIAKI OTHONI
     * @param sk    SISTIMA KATHARISMOY
     * */
    public Oven(double m, double h, double d, String ak, String as, String ts, double ke, int tps, double tf, String diak, String pso, String sk) {
        this.m = m;
        this.h = h;
        this.d = d;
        this.ak = ak;
        this.as = as;
        this.ts = ts;
        this.ke = ke;
        this.tps = tps;
        this.tf = tf;
        this.diak = diak;
        this.pso = pso;
        this.sk = sk;
        countOv++;
    }

    /**
     * toString method public
     * return
     * */
    public String toString(){
        return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + ", " + tps + ", " + tf + ", " + diak + ", " + pso + ", " + sk + '\n' + countOv + '\n';
    }
}
