/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.tcp.server;

import dk.sdu.ace.library.interfaces.ITcpEventObserverController;
import dk.sdu.ace.library.interfaces.ITcpServer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lagoni
 */
public class TcpServer implements ITcpServer, Runnable {

    private ITcpEventObserverController controller; //OSGI

    @Override
    public boolean startServer(int port) {
        return false;
    }

    @Override
    public boolean stopServer() {
        return false;
    }

    @Override
    public void run() {
        Logger.getLogger(TcpServer.class.getName()).log(Level.SEVERE, "Thread running");
    }

    public void setEventObserverController(ITcpEventObserverController controller) {
        Logger.getLogger(TcpServer.class.getName()).log(Level.WARNING, "ITcpEventObserverController sat");
        this.controller = controller;
    }

    public void removeEventObserverController() {
        Logger.getLogger(TcpServer.class.getName()).log(Level.SEVERE, "EventObserverController removed, shutting down all clients");
        this.controller = null;
    }
}
