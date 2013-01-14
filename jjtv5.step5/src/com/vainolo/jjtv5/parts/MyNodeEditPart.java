package com.vainolo.jjtv5.parts;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.vainolo.jjtv5.model.Node;
import com.vainolo.jjtv5.policy.NodeComponentEditPolicy;
import com.vainolo.jjtv5.policy.NodeGraphicalNodeEditPolicy;

public class MyNodeEditPart extends AbstractGraphicalEditPart implements
	NodeEditPart, Observer {

    private ConnectionAnchor anchor;

    public MyNodeEditPart(Node model) {
	setModel(model);
	model.addObserver(this);
    }

    @Override
    protected IFigure createFigure() {
	setFigure(new RectangleFigure());
	anchor = new ChopboxAnchor(getFigure());
	return getFigure();
    }

    @Override
    protected void createEditPolicies() {
	installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
		new NodeGraphicalNodeEditPolicy());
	installEditPolicy(EditPolicy.COMPONENT_ROLE,
		new NodeComponentEditPolicy());
    }

    @Override
    protected List getModelSourceConnections() {
	return ((Node) getModel()).getOutgoingLinks();
    }

    @Override
    protected List getModelTargetConnections() {
	return ((Node) getModel()).getIncomingLinks();
    }

    @Override
    protected void refreshVisuals() {
	Node model = (Node) getModel();
	RectangleFigure figure = (RectangleFigure) getFigure();
	figure.setBounds(new Rectangle(model.getX(), model.getY(),
		model.getW(), model.getH()));
    }

    public ConnectionAnchor getSourceConnectionAnchor(
	    ConnectionEditPart connection) {
	return anchor;
    }

    public ConnectionAnchor getTargetConnectionAnchor(
	    ConnectionEditPart connection) {
	return anchor;
    }

    public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	return anchor;
    }

    public ConnectionAnchor getTargetConnectionAnchor(Request request) {
	return anchor;
    }

    @Override
    public void update(Observable arg0, Object arg1) {
	refresh();
    }

}
