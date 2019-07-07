package com.oshacker.design.principle.liskovsubstitution;

public class Square extends Rectangle{
    private long lengthofside;

    public long getLengthofside() {
        return lengthofside;
    }

    public void setLengthofside(long lengthofside) {
        this.lengthofside = lengthofside;
    }

    @Override
    public long getLength() {
        return getLengthofside();
    }

    @Override
    public void setLength(long length) {
        setLengthofside(length);
    }

    @Override
    public long getWidth() {
        return getLengthofside();
    }

    @Override
    public void setWidth(long width) {
        setLengthofside(width);
    }
}
