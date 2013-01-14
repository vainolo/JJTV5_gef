package com.vainolo.jjtv5.model;

import org.eclipse.gef.requests.CreationFactory;

public class LinkFactory implements CreationFactory {

    @Override
    public Object getNewObject() {
	return new Link();
    }

    @Override
    public Object getObjectType() {
	return Link.class;
    }

}
