package er.r2d2w.pages;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSDictionary;

import er.directtoweb.pages.ERD2WMessagePage;

public class R2D2WMessagePage extends ERD2WMessagePage {

	public R2D2WMessagePage(WOContext context) {
        super(context);
    }
	
	public NSDictionary<String, String> branch() {
		return (NSDictionary<String, String>)d2wContext().valueForKeyPath("branch");
	}
    
}