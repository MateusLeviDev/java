package S_GUIComponents;

import javax.swing.*;
import java.awt.*;

public class JFrameGridBagLayout extends JFrame {

    /**
     * Creates new form
     * <p>
     * JFrameGridBagLayout
     */

    public JFrameGridBagLayout() {

        super("Teste GridBagLayout");

        initialize();

    }


    GridBagLayout layout;


    private final int noLinhas = 3;

    /**
     * Creates new form JFrameFlowLayout
     */


    private void initialize() {


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setPreferredSize(new Dimension(400, 200));


        layout = new GridBagLayout();


        // setLayout(layout);

        getContentPane().setLayout(layout);


        List lEsq = new List(noLinhas, true);

        lEsq.add("Um");

        lEsq.add("Dois");

        lEsq.add("Tres");

        lEsq.add("Quatro");

        lEsq.add("Cinco");

        lEsq.add("Seis");

        lEsq.add("Sete");

        Button add = new Button(">>");

        Button clear = new Button("Clear");

        Button close = new Button("Close");

        TextArea tDir = new TextArea("", noLinhas,

                10, TextArea.SCROLLBARS_NONE);


        GridBagConstraints restricoes = new GridBagConstraints();

        restricoes.gridx = 0;

        restricoes.gridy = 0;

        restricoes.gridwidth = 1;

        restricoes.gridheight = 3;

        restricoes.fill = GridBagConstraints.VERTICAL;

        add(lEsq, restricoes);


        restricoes.gridx = 2;

        add(tDir, restricoes);


        Insets margens = new Insets(4, 3, 4, 3);

        restricoes.gridx = 1;

        restricoes.gridy = 0;

        restricoes.gridwidth = 1;

        restricoes.gridheight = 1;

        restricoes.fill = GridBagConstraints.BOTH;

        restricoes.ipadx = 4;

        restricoes.ipady = 4;

        restricoes.insets = margens;

        add(add, restricoes);


        restricoes.gridy = 1;

        add(clear, restricoes);


        restricoes.gridy = 2;

        add(close, restricoes);


        pack();

    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new JFrameGridBagLayout().setVisible(true);

            }

        });

    }


}