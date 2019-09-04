package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQLocationExchangeInputModel
 */
public class BQLocationExchangeInputModel   {
  private String locationDirectoryEntryInstanceReference = null;

  private String locationInstanceReference = null;

  private Object locationExchangeActionTaskRecord = null;

  private CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest locationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Location Directory Entry instance 
   * @return locationDirectoryEntryInstanceReference
  **/

  public String getLocationDirectoryEntryInstanceReference() {
    return locationDirectoryEntryInstanceReference;
  }

  public void setLocationDirectoryEntryInstanceReference(String locationDirectoryEntryInstanceReference) {
    this.locationDirectoryEntryInstanceReference = locationDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Location instance 
   * @return locationInstanceReference
  **/

  public String getLocationInstanceReference() {
    return locationInstanceReference;
  }

  public void setLocationInstanceReference(String locationInstanceReference) {
    this.locationInstanceReference = locationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return locationExchangeActionTaskRecord
  **/

  public Object getLocationExchangeActionTaskRecord() {
    return locationExchangeActionTaskRecord;
  }

  public void setLocationExchangeActionTaskRecord(Object locationExchangeActionTaskRecord) {
    this.locationExchangeActionTaskRecord = locationExchangeActionTaskRecord;
  }


  /**
   * Get locationExchangeActionRequest
   * @return locationExchangeActionRequest
  **/

  public CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest getLocationExchangeActionRequest() {
    return locationExchangeActionRequest;
  }

  public void setLocationExchangeActionRequest(CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest locationExchangeActionRequest) {
    this.locationExchangeActionRequest = locationExchangeActionRequest;
  }


}

