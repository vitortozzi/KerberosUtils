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
public class ASRequest extends Mensagem implements Serializable{
    
    public String clientID;
    
    public ClientRequest clientRequest;

    public ASRequest(String clientID, String serviceID, Date timeStamp, String randomNumber) {
        this.clientID = clientID;
        clientRequest = new ClientRequest(serviceID, timeStamp, randomNumber);
    }
    
    @Override
    public void print(){
        System.out.println("AS Request");
        System.out.println("ID do cliente: " + clientID);
        clientRequest.print();
    }
}
