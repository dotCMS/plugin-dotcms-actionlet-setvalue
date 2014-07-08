package com.dotcms.actionlet.setvalue;

import org.osgi.framework.BundleContext;


import com.dotmarketing.osgi.GenericBundleActivator;
import com.dotmarketing.util.Logger;


public class Activator extends GenericBundleActivator {





    @SuppressWarnings ("unchecked")
    public void start ( BundleContext context ) throws Exception {

        //Initializing services...
        initializeServices( context );

        Logger.info(this, "Starting SetValueActionlet");

        //Registering the test Actionlet
        registerActionlet( context, new SetValueActionlet() );
    }


    public void stop ( BundleContext context ) throws Exception {

        Logger.info(this, "Stopping SetValueActionlet");
        
        unregisterActionlets();

    }

}