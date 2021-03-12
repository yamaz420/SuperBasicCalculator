package additionCalc;

import javax.swing.*;

import static java.lang.Double.*;

class readAString {
    private double tal1; //instansvariabel
    private Object ObjectInput;

    readAString(double tal1) {
        this.tal1 = tal1;
    }

    public void ReadInput() {

        /*--*/
        JOptionPane.showMessageDialog(null, "ange tal 1");
        String strTal1 = JOptionPane.showInputDialog(null);

        JOptionPane.showMessageDialog(null, "ange tal2");
        String strTal2 = JOptionPane.showInputDialog(ObjectInput);


        double tal1 = parseDouble(strTal1);
        double tal2 = parseDouble(strTal2);

        double summa = tal1 + tal2;


        String StrMsg = String.format("Summan är %20s %.2d :",summa);
        JOptionPane.showMessageDialog(null, StrMsg);
    }

    public static void main(String[] args) {

        readAString demo;
        demo = new readAString(StrictMath.expm1(Double.parseDouble("")));
        demo.ReadInput();
    }

}

class gobbe {


    public static void main(String[] args) {
        System.out.println("" + "n\""
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   =========================================  ||| 888   888") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   =========================================||| 888   888  ") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   =========================================  ||| 888   888") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   ========================================= ||| 888   888 ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888   =========================================  ") + "\n"
                + (" ||| 888   888     ") + "\n"
                + (" ||| 888   888     ") + "\n");
    }
}


/* double Kent1 = parseDouble(strKentJesus1);
        double Kent2 = parseDouble(strKentJesus2);
        strKentJesus1, Integer.parseInt(strKentJesus2

         double KentJesusDenStore = Kent1 * Kent2;


        JOptionPane.showInputDialog(null, "ange KentJesus #1:");
        String strKentJesus1 = JOptionPane.showInputDialog(null);

        JOptionPane.showInputDialog(null, "ange KentJesus #2:");
        String strKentJesus2 = JOptionPane.showInputDialog(null);

 */


/**
 * double KentJesus1 = Double.parseDouble(strKentJesus1);
 * double KentJesus2 = Double.parseDouble(strKentJesus2);
 * <p>
 * double multiplikator = tal1 * tal2;
 * }
 * <p>
 * public void printMeddelandeObjektet () {
 * String test = "";
 * test =String.format("summan är: %s %.2f", "Summan är", summa );
 * }
 * /**=======================================================
 * public void showMessageDialog() {
 * String test = "";
 * test = String.format("summan av dina 3 tal är: ", summa;
 * JOptionPane.showMessageDialog(null, test);
 * =========================================================
 */



