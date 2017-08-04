package com.altimetrik.swaggerapi.models;

import java.util.Date;

import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class Fieldsets  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String api = null;
  
   
   
  
  private Date createdDate = null;
  
   
   
  
  private String field = null;
  
   
   
  
  private Date modifiedDate = null;
  
   
   
  
  private String swagger = null;
  
   
   
  
  private Integer version = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getApi() {
    return api;
  }
  public void setApi(String api) {
    this.api = api;
  }

  
  /**
   * {}
   **/
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * {}
   **/
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  
  /**
   * {}
   **/
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   * {}
   **/
  public String getSwagger() {
    return swagger;
  }
  public void setSwagger(String swagger) {
    this.swagger = swagger;
  }

  
  /**
   * {}
   **/
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fieldsets fieldsets = (Fieldsets) o;
    return Objects.equals(id, fieldsets.id) &&
        Objects.equals(api, fieldsets.api) &&
        Objects.equals(createdDate, fieldsets.createdDate) &&
        Objects.equals(field, fieldsets.field) &&
        Objects.equals(modifiedDate, fieldsets.modifiedDate) &&
        Objects.equals(swagger, fieldsets.swagger) &&
        Objects.equals(version, fieldsets.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, api, createdDate, field, modifiedDate, swagger, version);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fieldsets {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  api: ").append(api).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  field: ").append(field).append("\n");
    sb.append("  modifiedDate: ").append(modifiedDate).append("\n");
    sb.append("  swagger: ").append(swagger).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

