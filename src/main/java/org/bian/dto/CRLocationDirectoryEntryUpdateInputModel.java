package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryUpdateInputModel
 */
public class CRLocationDirectoryEntryUpdateInputModel   {
  private String locationDataManagementServicingSessionReference = null;

  private String locationDirectoryEntryInstanceReference = null;

  private CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private Object locationDirectoryEntryUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get locationDirectoryEntryInstanceRecord
   * @return locationDirectoryEntryInstanceRecord
  **/

  public CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return locationDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getLocationDirectoryEntryUpdateActionTaskRecord() {
    return locationDirectoryEntryUpdateActionTaskRecord;
  }

  public void setLocationDirectoryEntryUpdateActionTaskRecord(Object locationDirectoryEntryUpdateActionTaskRecord) {
    this.locationDirectoryEntryUpdateActionTaskRecord = locationDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

