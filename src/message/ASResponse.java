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
public class ASResponse implements Serializable{
    
    public ASAckResponse aSAckResponse;
    public ASTicket aSTicket;

    public ASResponse(ASAckResponse aSAckResponse, ASTicket aSTicket) {
        this.aSAckResponse = aSAckResponse;
        this.aSTicket = aSTicket;
    }
 
    /**
     *
     */
    public void print(){
        System.out.println("AS Responde");
        aSAckResponse.print();
        aSTicket.print();
    }
    
}
