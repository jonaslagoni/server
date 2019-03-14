/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.library.exceptions;

/**
 *
 * @author Lagoni
 */
public class DependencyException extends Exception {

    public DependencyException(String errorMessage) {
        super(errorMessage);
    }
}
