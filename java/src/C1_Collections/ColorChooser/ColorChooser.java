package C1_Collections.ColorChooser;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ColorChooser {
    private Map<String, Color> colorMap;

    public ColorChooser() {
        colorMap = new HashMap<>();

        colorMap.put("Vermelho", Color.RED);
        colorMap.put("Verde", Color.GREEN);
        colorMap.put("Azul", Color.BLUE);
        colorMap.put("Amarelo", Color.YELLOW);
        colorMap.put("Ciano", Color.CYAN);
        colorMap.put("Magenta", Color.MAGENTA);
        colorMap.put("Laranja", Color.ORANGE);
        colorMap.put("Rosa", Color.PINK);
        colorMap.put("Cinza", Color.GRAY);
        colorMap.put("Branco", Color.WHITE);
        colorMap.put("Preto", Color.BLACK);
        colorMap.put("Marrom", new Color(139, 69, 19)); // Cor personalizada
        colorMap.put("Roxo", new Color(128, 0, 128));   // Cor personalizada
    }

    public Color getColor(String nomeCor) {
        return colorMap.get(nomeCor);
    }
}
