/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.tcp.event;

import dk.sdu.ace.library.tcp.TcpRecieveTypes;
import dk.sdu.ace.library.interfaces.ITcpEventObserverController;
import dk.sdu.ace.library.interfaces.ITcpEventObserver;
import dk.sdu.ace.library.tcp.TcpBaseMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lagoni
 */
public class TcpEventHandler implements ITcpEventObserverController {

    public TcpEventHandler() {
        Logger.getLogger(TcpEventHandler.class.getName()).log(Level.INFO, "Initializing all listen types.");
    }

    @Override
    public void removeListener(TcpRecieveTypes type, ITcpEventObserver observer) {
    }

    @Override
    public void callListeners(TcpRecieveTypes type, TcpBaseMessage baseMessage) {
    }

    @Override
    public void addListener(TcpRecieveTypes type, ITcpEventObserver observer) {
    }
}
