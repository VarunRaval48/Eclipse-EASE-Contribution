package com.varun.properties.page;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;

public class SignatureVals extends PropertyPage implements IWorkbenchPropertyPage {

	public SignatureVals() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub

//		Composite composite = new Composite(parent, SWT.NONE)
		
		Label l1 = new Label(parent, SWT.NONE);
		l1.setText("Certificate Values");		
		
		Label l2 = new Label(parent, SWT.NONE);
		l2.setText("Signature Value");		

		return l2;
	}
}
