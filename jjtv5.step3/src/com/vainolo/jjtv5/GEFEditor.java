package com.vainolo.jjtv5;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;

import com.vainolo.jjtv5.model.Canvas;
import com.vainolo.jjtv5.parts.GEFEditorEditPartFactory;

public class GEFEditor extends GraphicalEditorWithFlyoutPalette {

    public GEFEditor() {
	setEditDomain(new DefaultEditDomain(this));
    }

    @Override
    protected PaletteRoot getPaletteRoot() {
	return new GEFEditorPalette();
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
    }

    @Override
    protected void initializeGraphicalViewer() {
	super.initializeGraphicalViewer();
	getGraphicalViewer().setEditPartFactory(new GEFEditorEditPartFactory());
	getGraphicalViewer().setContents(new Canvas());
    }
}
