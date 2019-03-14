/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.library.interfaces;

import dk.sdu.ace.library.tcp.TcpBaseMessage;
import dk.sdu.ace.library.tcp.TcpRecieveTypes;

/**
 *
 * @author Lagoni
 */
public interface ITcpEventObserverController {

    public void addListener(TcpRecieveTypes type, ITcpEventObserver observer);

    public void removeListener(TcpRecieveTypes type, ITcpEventObserver observer);

    public void callListeners(TcpRecieveTypes type, TcpBaseMessage baseMessage);
}
