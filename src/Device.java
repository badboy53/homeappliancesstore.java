public class Device {  //superclass
    public  double m;
    public  double h;
    public  double d;
    public  String ak;
    public  String as;
    public  String ts;
    public  double ke;
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

    public String toString(){
        return this.m + ", " + this.h + ", " + this.d + ", " + this.ak + ", " + this.as + ", " + this.ts + ", " + this.ke + '\n';
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
