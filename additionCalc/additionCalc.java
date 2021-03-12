package additionCalc;

import javax.swing.JOptionPane;
import java.math.MathContext;
import java.lang.String.*;
import org.w3c.dom.ls.LSOutput;
import static javax.swing.JOptionPane.*;
import java.lang.*;

class Calc {
    private int sum1;
    private int sum2;
    private int sum3;
    private double result;

    public void setSum1() {
        this.sum1 = Integer.parseInt(showInputDialog("skriv in ett heltal BITCH!: "));
        System.out.print(this.sum1);
    }

    public void setSum2() {
        this.sum2 = Integer.parseInt(showInputDialog("skriv in ett TILL heltal BITCH!: "));
    }

    public void setSum3() {
        this.sum3 = Integer.parseInt(showInputDialog("Och sist men FAN inte minst, ett sista heltal...tack: "));
    }

    public void showMessageDialog() {
        String test = "";
        test = String.format("summan av dina 3 tal är: ") + result;
        JOptionPane.showMessageDialog(null, test);
    }
    public void addThreeInts() {
        this.result = sum1 + sum2 + sum3;
    }
    public static void main(String[] args) {
        Calc demo = new Calc();
        demo.setSum1();
        demo.setSum2();
        demo.setSum3();
        demo.addThreeInts();
        demo.showMessageDialog();
    }
}
