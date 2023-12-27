package S_GUIComponents;

import javax.swing.*;
import java.awt.*;

public class JFrameGridLayout extends JFrame {

    GridLayout layout;

    /**
     * Creates new form JFrameGridLayout
     */

    public JFrameGridLayout() {

        super("Teste GridLayout ");

        initialize();

    }

    private void initialize() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setPreferredSize(new Dimension(400, 200));


        layout = new GridLayout(3, 5);

        // setLayout(layout);

        getContentPane().setLayout(layout);

        //layout.setAlignment(FlowLayout.TRAILING);

        //layout.setHgap(15);

        //layout.setVgap(60);

        for (int i = 0; i < 10; i++) {

            add(new JButton("Botão - " + i));

        }

        pack();

    }


    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new JFrameGridLayout().setVisible(true);

            }
        });
    }

}