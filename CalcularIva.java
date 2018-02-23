/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

//Revisar que se actualice en git


import java.awt.print.Book;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author johnv
 */
@Stateless
@WebService
@LocalBean
        
public class CalcularIva{
    
   @WebMethod(operationName = "Caliva")
    public double CalcularIva(@WebParam(name = "base")double base){
        
      
      double iva = (0.19)*base;
      double Total = iva + base;
       return Total;
        
        }

    
    
}
    
    

