package com.vainolo.jjtv5.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

public class Canvas extends Observable {
    List<Node> nodes = new ArrayList<>();

    public List<Node> getNodes() {
	return Collections.unmodifiableList(nodes);
    }

    public void addNode(Node node) {
	nodes.add(node);
	setChanged();
	notifyObservers();
    }

    public void removeNode(Node node) {
	nodes.remove(node);
	setChanged();
	notifyObservers();
    }

}
