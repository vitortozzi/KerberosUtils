/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;

/**
 *
 * @author Vitor Tozzi
 */
public class ASTicket implements Serializable{
    
    public String clientID;
    public String ticketTimeStamp;
    public String sessionKey;

    public ASTicket(String clientID, String ticketTimeStamp, String sessionKey) {
        this.clientID = clientID;
        this.ticketTimeStamp = ticketTimeStamp;
        this.sessionKey = sessionKey;
    }
    
    public void print(){
        System.out.println("*AS Ticket*");
        System.out.println("ID do cliente: " + clientID);
        System.out.println("Ticket timestamp: " + ticketTimeStamp);
        System.out.println("Chave de sessão: " + sessionKey);
    }
    
}
