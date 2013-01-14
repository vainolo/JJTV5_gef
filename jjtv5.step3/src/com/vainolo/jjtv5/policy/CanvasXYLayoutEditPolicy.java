package com.vainolo.jjtv5.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.vainolo.jjtv5.command.CreateNodeCommand;
import com.vainolo.jjtv5.model.Canvas;
import com.vainolo.jjtv5.model.Node;

public class CanvasXYLayoutEditPolicy extends XYLayoutEditPolicy {

    @Override
    protected Command getCreateCommand(CreateRequest request) {
	Node node = (Node) request.getNewObject();
	node.setX(request.getLocation().x);
	node.setY(request.getLocation().y);
	node.setW(50);
	node.setH(50);
	Canvas canvas = (Canvas) getHost().getModel();
	return new CreateNodeCommand(canvas, node);
    }
}
