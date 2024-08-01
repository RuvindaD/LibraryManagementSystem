/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.MembersDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.MembersService;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MembersController {
    
    private final MembersService membersService= (MembersService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBERS);
    public String save(MembersDto membersDto) throws Exception{
     return membersService.save(membersDto);
    }
    
     public String update(MembersDto membersDto) throws Exception{
     return membersService.update(membersDto);
    }
     
     public String delete(String MemberID) throws Exception{
      return membersService.delete(MemberID);
    }
     
     public ArrayList<MembersDto> getAll() throws Exception{
    return membersService.getAll();    
      }
      
     public MembersDto get(String MemberID)throws Exception{
     return membersService.get(MemberID);   
      }
    
}

