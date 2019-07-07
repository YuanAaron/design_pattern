package com.oshacker.design.principle.liskovsubstitution;

public class Rectangle implements Quadrangle{
    private long length;
    private long width;

    @Override
    public long getLength() {
        return length;
    }

    @Override
    public long getWidth() {
        return width;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
