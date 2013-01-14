package com.vainolo.jjtv5.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.vainolo.jjtv5.command.CreateLinkCommand;
import com.vainolo.jjtv5.model.Link;
import com.vainolo.jjtv5.model.Node;

public class NodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

    @Override
    protected Command getConnectionCompleteCommand(
	    CreateConnectionRequest request) {
	CreateLinkCommand command = (CreateLinkCommand) request
		.getStartCommand();
	command.setTarget((Node) getHost().getModel());
	return command;
    }

    @Override
    protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
	Node source = (Node) getHost().getModel();
	Link link = (Link) request.getNewObject();
	CreateLinkCommand command = new CreateLinkCommand(link, source);
	request.setStartCommand(command);
	return command;
    }

    @Override
    protected Command getReconnectTargetCommand(ReconnectRequest request) {
	return null;
    }

    @Override
    protected Command getReconnectSourceCommand(ReconnectRequest request) {
	return null;
    }

}
