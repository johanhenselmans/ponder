package er.r2d2w.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOMessage;

import er.directtoweb.components.ERD2WStatelessComponent;
import er.extensions.foundation.ERXStringUtilities;

public class R2D2WDisplayImageFile extends ERD2WStatelessComponent {
    public R2D2WDisplayImageFile(WOContext context) {
        super(context);
    }

	public String altText() {
		String altText = (String)d2wContext().valueForKey("altText");
		if(!ERXStringUtilities.stringIsNullOrEmpty(altText)) {
			altText = WOMessage.stringByEscapingHTMLString(altText);
		} else {
			altText = "";
		}
		return altText;
	}
}