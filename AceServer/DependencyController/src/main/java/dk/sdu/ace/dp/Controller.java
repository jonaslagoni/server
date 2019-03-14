/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.dp;

import dk.sdu.ace.library.exceptions.DependencyException;
import dk.sdu.ace.library.interfaces.IDependencyController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.FrameworkUtil;

/**
 *
 * @author Lagoni
 */
public class Controller implements IDependencyController {

    @Override
    public void injectDependency(String name) throws DependencyException {
        try {
            BundleContext context = FrameworkUtil.getBundle(Controller.class).getBundleContext();
            Bundle tcp = context.installBundle("file:/TcpServer/target/TcpServer-0.1.0.jar");
            Bundle world = context.installBundle("file:/gameworld/target/gameworld-0.1.0.jar");
            world.start();
            tcp.start();
        } catch (BundleException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            throw new DependencyException("Exception");
        }
    }

}
