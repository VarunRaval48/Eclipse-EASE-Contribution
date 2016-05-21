package com.varun.decorator.main;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;; 


/*
 * class that overlays image on icons
 * 
 */
public class DecoratorClass implements ILightweightLabelDecorator{

	//creating image
	private final ImageDescriptor OVERLAY1 = 
			ImageDescriptor.createFromFile(this.getClass(), "valid_cert.jpeg");
	private final ImageDescriptor OVERLAY2 = 
			ImageDescriptor.createFromFile(this.getClass(), "invalid_cert.jpeg");
	
	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		// TODO Auto-generated method stub
		
//		LabelProviderChangedEvent l = new LabelProviderChangedEvent()
		
		IFile ifile = (IFile)element;
		// To make sure we are dealing with adaptable objects
		//		IFile ifile = (IFile)Platform.getAdapterManager().getAdapter(element, IFile.class);

		System.out.println("-------In-decorate--------");
		
		//Place conditions here on what to put decorators
		if(ifile.getFileExtension().equals("js")){
			decoration.addOverlay(OVERLAY1);
		}
		else if(ifile.getFileExtension().equals("java")){
			decoration.addOverlay(OVERLAY2);
		}
	}

}
