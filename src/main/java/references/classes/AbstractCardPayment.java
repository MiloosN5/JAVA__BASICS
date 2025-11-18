/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package references.classes;

import references.interfaces.SecurePayment;

/**
 *
 * @author PC
 */
public abstract class AbstractCardPayment implements SecurePayment {
    private String cardNumber;
    private String owner;
    
    // Constructor
    public AbstractCardPayment(String cardNumber, String owner) {
        this.cardNumber = cardNumber;
        this.owner = owner;
    }
    
    // Encapsulation
    public String getCardNumber() { return cardNumber; }
    public String getOwner() { return owner; }
    
    // Run-time polymorphism (method overriding)
    @Override
    public void authenticate(String token) {
        System.out.println("Authentication successful for token: " + token);
    }
}
