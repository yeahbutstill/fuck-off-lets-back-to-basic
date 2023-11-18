package com.zamannow.oop.data;

public class PointOldFinal {
    private final int x;
    private final int y;

    public PointOldFinal(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointOldFinal that)) return false;

        if (getX() != that.getX()) return false;
        return getY() == that.getY();
    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        return result;
    }

    @Override
    public String toString() {
        return "PointOldFinal{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
