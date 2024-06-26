package com.zamannow.testsoaljava.junior.day3;

import java.awt.*;

public class Face {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(320, 180);
        Graphics g = panel.getGraphics();
        drawingFace(g, 10, 30);
        drawingFace(g, 150, 50);
    }

    private static void drawingFace(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 100, 100); // face outline

        g.setColor(Color.BLUE);
        g.fillOval(x + 20, y + 30, 20, 20); // eyes
        g.fillOval(x + 60, y + 30, 20, 20);

        g.setColor(Color.RED); // mouth
        g.drawLine(x + 30, y + 70, x + 70, y + 70);
    }
}
