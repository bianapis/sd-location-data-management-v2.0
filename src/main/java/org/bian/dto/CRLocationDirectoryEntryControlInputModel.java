package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryControlInputModelLocationDirectoryEntryControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryControlInputModel
 */
public class CRLocationDirectoryEntryControlInputModel   {
  private String locationDataManagementServicingSessionReference = null;

  private String locationDirectoryEntryInstanceReference = null;

  private Object locationDirectoryEntryControlActionTaskRecord = null;

  private CRLocationDirectoryEntryControlInputModelLocationDirectoryEntryControlActionRequest locationDirectoryEntryControlActionRequest = null;


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
   * Get locationDirectoryEntryControlActionRequest
   * @return locationDirectoryEntryControlActionRequest
  **/

  public CRLocationDirectoryEntryControlInputModelLocationDirectoryEntryControlActionRequest getLocationDirectoryEntryControlActionRequest() {
    return locationDirectoryEntryControlActionRequest;
  }

  public void setLocationDirectoryEntryControlActionRequest(CRLocationDirectoryEntryControlInputModelLocationDirectoryEntryControlActionRequest locationDirectoryEntryControlActionRequest) {
    this.locationDirectoryEntryControlActionRequest = locationDirectoryEntryControlActionRequest;
  }


}

