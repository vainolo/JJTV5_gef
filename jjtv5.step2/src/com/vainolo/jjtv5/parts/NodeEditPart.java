package com.vainolo.jjtv5.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.vainolo.jjtv5.model.Node;

public class NodeEditPart extends AbstractGraphicalEditPart {

    public NodeEditPart(Node model) {
	setModel(model);
    }

    @Override
    protected IFigure createFigure() {
	setFigure(new RectangleFigure());
	return getFigure();
    }

    @Override
    protected void createEditPolicies() {
    }

    @Override
    protected void refreshVisuals() {
	Node model = (Node) getModel();
	RectangleFigure figure = (RectangleFigure) getFigure();
	figure.setBounds(new Rectangle(model.getX(), model.getY(),
		model.getW(), model.getH()));
    }

}
