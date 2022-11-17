/**
 * @author aleks
 */
public class homeappliancesstore {
    static String namec ;
    static String adressc ;
    static int ple ;
    public static void main(String[] args) {


        /**
         * orismos antikimenon me times ton siskevon
         */
        gands pepe = new gands();
        Fridge FRIDGE1 = new Fridge(85.5, 183.5, 73.7, "Hitachi", "Hitachi GBK"
                , "PSIGIO NTOULAPA", 340,144, 396, 40, "C", "BLACK" );
        Fridge FRIDGE2 = new Fridge(54, 170, 59.5, "Sharp", "Sharp SJ"
                , "PSIGIOKATAPSIXTIS", 277, 84, 184,44, "C", "WHITE");

        WashingMachine WM1 = new WashingMachine(84.8, 59.8, 59, "Pitsos", "Pitsos WUP1403G9"
                , "EMPROSTHIAS FORTISIS", 64/100, 9, 48, 71, 3.48, "B"  );
        WashingMachine WM2 = new WashingMachine(55.98, 44, 13, "Pitsos", "Pitsos WUP1403G9"
                , "EMPROSTHIAS FORTISIS", 68/100, 8, 42, 44, 4, "B");

        Oven OV1 = new Oven(59.5, 59.5, 56.4, "Whirlpool", "Whirlpool W7 OM5 4S"
                , "hlektrikos", 300, 5, 71, "vithisomenoi", "YES", "diatherei" );
        Oven OV2 = new Oven(34, 65, 56, "Whirlpool", "Whirlpool W7 OM5 4S"
                , "hlektrikos", 350, 3, 60, "vithisomenoi", "YES", "diatherei");

        AirCondition AC1 = new AirCondition(88.2, 55.4, 25.55, "Mitsubishi", "Mitsubishi Electric"
                , "AC", 500, 11703, 140, 730, 52, 62);
        AirCondition AC2 = new AirCondition(77, 60, 35.55, "Mitsubishi", "Mitsubishi Electric"
                       , "AC", 400, 11589, 140, 600, 56, 68);


        /**
         * ektiposi xaraktiristikon ton siskevon kai to plithos ana tipo siskevon
         */
        System.out.println("FRIDGE1 : " + FRIDGE1 + '\n' + "FRIDGE2 : " + FRIDGE2 + '\n');

        System.out.println("WM1 : " + WM1 + '\n' + "WM2 : " + WM2 + '\n' );

        System.out.println("OV1 : " + OV1 + '\n' + "OV2 : " + OV2 + '\n');

        System.out.println("AC1 = " + AC1 + '\n' + "AC2 = " + AC2 + '\n');

        /**
         * sinoliko plithos
         */
        int count =  Fridge.countF + WashingMachine.countWM + Oven.countOv + AirCondition.countAC;
        System.out.println("plithos siskevon = " + count +'\n');




        pepe.setNamec(args[3]);
        pepe.setAdressc(args[4]);
        pepe.setPle (Integer.parseInt(args[5]));

        System.out.println("namec = " + pepe.getNamec() + '\n' + "adressc = " + pepe.getAdressc() + '\n' + "ple = " + pepe.getPle());

        namec = args[0];
        adressc = args[1];
        ple = Integer.parseInt(args[2]);


        /**
         * elengxos if null
         */
        if(namec == null ) {
            System.out.println("namec error");
        }
        if (adressc == null ) {
            System.out.println("adressc error");
        }

        System.out.println("namec = " + namec + '\n' + "adressc = " + adressc + '\n' + "ple = " + ple);
    }
}