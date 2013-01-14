package com.vainolo.jjtv5.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.vainolo.jjtv5.command.DeleteLinkCommand;
import com.vainolo.jjtv5.model.Link;

public class LinkConnectionEditPolicy extends ConnectionEditPolicy {

    @Override
    protected Command getDeleteCommand(GroupRequest request) {
	Link link = (Link) getHost().getModel();
	return new DeleteLinkCommand(link);
    }

}
