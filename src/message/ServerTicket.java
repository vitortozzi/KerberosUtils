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
public class ServerTicket extends Mensagem implements Serializable{
    
    public String clientID;
    public Date timestamp;
    public String serviceID;
    public String sessionKey;

    public ServerTicket(String clientID, Date timestamp, String serviceID, String sessionKey) {
        this.clientID = clientID;
        this.timestamp = timestamp;
        this.serviceID = serviceID;
        this.sessionKey = sessionKey;
    }
    
    @Override
    public void print(){
        System.out.println("*Server Ticket*");
        System.out.println("ID do cliente: " + clientID);
        System.out.println("ID do serviço: " + serviceID);
        System.out.println("Timestamp: " + timestamp.toString());
        System.out.println("Chave de sessão: " + sessionKey);
    }
    
}
