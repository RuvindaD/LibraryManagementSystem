/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.BookCategoriesDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.BookCategoriesService;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BookCategoriesController {
    
    private final BookCategoriesService bookcategoriesService= (BookCategoriesService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOKCATEGORIES);
    public String save(BookCategoriesDto bookcategoriesDto) throws Exception{
      return bookcategoriesService.save(bookcategoriesDto);
    }
    
     public String update(BookCategoriesDto bookcategoriesDto) throws Exception{
      return bookcategoriesService.update(bookcategoriesDto);
    }
     
     public String delete(String CategoryID) throws Exception{
      return bookcategoriesService.delete(CategoryID);   
    }
     
     public ArrayList<BookCategoriesDto> getAll() throws Exception{
      return bookcategoriesService.getAll();  
      }
      
     public BookCategoriesDto get(String CategoryID)throws Exception{
      return bookcategoriesService.get(CategoryID);    
      }
    
}
