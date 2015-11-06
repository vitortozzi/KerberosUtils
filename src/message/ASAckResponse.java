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
public class ASAckResponse implements Serializable{
    
    public String sessionKey;
    public String randomNumber;
    public Date timestamp;
    public String serviceID;

    public ASAckResponse(String sessionKey, String randomNumber, Date timestamp, String serviceID) {
        this.sessionKey = sessionKey;
        this.randomNumber = randomNumber;
        this.timestamp = timestamp;
        this.serviceID = serviceID;
    }
    
    public void print(){
        System.out.println("*AS ACK Response*");
        System.out.println("Chave de sessão: " + sessionKey);
        System.out.println("Número aleatório: " + randomNumber);
        System.out.println("ID do serviço: " + serviceID);
        System.out.println("Timestamp: " + timestamp.toString());
    }
    
    
    
}
