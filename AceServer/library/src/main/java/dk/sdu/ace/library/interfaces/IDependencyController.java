/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.library.interfaces;

import dk.sdu.ace.library.exceptions.DependencyException;

/**
 *
 * @author Lagoni
 */
public interface IDependencyController {

    public void injectDependency(String bundle) throws DependencyException;
}
