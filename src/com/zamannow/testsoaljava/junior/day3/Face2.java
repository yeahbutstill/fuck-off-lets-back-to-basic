package com.zamannow.testsoaljava.junior.day3;

import java.awt.*;

public class Face2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520, 180);
        Graphics g = panel.getGraphics();
        for (int i = 0; i < 5; i++) {
            drawingFace(g, 10 + (i * 100), 30);
        }
    }

    public static void drawingFace(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.drawOval(x, y, 100, 100); // face outline

        g.setColor(Color.BLUE);
        g.fillOval(x + 20, y + 30, 20, 20); // eyes
        g.fillOval(x + 60, y + 30, 20, 20);

        g.setColor(Color.RED); // mouth
        g.drawLine(x + 30, y + 70, x + 70, y + 70);
    }
}
