package com.vainolo.jjtv5.model;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int x;
    private int y;
    private int w;
    private int h;
    private List<Link> incomingLinks = new ArrayList<>();
    private List<Link> outgoingLinks = new ArrayList<>();

    public void setX(int x) {
	this.x = x;
    }

    public int getX() {
	return x;
    }

    public void setY(int y) {
	this.y = y;
    }

    public int getY() {
	return y;
    }

    public void setW(int w) {
	this.w = w;
    }

    public int getW() {
	return w;
    }

    public void setH(int h) {
	this.h = h;
    }

    public int getH() {
	return h;
    }

    public List<Link> getIncomingLinks() {
	return incomingLinks;
    }

    public List<Link> getOutgoingLinks() {
	return outgoingLinks;
    }
}
