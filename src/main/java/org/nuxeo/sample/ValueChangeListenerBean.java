/**
 *
 */

package org.nuxeo.sample;

import java.io.Serializable;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.AjaxBehaviorEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Name("valueChangeListener")
@Scope(ScopeType.EVENT)
public class ValueChangeListenerBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Log log = LogFactory.getLog(ValueChangeListenerBean.class);
    private String selectedValue;

    public String getSelectedValue() {
        return selectedValue;
    }
    public void setSelectedValue(String selectedValue) {
        log.error(selectedValue);
        this.selectedValue = selectedValue;
    }

    public void valueChange(ValueChangeEvent e) {
        String s = (String) e.getNewValue();
        log.error(s);
    }
    public void ajaxListener(AjaxBehaviorEvent e) {
	log.error("ajaxListener");
    }

    //@In(create = true, required = false)
    //protected transient CoreSession documentManager;

}
