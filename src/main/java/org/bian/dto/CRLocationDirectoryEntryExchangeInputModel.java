package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryExchangeInputModel
 */
public class CRLocationDirectoryEntryExchangeInputModel   {
  private String locationDataManagementServicingSessionReference = null;

  private String locationDirectoryEntryInstanceReference = null;

  private Object locationDirectoryEntryExchangeActionTaskRecord = null;

  private CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest locationDirectoryEntryExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return locationDirectoryEntryExchangeActionTaskRecord
  **/

  public Object getLocationDirectoryEntryExchangeActionTaskRecord() {
    return locationDirectoryEntryExchangeActionTaskRecord;
  }

  public void setLocationDirectoryEntryExchangeActionTaskRecord(Object locationDirectoryEntryExchangeActionTaskRecord) {
    this.locationDirectoryEntryExchangeActionTaskRecord = locationDirectoryEntryExchangeActionTaskRecord;
  }


  /**
   * Get locationDirectoryEntryExchangeActionRequest
   * @return locationDirectoryEntryExchangeActionRequest
  **/

  public CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest getLocationDirectoryEntryExchangeActionRequest() {
    return locationDirectoryEntryExchangeActionRequest;
  }

  public void setLocationDirectoryEntryExchangeActionRequest(CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest locationDirectoryEntryExchangeActionRequest) {
    this.locationDirectoryEntryExchangeActionRequest = locationDirectoryEntryExchangeActionRequest;
  }


}

