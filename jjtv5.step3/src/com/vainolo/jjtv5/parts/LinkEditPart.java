package com.vainolo.jjtv5.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.vainolo.jjtv5.model.Link;

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
    }

    @Override
    protected IFigure createFigure() {
	return super.createFigure();
    }

}
