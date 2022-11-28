public class AirCondition extends Device{
    private  double ips;
    private  double kps;
    private  double kth;
    private  double esm;
    private  double eksm;
    static int countAC = 0;

    //private String periodicMaintanceAC(){}

    public AirCondition(double m, double h, double d, String ak, String as, String ts, double ke,
                        double ips, double kps, double kth, double esm, double eksm) {
        super(m, h,d, ak, as, ts, ke);
        this.ips = ips;
        this.kps = kps;
        this.kth = kth;
        this.esm = esm;
        this.eksm = eksm;
        countAC++;
    }

    public String toString(){
        return  m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + ", " + ips + ", " + kps + ", " + kth + ", " + esm + ", " + eksm + '\n' + countAC + '\n';
    }
}
