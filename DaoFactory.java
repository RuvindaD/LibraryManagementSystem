/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;


import edu.ijse.layered.dao.custom.impl.BookCategoriesDaoImpl;
import edu.ijse.layered.dao.custom.impl.BooksDaoImpl;
import edu.ijse.layered.dao.custom.impl.BorrowingDaoImpl;
import edu.ijse.layered.dao.custom.impl.BorrowingDetailDaoImpl;
import edu.ijse.layered.dao.custom.impl.MembersDaoImpl;
import edu.ijse.layered.dao.custom.impl.TransactionsDaoImpl;




/**
 *
 * @author Admin
 */
public class DaoFactory {
     
        private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory== null){
            daoFactory= new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case  BOOKCATEGORIES:
                return new BookCategoriesDaoImpl();
                
                case  BOOKS:
                return new BooksDaoImpl();
                
                case MEMBERS:
                    return new MembersDaoImpl();
                
                case TRANSACTIONS:
                    return new TransactionsDaoImpl();
                    
                  case BORROWING:
                return new BorrowingDaoImpl();
                
            case BORROWING_DETAIL:
                return new BorrowingDetailDaoImpl();
                
           
      
            default:
         
                return null;      
               
                
        }
    
}
    
 public enum DaoTypes{
        BOOKCATEGORIES, BOOKS,MEMBERS,TRANSACTIONS,BORROWING,BORROWING_DETAIL;
        
          
    }
}
