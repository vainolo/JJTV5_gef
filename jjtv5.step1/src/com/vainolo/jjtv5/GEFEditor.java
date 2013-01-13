package com.vainolo.jjtv5;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;

public class GEFEditor extends GraphicalEditorWithFlyoutPalette {

	public GEFEditor() {
	    setEditDomain(new DefaultEditDomain(this));		
	}
	
	@Override
	protected PaletteRoot getPaletteRoot() {
		return null;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}
}
