package com.vainolo.jjtv5.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.vainolo.jjtv5.model.Canvas;
import com.vainolo.jjtv5.model.Node;

public class GEFEditorEditPartFactory implements EditPartFactory {

    @Override
    public EditPart createEditPart(EditPart context, Object model) {
	if (model.getClass().equals(Node.class))
	    return new NodeEditPart((Node) model);
	else if (model.getClass().equals(Canvas.class))
	    return new CanvasEditPart((Canvas) model);
	else
	    throw new IllegalArgumentException(
		    "Model entity not supported yet.");
    }
}
