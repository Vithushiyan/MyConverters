package mass.converter.service;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import converter.displayer.service.ConverterWindow;


public class MassConverterActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Length Converter Service Started !!!");
		MassConverterService converterService = new MassConverterServiceImpl();
		publishServiceRegistration = bundleContext.registerService(MassConverterService.class.getName(), converterService,null);
		ConverterWindow.convertersListBox.addItem("  Mass");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Mass Converter Service Stoped !!!");
		publishServiceRegistration.unregister();
		ConverterWindow.convertersListBox.removeItem("  Mass");
	}
}
