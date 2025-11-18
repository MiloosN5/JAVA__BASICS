/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package references.classes;

import references.interfaces.PaymentMethod;

/**
 *
 * @author PC
 */
public class PayPal implements PaymentMethod {
    private String email;
    
    // Constructor
    public PayPal(String email) {
        this.email = email;
    }

    // Run-time polymorphism (method overriding)
    @Override
    public void pay(double amount) {
        System.out.println("PayPal payment of $" + amount + " by " + email);
    }
    
}
