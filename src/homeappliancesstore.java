/**
 * @author aleks
 */
public class homeappliancesstore {
    static String namec ;
    static String adressc ;
    static int ple ;

    static void deviceStatus(Device a){
        System.out.println(a.status());
    }

    public static void main(String[] args) {
        gands pepe = new gands();

        Device FRIDGE1 = new Fridge(85.5, 183.5, 73.7, "Hitachi", "Hitachi GBK"
                , "PSIGIO NTOULAPA", 340,144, 396, 40, "C", "BLACK" );
        Device FRIDGE2 = new Fridge(54, 170, 59.5, "Sharp", "Sharp SJ"
                , "PSIGIOKATAPSIXTIS", 277, 84, 184,44, "C", "WHITE");

        Device WM1 = new WashingMachine(84.8, 59.8, 59, "Pitsos", "Pitsos WUP1403G9"
                , "EMPROSTHIAS FORTISIS", 64/100, 9, 48, 71, 3.48, "B"  );
        Device WM2 = new WashingMachine(55.98, 44, 13, "Pitsos", "Pitsos WUP1403G9"
                , "EMPROSTHIAS FORTISIS", 68/100, 8, 42, 44, 4, "B");

        Device OV1 = new Oven(59.5, 59.5, 56.4, "Whirlpool", "Whirlpool W7 OM5 4S"
                , "hlektrikos", 300, 5, 71, "vithisomenoi", "YES", "diatherei" );
        Device OV2 = new Oven(34, 65, 56, "Whirlpool", "Whirlpool W7 OM5 4S"
                , "hlektrikos", 350, 3, 60, "vithisomenoi", "YES", "diatherei");

        Device AC1 = new AirCondition(88.2, 55.4, 25.55, "Mitsubishi", "Mitsubishi Electric"
                , "AC", 500, 11703, 140, 730, 52, 62);
        Device AC2 = new AirCondition(77, 60, 35.55, "Mitsubishi", "Mitsubishi Electric"
                       , "AC", 400, 11589, 140, 600, 56, 68);


        System.out.println("FRIDGE1 : " + FRIDGE1 + '\n');
        FRIDGE1.PowerOn();
        deviceStatus(FRIDGE1);
        System.out.println("FRIDGE2 : " + FRIDGE2 + '\n');
        FRIDGE2.PowerOff();
        deviceStatus(FRIDGE2);

        System.out.println("WM1 : " + WM1 + '\n');
        WM1.PowerOn();
        deviceStatus(WM1);
        System.out.println("WM2 : " + WM2 + '\n' );
        WM2.PowerOff();
        deviceStatus(WM2);

        System.out.println("OV1 : " + OV1 + '\n');
        OV1.PowerOn();
        deviceStatus(OV1);
        System.out.println("OV2 : " + OV2 + '\n');
        OV2.PowerOff();
        deviceStatus(OV2);

        System.out.println("AC1 = " + AC1 + '\n' );
        AC1.PowerOn();
        deviceStatus(AC1);
        System.out.println("AC2 = " + AC2 + '\n');
        AC2.PowerOff();
        deviceStatus(AC2);

        int count =  Fridge.countF + WashingMachine.countWM + Oven.countOv + AirCondition.countAC;
        System.out.println("plithos siskevon = " + count +'\n');


        pepe.setNamec(args[3]);
        pepe.setAdressc(args[4]);
        pepe.setPle (Integer.parseInt(args[5]));

        System.out.println("namec = " + pepe.getNamec() + '\n' + "adressc = " + pepe.getAdressc() + '\n' + "ple = " + pepe.getPle());

        namec = args[0];
        adressc = args[1];
        ple = Integer.parseInt(args[2]);

        if(namec == null ) {
            System.out.println("namec error");
        }
        if (adressc == null ) {
            System.out.println("adressc error");
        }

        System.out.println("namec = " + namec + '\n' + "adressc = " + adressc + '\n' + "ple = " + ple);
    }
}