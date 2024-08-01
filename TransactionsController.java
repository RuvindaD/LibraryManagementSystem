/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.TransactionsDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.TransactionsService;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TransactionsController {
     private final TransactionsService transactionsService= (TransactionsService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.TRANSACTIONS);
    public String save(TransactionsDto transactionsDto) throws Exception{
    return transactionsService.save(transactionsDto);
    }
    
     public String update(TransactionsDto transactionsDto) throws Exception{
     return transactionsService.update(transactionsDto);
    }
     
     public String delete(String TransactionsID) throws Exception{
        return transactionsService.delete(TransactionsID);
    }
     
     public ArrayList<TransactionsDto> getAll() throws Exception{
     return transactionsService.getAll();    
      }
      
     public TransactionsDto get(String TransactionsID)throws Exception{
      return transactionsService.get(TransactionsID); 
      }
    
}

