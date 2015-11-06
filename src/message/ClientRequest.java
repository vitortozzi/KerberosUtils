/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

/**
 *
 * @author Vitor Tozzi
 */
public class ClientRequest extends Mensagem{

    public String serviceID;
    public String timestamp;
    public String randomNumber;

    public ClientRequest(String serviceID, String timestamp, String randomNumber) {
        this.serviceID = serviceID;
        this.timestamp = timestamp;
        this.randomNumber = randomNumber;
    }

    public void print(){
        System.out.println("Client Request");
        System.out.println("ID do serviço: " + serviceID);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Número aleatório: " + randomNumber);
    }
}
