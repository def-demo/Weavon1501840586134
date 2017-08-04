package com.altimetrik.swaggerapi.api;

import com.altimetrik.swaggerapi.models.*;

import com.altimetrik.swaggerapi.api.service.FieldsetsAudApiService;

import com.altimetrik.swaggerapi.exception.NotFoundException;

import com.altimetrik.swaggerapi.models.FieldsetsAud;


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

public class FieldsetsAudApi {

   @Autowired
   private FieldsetsAudApiService service;
  

  @RequestMapping(value = "/fieldsets_aud", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<FieldsetsAud>> findAllFieldsetsAud()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<FieldsetsAud>>(service.findAllFieldsetsAud(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/fieldsets_aud", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< FieldsetsAud> updateFieldsetsAud(@RequestBody FieldsetsAud fieldsetsAud
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<FieldsetsAud>(service.updateFieldsetsAud(fieldsetsAud), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/fieldsets_aud", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< FieldsetsAud> addFieldsetsAud(@RequestBody FieldsetsAud fieldsetsAud
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<FieldsetsAud>(service.addFieldsetsAud(fieldsetsAud), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/fieldsets_aud/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< FieldsetsAud> findByIdFieldsetsAud(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<FieldsetsAud>(service.findByIdFieldsetsAud(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/fieldsets_aud/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteFieldsetsAud(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteFieldsetsAud(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

