/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.library.tcp;

import java.util.Date;

/**
 *
 * @author Lagoni
 */
public class TcpBaseMessage {

    private Date recievedDate = new Date();

    /**
     * @return the recievedDate
     */
    public Date getRecievedDate() {
        return recievedDate;
    }

    /**
     * @param recievedDate the recievedDate to set
     */
    public void setRecievedDate(Date recievedDate) {
        this.recievedDate = recievedDate;
    }
}
