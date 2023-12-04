package S_GUIComponents;

import javax.swing.*;
import java.awt.*;

public class JFrameFlowLayout extends JFrame {

    FlowLayout flowLayout = new FlowLayout();

    public JFrameFlowLayout() throws HeadlessException {
        super("Test FlowLayout");
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //      setPreferredSize(new Dimension(400, 200));

        getContentPane().setLayout(flowLayout);

        for (int i = 0; i < 5; i++) {
            add(new JButton("Botão- " + i));
        }
        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFrameFlowLayout().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify
    // End of variables declaration

}

