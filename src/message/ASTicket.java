/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Vitor Tozzi
 */
public class ASTicket extends Mensagem implements Serializable{
    
    public String clientID;
    public Date ticketTimeStamp;
    public String sessionKey;
    public String serviceID;
    public String randomNumber;

    public ASTicket(String clientID, Date ticketTimeStamp, String sessionKey, String serviceID, String randomNumber) {
        this.clientID = clientID;
        this.ticketTimeStamp = ticketTimeStamp;
        this.sessionKey = sessionKey;
        this.serviceID = serviceID;
        this.randomNumber = randomNumber;
    }
    
    @Override
    public void print(){
        System.out.println("*AS Ticket*");
        System.out.println("ID do cliente: " + clientID);
        System.out.println("Ticket timestamp: " + ticketTimeStamp);
        System.out.println("Chave de sessão: " + sessionKey);
        System.out.println("ID do serviço: " + serviceID);
        System.out.println("Número aleatorio: " + randomNumber);
    }
    
}
