package com.vainolo.jjtv5.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

public class Node extends Observable {
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

    public void setConstraints(int x, int y, int w, int h) {
	setX(x);
	setY(y);
	setW(w);
	setH(h);
	setChanged();
	notifyObservers();
    }

    public List<Link> getIncomingLinks() {
	return Collections.unmodifiableList(incomingLinks);
    }

    public List<Link> getOutgoingLinks() {
	return Collections.unmodifiableList(outgoingLinks);
    }

    public void addIncomingLink(Link link) {
	incomingLinks.add(link);
	setChanged();
	notifyObservers();
    }

    public void addOutgoingLink(Link link) {
	outgoingLinks.add(link);
	setChanged();
	notifyObservers();
    }

    public void removeOutgoingLink(Link link) {
	outgoingLinks.remove(link);
	setChanged();
	notifyObservers();
    }

    public void removeIncomingLink(Link link) {
	incomingLinks.remove(link);
	setChanged();
	notifyObservers();
    }
}
