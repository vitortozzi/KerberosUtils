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
public class ASAckResponse implements Serializable{
    
    public String sessionKey;
    public String randomNumber;

    public ASAckResponse(String sessionKey, String randomNumber) {
        this.sessionKey = sessionKey;
        this.randomNumber = randomNumber;
    }
    
    public void print(){
        System.out.println("AS ACK Response");
        System.out.println("Chave de sessão: " + sessionKey);
        System.out.println("Número aleatório: " + randomNumber);
    }
    
    
    
}
