package org.drools.command.impl;

import org.drools.command.Command;
import org.drools.command.CommandService;
import org.drools.command.Context;

public class DefaultCommandService implements CommandService {

	private Context context;
	
	public DefaultCommandService(Context context) {
		this.context = context;
	}
	
	public Context getContext() {
		return context;
	}
	
	public <T> T execute(Command<T> command) {
		return ((GenericCommand<T>)command).execute(context);
	}

}