/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.BorrowingDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.BorrowingService;

/**
 *
 * @author Admin
 */
public class BorrowingController{
    
     private BorrowingService borrowingService= (BorrowingService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BORROWING);
       public String placeBorrowing (BorrowingDto borrowingDto) throws Exception  {
    return borrowingService.placeBorrowing(borrowingDto);
    }
}
        
