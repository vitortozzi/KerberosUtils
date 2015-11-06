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
public class ASRequest implements Serializable{
    
    public String clientID;
    public String serviceID;
    public String timeStamp;
    public String randomNumber;
    
    ClientRequest clientRequest;

    public ASRequest(String clientID, String serviceID, String timeStamp, String randomNumber) {
        this.clientID = clientID;
        clientRequest = new ClientRequest(serviceID, timeStamp, randomNumber);
    }
    
    public void print(){
        System.out.println("AS Request");
        System.out.println("ID do cliente: " + clientID);
        clientRequest.print();
    }
}
