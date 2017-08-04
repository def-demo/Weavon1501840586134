package com.altimetrik.swaggerapi.api;

import com.altimetrik.swaggerapi.models.*;

import com.altimetrik.swaggerapi.api.service.FieldsetsApiService;

import com.altimetrik.swaggerapi.exception.NotFoundException;

import com.altimetrik.swaggerapi.models.Fieldsets;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class FieldsetsApi {

   @Autowired
   private FieldsetsApiService service;
  

  @RequestMapping(value = "/fieldsets", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Fieldsets>> findAllFieldsets()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Fieldsets>>(service.findAllFieldsets(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/fieldsets", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Fieldsets> updateFieldsets(@RequestBody Fieldsets fieldsets
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Fieldsets>(service.updateFieldsets(fieldsets), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/fieldsets", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Fieldsets> addFieldsets(@RequestBody Fieldsets fieldsets
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Fieldsets>(service.addFieldsets(fieldsets), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/fieldsets/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Fieldsets> findByIdFieldsets(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Fieldsets>(service.findByIdFieldsets(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/fieldsets/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteFieldsets(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteFieldsets(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

