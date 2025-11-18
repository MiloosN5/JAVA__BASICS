/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessons;

import references.classes.CreditCardPayment;
import references.classes.PayPal;

/**
 *
 * @author PC
 */
public class OOP {

    public static void run() {
        // instantiation (creating new object(s))
        CreditCardPayment card1 = new CreditCardPayment("111-999-443", "James");
        card1.pay(20); // Paying $20.0 using card 111-999-443 owned by James
        card1.pay(30, "EUR"); // Paying 30.0 EUR using card 111-999-443
        card1.pay(30, true); // Paying $30.0 using card 111-999-443 [receipt saved]
    
        PayPal card2 = new PayPal("user@example.com");
        card2.pay(30); // PayPal payment of $30.0 by user@example.com
    
        /** ABSTRACTION
         *
         * 1. INTERFACE
         * 
         * public interface PaymentMethod {  ... }
         * 
         * 2. ABSTRACT CLASS
         * 
         * public abstract class AbstractCardPayment implements SecurePayment { ... }
         */
         
        /** POLYMORPHISM
         * 
         * 1. run-time (overriding)
         * 
         * @Override
         *  public void pay(double amount) { ... }
         *
         * 2. compile-time (overloading)
         * 
         * public void pay(double amount) { ... }
         * public void pay(double amount, String currency) { ... }
         */
        
        /** ENCAPSULATION 
         * 
         * private String cardNumber;
         * private String owner;
         * 
         * public String getCardNumber() { return cardNumber; }
         * public String getOwner() { return owner; }
         */
        
        /** INHERITANCE
         * 
         * public class CreditCardPayment extends AbstractCardPayment { ... }
         * 
         */        

    }
}
