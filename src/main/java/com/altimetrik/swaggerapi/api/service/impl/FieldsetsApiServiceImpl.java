package com.altimetrik.swaggerapi.api.service.impl;

import com.altimetrik.swaggerapi.api.service.*;
import com.altimetrik.swaggerapi.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.swaggerapi.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.swaggerapi.models.Fieldsets;


import java.util.List;
import com.altimetrik.swaggerapi.exception.NotFoundException;


@Service
@Transactional
public class FieldsetsApiServiceImpl implements FieldsetsApiService {
		  	  
	  @Autowired
	
  	  private FieldsetsRepository  fieldsetsRepository ;
	   
  
  
				
			
      @Override
      public List<Fieldsets> findAllFieldsets()
      throws NotFoundException {
      
        
  		
  		
  			return fieldsetsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Fieldsets updateFieldsets(Fieldsets fieldsets)
      throws NotFoundException {
      
         
        	return fieldsetsRepository.save(fieldsets);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Fieldsets addFieldsets(Fieldsets fieldsets)
      throws NotFoundException {
      
         
        	return fieldsetsRepository.save(fieldsets);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Fieldsets findByIdFieldsets(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return fieldsetsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteFieldsets(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

