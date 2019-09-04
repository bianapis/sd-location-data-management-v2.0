package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryExchangeOutputModel
 */
public class CRLocationDirectoryEntryExchangeOutputModel   {
  private String locationDirectoryEntryExchangeActionTaskReference = null;

  private Object locationDirectoryEntryExchangeActionTaskRecord = null;

  private String locationDirectoryEntryExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Location Directory Entry instance exchange service call 
   * @return locationDirectoryEntryExchangeActionTaskReference
  **/

  public String getLocationDirectoryEntryExchangeActionTaskReference() {
    return locationDirectoryEntryExchangeActionTaskReference;
  }

  public void setLocationDirectoryEntryExchangeActionTaskReference(String locationDirectoryEntryExchangeActionTaskReference) {
    this.locationDirectoryEntryExchangeActionTaskReference = locationDirectoryEntryExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return locationDirectoryEntryExchangeActionResponse
  **/

  public String getLocationDirectoryEntryExchangeActionResponse() {
    return locationDirectoryEntryExchangeActionResponse;
  }

  public void setLocationDirectoryEntryExchangeActionResponse(String locationDirectoryEntryExchangeActionResponse) {
    this.locationDirectoryEntryExchangeActionResponse = locationDirectoryEntryExchangeActionResponse;
  }


}

