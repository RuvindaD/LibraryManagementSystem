/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.BooksDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.BooksService;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BooksController {
    
    private final BooksService booksService= (BooksService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOKS);
    public String save(BooksDto booksDto) throws Exception{
      return booksService.save(booksDto);
    }
    
     public String update(BooksDto booksDto) throws Exception{
      return booksService.update(booksDto);
    }
     
     public String delete(String BookID) throws Exception{
      return booksService.delete(BookID); 
    }
     
     public ArrayList<BooksDto> getAll() throws Exception{
     return booksService.getAll();    
      }
      
     public BooksDto get(String BookID)throws Exception{
      return booksService.get(BookID);    
      }
    
}
