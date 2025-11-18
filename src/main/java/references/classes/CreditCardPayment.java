/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package references.classes;

/**
 *
 * @author PC
 */
public class CreditCardPayment extends AbstractCardPayment {
    // Constructor
    public CreditCardPayment(String number, String owner) {
        super(number, owner);
    }

    // Run-time polymorphism (method overriding)
    @Override
    public void pay(double amount) {
        System.out.println(
            "Paying $" + amount +
            " using card " + getCardNumber() +
            " owned by " + getOwner()
        );
    }
    
    // Compile-time polymorphism (method overloading)
    public void pay(double amount, String currency) {
        System.out.println(
            "Paying " + amount + " " + currency +
            " using card " + getCardNumber()
        );
    }
    
    public void pay(double amount, boolean saveReceipt) {
        System.out.println(
            "Paying $" + amount +
            " using card " + getCardNumber() +
            (saveReceipt ? " [receipt saved]" : "")
        );
    }    
    

}
