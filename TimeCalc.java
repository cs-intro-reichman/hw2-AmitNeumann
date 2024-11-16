public class TimeCalc {
    public static void main(String[] args) {
        int hours=Integer.parseInt(""+args[0].charAt(0)+args[0].charAt(1));
        int minutes=Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
        int minutesToAdd=Integer.parseInt(args[1]);
        int totalM, totalH, newH, newM;
        String printH,printM;
        // calculating new hour
        totalM=(hours*60)+minutes+minutesToAdd;
        totalH=totalM/60;
        newH=totalH%24;
        newM=totalM-(totalH*60);
        // fixing zero's for printing
        if (newH<10)
            printH="0"+newH;
         else printH=""+newH;
        if (newM<10)
             printM="0"+newM;
         else printM=""+newM;
        System.out.println(printH+":"+printM);

    }
}
