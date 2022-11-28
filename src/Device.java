public class Device {  //superclass
    private double m;
    private double h;
    private double d;
    private String ak;
    private String as;
    private String ts;
    private double ke;
    boolean status;

    public Device(double m, double h, double d, String ak, String as, String ts, double ke) {
        this.m = m;
        this.h = h;
        this.d = d;
        this.ak = ak;
        this.as = as;
        this.ts = ts;
        this.ke = ke;
    }

    public String toString() {
        return m + ", " + h + ", " + d + ", " + ak + ", " + as + ", " + ts + ", " + ke + '\n';
    }

    void PowerOn(){
        status = true;
        System.out.println("status device ine true");
    }

    void PowerOff(){
        status = false;
        System.out.println("status device ine false");
    }

    boolean status() {
       return status;
    }
}
