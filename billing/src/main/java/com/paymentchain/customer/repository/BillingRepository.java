/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.paymentchain.customer.repository;

import com.paymentchain.customer.entities.Billing;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author EfrénDoralSilva
 */
public interface BillingRepository extends CrudRepository<Billing, Long> {
    
}
