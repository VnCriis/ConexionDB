import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ingreso de calificaciones");
        frame.setContentPane(new menu().dataPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.pack();
        frame.setVisible(true);
    }
}