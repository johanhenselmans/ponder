// Generated by the WOLips Template engine Plug-in at Jan 10, 2010 12:00:00 PM
package er.authexample;

import org.apache.log4j.Logger;

import er.extensions.appserver.ERXSession;

public class Session extends ERXSession {
	private static final Logger log = Logger.getLogger(Session.class);
	
	public Session() {
		log.debug("Session created: " + sessionID());
		
		setStoresIDsInCookies(true);
		setStoresIDsInURLs(false);
	}
}
