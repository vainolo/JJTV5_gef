package com.vainolo.jjtv5.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.jjtv5.model.Canvas;
import com.vainolo.jjtv5.model.Node;

public class CreateNodeCommand extends Command {

    private Canvas canvas;
    private Node node;

    public CreateNodeCommand(Canvas canvas, Node node) {
	this.canvas = canvas;
	this.node = node;
    }

    @Override
    public void execute() {
	canvas.addNode(node);
    }

}
