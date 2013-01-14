package com.vainolo.jjtv5.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.vainolo.jjtv5.command.DeleteLinkCommand;
import com.vainolo.jjtv5.command.DeleteNodeCommand;
import com.vainolo.jjtv5.model.Canvas;
import com.vainolo.jjtv5.model.Link;
import com.vainolo.jjtv5.model.Node;

public class NodeComponentEditPolicy extends ComponentEditPolicy {
    @Override
    protected Command createDeleteCommand(GroupRequest deleteRequest) {
	Node node = (Node) getHost().getModel();
	Canvas canvas = (Canvas) getHost().getParent().getModel();
	CompoundCommand command = new CompoundCommand();
	for (Link link : node.getOutgoingLinks()) {
	    command.add(new DeleteLinkCommand(link));
	}
	for (Link link : node.getIncomingLinks()) {
	    command.add(new DeleteLinkCommand(link));
	}
	command.add(new DeleteNodeCommand(canvas, node));

	return command;
    }
}
