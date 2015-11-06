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
public class ASRequest implements Serializable{
    
    public String clientID;
    public String serviceID;
    public Date timeStamp;
    public String randomNumber;
    
    public ClientRequest clientRequest;

    public ASRequest(String clientID, String serviceID, Date timeStamp, String randomNumber) {
        this.clientID = clientID;
        clientRequest = new ClientRequest(serviceID, timeStamp, randomNumber);
    }
    
    public void print(){
        System.out.println("AS Request");
        System.out.println("ID do cliente: " + clientID);
        clientRequest.print();
    }
}
