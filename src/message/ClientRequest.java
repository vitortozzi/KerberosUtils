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
public class ClientRequest extends Mensagem implements Serializable{

    public String serviceID;
    public Date timestamp;
    public String randomNumber;

    public ClientRequest(String serviceID, Date timestamp, String randomNumber) {
        this.serviceID = serviceID;
        this.timestamp = timestamp;
        this.randomNumber = randomNumber;
    }

    @Override
    public void print(){
        System.out.println("Client Request");
        System.out.println("ID do serviço: " + serviceID);
        System.out.println("Timestamp: " + timestamp.toString());
        System.out.println("Número aleatório: " + randomNumber);
    }
}
