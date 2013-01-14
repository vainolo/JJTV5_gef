package com.vainolo.jjtv5.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.jjtv5.model.Node;

public class ChangeNodeConstraintsCommand extends Command {

    private int x, y, w, h;
    private int oldX, oldY, oldW, oldH;
    private Node node;

    public ChangeNodeConstraintsCommand(Node node, int x, int y, int w, int h) {
	this.node = node;
	this.x = x;
	this.y = y;
	this.w = w;
	this.h = h;
    }

    @Override
    public void execute() {
	oldX = node.getX();
	oldY = node.getY();
	oldW = node.getW();
	oldH = node.getH();
	node.setConstraints(x, y, w, h);
    }

    @Override
    public void undo() {
	node.setConstraints(oldX, oldY, oldW, oldH);
    }
}
