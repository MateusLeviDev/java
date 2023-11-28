package C_Collections.ColorChooser;

import javax.swing.*;
import java.awt.*;

public class ColorChooserApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Color Chooser App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            JPanel panel = new JPanel();
            JButton chooseColorButton = new JButton("Escolher Cor");
            panel.add(chooseColorButton);

            ColorChooser colorChooser = new ColorChooser();

            chooseColorButton.addActionListener(e -> {
                String selectedColorName = JOptionPane.showInputDialog(
                        frame, "Digite o nome da cor:");

                Color selectedColor = colorChooser.getColor(selectedColorName);

                if (selectedColor != null) {
                    JPanel colorPanel = new JPanel();
                    colorPanel.setBackground(selectedColor);

                    JOptionPane.showMessageDialog(
                            frame, colorPanel, "Cor Selecionada", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(
                            frame, "Cor não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
