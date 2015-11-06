/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import message.ASResponse;
import message.Mensagem;

/**
 *
 * @author Vitor Tozzi
 */
public class FileUtils {

    // Password must be at least 8 characters
//    private static final String password = "zukowski";
    
    Cipher desCipher;
    SecretKey secretKey;

    public FileUtils(String password) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException {
        // Create Key
        byte[] key = password.getBytes();
        DESKeySpec desKeySpec = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        secretKey = keyFactory.generateSecret(desKeySpec);
        desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
    }

    public Object readEncryptedObject(String filepath) throws FileNotFoundException, IOException, ClassNotFoundException, InvalidKeyException {
        
        desCipher.init(Cipher.DECRYPT_MODE, secretKey);
        
        FileInputStream fis = new FileInputStream(filepath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        CipherInputStream cis = new CipherInputStream(bis, desCipher);
        ObjectInputStream ois = new ObjectInputStream(cis);

        // Read objects
        Object object = (Mensagem) ois.readObject();
        ois.close(); 
        
        return object;
    }
    
    public void writeEncryptedObject(Object object, String filepath) throws FileNotFoundException, IOException, InvalidKeyException{
        
        desCipher.init(Cipher.ENCRYPT_MODE, secretKey);
        
        FileOutputStream fos = new FileOutputStream(filepath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        CipherOutputStream cos = new CipherOutputStream(bos, desCipher);
        ObjectOutputStream oos = new ObjectOutputStream(cos);
        
        oos.writeObject(object);
        oos.flush();
        oos.close();
        
    } 
    
    

}
