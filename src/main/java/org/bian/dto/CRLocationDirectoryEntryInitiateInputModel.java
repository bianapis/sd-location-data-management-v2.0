package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryInitiateInputModel
 */
public class CRLocationDirectoryEntryInitiateInputModel   {
  private String locationDataManagementServicingSessionReference = null;

  private Object locationDirectoryEntryInitiateActionRecord = null;

  private String locationDirectoryEntryInstanceStatus = null;

  private CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return locationDataManagementServicingSessionReference
  **/

  public String getLocationDataManagementServicingSessionReference() {
    return locationDataManagementServicingSessionReference;
  }

  public void setLocationDataManagementServicingSessionReference(String locationDataManagementServicingSessionReference) {
    this.locationDataManagementServicingSessionReference = locationDataManagementServicingSessionReference;
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

  public CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecord getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
  }


}

