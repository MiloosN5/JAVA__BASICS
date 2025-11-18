/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package references.interfaces;

/**
 *
 * @author PC
 */
public interface SecurePayment extends PaymentMethod {
    // Abstract method
    void authenticate(String token);
}
