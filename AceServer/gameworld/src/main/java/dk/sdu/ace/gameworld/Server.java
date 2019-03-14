/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.gameworld;

import dk.sdu.ace.library.interfaces.IGameWorld;
import dk.sdu.ace.library.interfaces.ITcpEventObserverController;
import dk.sdu.ace.library.interfaces.ITcpServer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lagoni
 */
public class Server implements IGameWorld {

    private ITcpEventObserverController controller;
    private ITcpServer tcpServer;

    public void setEventObserverController(ITcpEventObserverController controller) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, "ITcpEventObserverController sat");
        this.controller = controller;
    }

    public void removeEventObserverController() {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, "EventObserverController removed");
        this.controller = null;
    }

    public void setTcpServer(ITcpServer tcpServer) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, "ITcpServer sat");
        this.tcpServer = tcpServer;
    }

    public void removeTcpServer() {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, "TcpServer removed");
        this.tcpServer = null;
    }

    public Server() {
        System.out.println("Started");
    }
}
