package com.vainolo.jjtv5.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.vainolo.jjtv5.model.Link;
import com.vainolo.jjtv5.policy.LinkConnectionEditPolicy;

public class LinkEditPart extends AbstractConnectionEditPart {

    public LinkEditPart(Link model) {
	setModel(model);
    }

    @Override
    protected void createEditPolicies() {
	// Must have one of these. See the documentation in
	// ConnectionEndPointEditPolicy
	installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
		new ConnectionEndpointEditPolicy());
	installEditPolicy(EditPolicy.CONNECTION_ROLE,
		new LinkConnectionEditPolicy());
    }

    @Override
    protected IFigure createFigure() {
	return super.createFigure();
    }

}
