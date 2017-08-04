package com.altimetrik.swaggerapi.api.service;

import com.altimetrik.swaggerapi.models.Fieldsets;


import com.altimetrik.swaggerapi.exception.NotFoundException;
import java.util.List;

public interface FieldsetsApiService {
  
      List<Fieldsets> findAllFieldsets()
      throws NotFoundException;
  
      Fieldsets updateFieldsets(Fieldsets fieldsets)
      throws NotFoundException;
  
      Fieldsets addFieldsets(Fieldsets fieldsets)
      throws NotFoundException;
  
      Fieldsets findByIdFieldsets(Integer id)
      throws NotFoundException;
  
      void deleteFieldsets(Integer id)
      throws NotFoundException;
  
}

