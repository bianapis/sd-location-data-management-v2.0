package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryControlOutputModel
 */
public class CRLocationDirectoryEntryControlOutputModel   {
  private String locationDirectoryEntryControlActionTaskReference = null;

  private Object locationDirectoryEntryControlActionTaskRecord = null;

  private String locationDirectoryEntryControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Location Directory Entry instance control processing service call 
   * @return locationDirectoryEntryControlActionTaskReference
  **/

  public String getLocationDirectoryEntryControlActionTaskReference() {
    return locationDirectoryEntryControlActionTaskReference;
  }

  public void setLocationDirectoryEntryControlActionTaskReference(String locationDirectoryEntryControlActionTaskReference) {
    this.locationDirectoryEntryControlActionTaskReference = locationDirectoryEntryControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return locationDirectoryEntryControlActionTaskRecord
  **/

  public Object getLocationDirectoryEntryControlActionTaskRecord() {
    return locationDirectoryEntryControlActionTaskRecord;
  }

  public void setLocationDirectoryEntryControlActionTaskRecord(Object locationDirectoryEntryControlActionTaskRecord) {
    this.locationDirectoryEntryControlActionTaskRecord = locationDirectoryEntryControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return locationDirectoryEntryControlActionResponse
  **/

  public String getLocationDirectoryEntryControlActionResponse() {
    return locationDirectoryEntryControlActionResponse;
  }

  public void setLocationDirectoryEntryControlActionResponse(String locationDirectoryEntryControlActionResponse) {
    this.locationDirectoryEntryControlActionResponse = locationDirectoryEntryControlActionResponse;
  }


}

