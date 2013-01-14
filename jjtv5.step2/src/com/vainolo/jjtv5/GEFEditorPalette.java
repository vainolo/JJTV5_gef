package com.vainolo.jjtv5;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import com.vainolo.jjtv5.model.LinkFactory;
import com.vainolo.jjtv5.model.NodeFactory;

public class GEFEditorPalette extends PaletteRoot {
    public GEFEditorPalette() {
	PaletteGroup g = new PaletteGroup("Tools");
	add(g);
	g.add(new SelectionToolEntry());
	g.add(new CreationToolEntry("Node", "Create a Node", new NodeFactory(),
		null, null));
	g.add(new ConnectionCreationToolEntry("Link", "Create a Link",
		new LinkFactory(), null, null));

    }
}
