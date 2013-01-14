package com.vainolo.jjtv5.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.jjtv5.model.Link;
import com.vainolo.jjtv5.model.Node;

public class CreateLinkCommand extends Command {

    private Link link;
    private Node source;
    private Node target;

    public CreateLinkCommand(Link link, Node source) {
	this.link = link;
	this.source = source;
    }

    public void setTarget(Node target) {
	this.target = target;
    }

    @Override
    public void execute() {
	link.setSource(source);
	link.setTarget(target);
	source.addOutgoingLink(link);
	target.addIncomingLink(link);
    }

}
