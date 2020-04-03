package Buoi2;

import javax.swing.*;

public class JoptionPaneTest {
    public static void main(String[] args) {
        String radiusStr;
        double radius, area;

        radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle");
        radius = Double.parseDouble(radiusStr);
        area = radius*radius*Math.PI;
        System.out.println("The area is " + area);
    }
}
