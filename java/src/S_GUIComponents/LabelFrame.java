package S_GUIComponents;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame() {
        super("Testing");
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);

        label2 = new JLabel("Label 2 with text");
        label2.setToolTipText("this is label2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Text");
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("this is label3");
        add(label3);
    }
}
