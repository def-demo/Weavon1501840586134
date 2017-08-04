package com.altimetrik.swaggerapi.models;

import com.altimetrik.swaggerapi.models.Revinfo;
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

public class FieldsetsAud  {
  
  
   
   
  
  private Integer id = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "rev", insertable=false, updatable=false) 
  
  private Revinfo revinfo = null;
  
   
   
  
  private Integer revtype = null;
  
   
   
  
  private String api = null;
  
   
   
  
  private Date createdDate = null;
  
   
   
  
  private String field = null;
  
   
   
  
  private Date modifiedDate = null;
  
   
   
  
  private String swagger = null;
  
   
   
  
  private Integer version = null;

  
  /**
   * {}
   **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {"foreignKeyColumn":"rev","relation":"OneToOne"}
   **/
  public Revinfo getRevinfo() {
    return revinfo;
  }
  public void setRevinfo(Revinfo revinfo) {
    this.revinfo = revinfo;
  }

  
  /**
   * {}
   **/
  public Integer getRevtype() {
    return revtype;
  }
  public void setRevtype(Integer revtype) {
    this.revtype = revtype;
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
    FieldsetsAud fieldsetsAud = (FieldsetsAud) o;
    return Objects.equals(id, fieldsetsAud.id) &&
        Objects.equals(revinfo, fieldsetsAud.revinfo) &&
        Objects.equals(revtype, fieldsetsAud.revtype) &&
        Objects.equals(api, fieldsetsAud.api) &&
        Objects.equals(createdDate, fieldsetsAud.createdDate) &&
        Objects.equals(field, fieldsetsAud.field) &&
        Objects.equals(modifiedDate, fieldsetsAud.modifiedDate) &&
        Objects.equals(swagger, fieldsetsAud.swagger) &&
        Objects.equals(version, fieldsetsAud.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, revinfo, revtype, api, createdDate, field, modifiedDate, swagger, version);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsetsAud {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  revinfo: ").append(revinfo).append("\n");
    sb.append("  revtype: ").append(revtype).append("\n");
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

