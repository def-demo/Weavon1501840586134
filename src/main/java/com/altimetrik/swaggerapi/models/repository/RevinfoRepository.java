package com.altimetrik.swaggerapi.models.repository;

import com.altimetrik.swaggerapi.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface RevinfoRepository extends JpaRepository<Revinfo, Integer>{

}



