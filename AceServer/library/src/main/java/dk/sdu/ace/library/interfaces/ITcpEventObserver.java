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
public interface ITcpEventObserver {

    public void eventOccured(TcpRecieveTypes type, TcpBaseMessage baseMessage);

}
