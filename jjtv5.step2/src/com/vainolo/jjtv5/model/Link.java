package com.vainolo.jjtv5.model;

public class Link {
    private Node source;
    private Node target;

    public Node getSource() {
	return source;
    }

    public void setSource(Node source) {
	this.source = source;
	source.getOutgoingLinks().add(this);
    }

    public Node getTarget() {
	return target;
    }

    public void setTarget(Node target) {
	this.target = target;
	target.getIncomingLinks().add(this);
    }

}
