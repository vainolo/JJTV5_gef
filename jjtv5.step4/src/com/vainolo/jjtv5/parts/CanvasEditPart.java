package com.vainolo.jjtv5.parts;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.vainolo.jjtv5.model.Canvas;
import com.vainolo.jjtv5.model.Node;
import com.vainolo.jjtv5.policy.CanvasXYLayoutEditPolicy;

public class CanvasEditPart extends AbstractGraphicalEditPart implements
	Observer {

    public CanvasEditPart(Canvas model) {
	setModel(model);
	model.addObserver(this);
    }

    @Override
    protected IFigure createFigure() {
	FreeformLayer layer = new FreeformLayer();
	layer.setLayoutManager(new FreeformLayout());
	return layer;
    }

    @Override
    protected void createEditPolicies() {
	installEditPolicy(EditPolicy.LAYOUT_ROLE,
		new CanvasXYLayoutEditPolicy());
    }

    @Override
    protected List<Node> getModelChildren() {
	return ((Canvas) getModel()).getNodes();
    }

    @Override
    public void update(Observable arg0, Object arg1) {
	refresh();
    }
}
