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
public class TGSRequest extends Mensagem implements Serializable{
    
    public String clientID;
    public String serviceID;
    public Date timestamp;
    public String randomNumber;

    public TGSRequest(String clientID, String serviceID, Date timestamp, String randomNumber) {
        this.clientID = clientID;
        this.serviceID = serviceID;
        this.timestamp = timestamp;
        this.randomNumber = randomNumber;
    }
    
    @Override
    public void print(){
        System.out.println("*Ticket*");
        System.out.println("ID do cliente: " + clientID);
        System.out.println("ID do serviço: " + serviceID);
        System.out.println("Timestamp: " + timestamp.toString());
        System.out.println("Número aleatório: " + randomNumber);
    }
    
}
