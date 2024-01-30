import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {
    public JButton Button1;
    public JPanel dataPanel;
    private JLabel mensajeTXT;
    private JTextField nameTF;
    private JTextField ciTF;
    private JTextField calif1TF;
    private JTextField calif2TF;
    private JButton insertButton;
    private JButton borrarButton;

    public menu() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conector miconexion = new conector();
                miconexion.conexionLocal("jdbc:mysql://localhost:3306/estudiantes","root","");
                mensajeTXT.setText(miconexion.getMensaje());
            }

        });
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertar insertar = new insertar();
                /*insertar.ingresoDatos("jose","1254789632",8,7);*/
                insertar.ingresoDatos(nameTF.getText(),ciTF.getText(),Integer.parseInt(calif1TF.getText()),Integer.parseInt(calif2TF.getText()));
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameTF.setText("");
                ciTF.setText("");
                calif1TF.setText("");
                calif2TF.setText("");
            }
        });
    }
}
