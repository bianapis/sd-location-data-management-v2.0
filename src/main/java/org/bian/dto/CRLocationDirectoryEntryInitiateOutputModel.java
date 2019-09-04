package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryInitiateOutputModel
 */
public class CRLocationDirectoryEntryInitiateOutputModel   {
  private String locationDirectoryEntryInstanceReference = null;

  private String locationDirectoryEntryInitiateActionReference = null;

  private Object locationDirectoryEntryInitiateActionRecord = null;

  private String locationDirectoryEntryInstanceStatus = null;

  private CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Location Directory Entry instance 
   * @return locationDirectoryEntryInstanceReference
  **/

  public String getLocationDirectoryEntryInstanceReference() {
    return locationDirectoryEntryInstanceReference;
  }

  public void setLocationDirectoryEntryInstanceReference(String locationDirectoryEntryInstanceReference) {
    this.locationDirectoryEntryInstanceReference = locationDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return locationDirectoryEntryInitiateActionReference
  **/

  public String getLocationDirectoryEntryInitiateActionReference() {
    return locationDirectoryEntryInitiateActionReference;
  }

  public void setLocationDirectoryEntryInitiateActionReference(String locationDirectoryEntryInitiateActionReference) {
    this.locationDirectoryEntryInitiateActionReference = locationDirectoryEntryInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return locationDirectoryEntryInitiateActionRecord
  **/

  public Object getLocationDirectoryEntryInitiateActionRecord() {
    return locationDirectoryEntryInitiateActionRecord;
  }

  public void setLocationDirectoryEntryInitiateActionRecord(Object locationDirectoryEntryInitiateActionRecord) {
    this.locationDirectoryEntryInitiateActionRecord = locationDirectoryEntryInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Location Directory Entry instance (e.g. initialised, pending, active) 
   * @return locationDirectoryEntryInstanceStatus
  **/

  public String getLocationDirectoryEntryInstanceStatus() {
    return locationDirectoryEntryInstanceStatus;
  }

  public void setLocationDirectoryEntryInstanceStatus(String locationDirectoryEntryInstanceStatus) {
    this.locationDirectoryEntryInstanceStatus = locationDirectoryEntryInstanceStatus;
  }


  /**
   * Get locationDirectoryEntryInstanceRecord
   * @return locationDirectoryEntryInstanceRecord
  **/

  public CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
  }


}

