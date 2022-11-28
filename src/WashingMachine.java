public class WashingMachine extends Device{
    private  double xp;
    private  double kn;
    private  double eths;
    private  double dp;
    private  String apst;
    static int countWM = 0;

    //private String periodicMaintanceWM(){}

    public WashingMachine(double m, double h, double d, String ak, String as, String ts, double ke,
                          double xp, double kn, double eths, double dp, String apst) {
        super(m, h,d, ak, as, ts, ke);
        this.xp = xp;
        this.kn = kn;
        this.eths = eths;
        this.dp = dp;
        this.apst = apst;
        countWM++;
    }

    public String toString() {
        return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + ", " + xp + ", " + kn + ", " + eths + ", " + dp + ", " + apst + '\n' + countWM + '\n';
    }
}


