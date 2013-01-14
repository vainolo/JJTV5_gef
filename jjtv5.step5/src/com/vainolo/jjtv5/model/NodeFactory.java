package com.vainolo.jjtv5.model;

import org.eclipse.gef.requests.CreationFactory;

public class NodeFactory implements CreationFactory {

    @Override
    public Object getNewObject() {
	return new Node();
    }

    @Override
    public Object getObjectType() {
	return Node.class;
    }

}
