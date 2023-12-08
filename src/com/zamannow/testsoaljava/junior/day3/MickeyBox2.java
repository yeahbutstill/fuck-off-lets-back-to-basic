package com.zamannow.testsoaljava.junior.day3;

import java.awt.*;

public class MickeyBox2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(220, 150);
        panel.setBackground(new Color(10, 10, 0));
        Graphics g = panel.getGraphics();
        drawFigure(g, 50, 25);
        drawFigure(g, 250, 45);


    }

    public static void drawFigure(Graphics g, int x, int y) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 40, 40);
        g.fillOval(x + 80, y, 40, 40);
        g.setColor(Color.RED);
        g.fillRect(x + 20, y + 20, 80, 80);
        g.setColor(Color.BLACK);
        g.drawLine(x + 20, y + 60, x + 100, y + 60);
    }
}
