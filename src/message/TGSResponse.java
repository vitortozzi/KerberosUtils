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
public class TGSResponse extends Mensagem implements Serializable{
    
    public String sessionKey;
    public String randomNumber;

    public TGSResponse(String sessionKey, String randomNumber) {
        this.sessionKey = sessionKey;
        this.randomNumber = randomNumber;
    }
    
    public void print(){
        System.out.println("*TGS Response*");
        System.out.println("Chave de sessão: " + sessionKey);
        System.out.println("Número aleatório: " + randomNumber);
    }
    
}
