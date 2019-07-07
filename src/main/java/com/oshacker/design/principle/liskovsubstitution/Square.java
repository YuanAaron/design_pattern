package com.oshacker.design.principle.liskovsubstitution;

public class Square implements Quadrangle {
    private long lengthofside;

    @Override
    public long getLength() {
        return this.lengthofside;
    }

    @Override
    public long getWidth() {
        return this.lengthofside;
    }

    public long getLengthofside() {
        return lengthofside;
    }

    public void setLengthofside(long lengthofside) {
        this.lengthofside = lengthofside;
    }
}