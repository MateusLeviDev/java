package S_GUIComponents;

import javax.swing.*;
import java.awt.*;

public class JFrameBorderLayout extends javax.swing.JFrame {


    BorderLayout layout;


    /**
     * Creates new form JFrameBorderLayout
     */
    public JFrameBorderLayout() {

        super("Teste BorderLayout");

        initialize();

    }


    private void initialize() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setPreferredSize(new Dimension(400, 200)); //define o tamanho

        layout = new BorderLayout();

        getContentPane().setLayout(layout);


        layout.setHgap(5);//define o espaçamento horizontal entre GUI

        layout.setVgap(5);//define o espaçamento vertical entre GUI

        add(new JButton("Norte"), BorderLayout.NORTH);

        add(new JButton("Sul"), BorderLayout.SOUTH);

        add(new JButton("Leste"), BorderLayout.EAST);

        add(new JButton("Oeste"), BorderLayout.WEST);

        add(new JLabel("Um texto no Centro"), BorderLayout.CENTER);

        pack();

    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFrameBorderLayout().setVisible(true);
            }

        });
    }


}
