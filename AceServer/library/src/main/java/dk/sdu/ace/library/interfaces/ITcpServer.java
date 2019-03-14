/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.library.interfaces;

/**
 *
 * @author Lagoni
 */
public interface ITcpServer {
    public boolean startServer(int port);
    public boolean stopServer();
}
