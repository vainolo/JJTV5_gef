package com.vainolo.jjtv5.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.jjtv5.model.Link;
import com.vainolo.jjtv5.model.Node;

public class DeleteLinkCommand extends Command {
    private Node source;
    private Node target;
    private Link link;

    public DeleteLinkCommand(Link link) {
	this.link = link;
	this.source = link.getSource();
	this.target = link.getTarget();
    }

    @Override
    public void execute() {
	link.setSource(null);
	link.setTarget(null);
	source.removeOutgoingLink(link);
	target.removeIncomingLink(link);
    }

    @Override
    public void undo() {
	link.setSource(source);
	link.setTarget(target);
	source.addOutgoingLink(link);
	target.addIncomingLink(link);
    }

}
