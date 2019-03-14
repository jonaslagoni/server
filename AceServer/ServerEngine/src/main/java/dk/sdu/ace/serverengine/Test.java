/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.serverengine;

import dk.sdu.ace.library.exceptions.DependencyException;
import dk.sdu.ace.library.interfaces.IDependencyController;
import dk.sdu.ace.library.interfaces.IGameWorld;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lagoni
 */
public class Test {

    public void setGameWorld(IGameWorld gameworld) {
        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, "IGameWorld sat");
    }

    public void removeGameWorld() {
        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, "IGameWorld removed");
    }

    public void setDependencyController(IDependencyController dpController) {
        try {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, "IDependencyController sat");
            dpController.injectDependency("test");
        } catch (DependencyException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeDependencyController() {
        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, "IDependencyController removed");
    }

    public Test() {
        System.out.println("Should start all core modules here");
    }

}
