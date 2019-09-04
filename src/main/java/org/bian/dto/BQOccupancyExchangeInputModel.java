package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQOccupancyExchangeInputModel
 */
public class BQOccupancyExchangeInputModel   {
  private String locationDirectoryEntryInstanceReference = null;

  private String occupancyInstanceReference = null;

  private Object occupancyExchangeActionTaskRecord = null;

  private CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest occupancyExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Occupancy instance 
   * @return occupancyInstanceReference
  **/

  public String getOccupancyInstanceReference() {
    return occupancyInstanceReference;
  }

  public void setOccupancyInstanceReference(String occupancyInstanceReference) {
    this.occupancyInstanceReference = occupancyInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return occupancyExchangeActionTaskRecord
  **/

  public Object getOccupancyExchangeActionTaskRecord() {
    return occupancyExchangeActionTaskRecord;
  }

  public void setOccupancyExchangeActionTaskRecord(Object occupancyExchangeActionTaskRecord) {
    this.occupancyExchangeActionTaskRecord = occupancyExchangeActionTaskRecord;
  }


  /**
   * Get occupancyExchangeActionRequest
   * @return occupancyExchangeActionRequest
  **/

  public CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest getOccupancyExchangeActionRequest() {
    return occupancyExchangeActionRequest;
  }

  public void setOccupancyExchangeActionRequest(CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest occupancyExchangeActionRequest) {
    this.occupancyExchangeActionRequest = occupancyExchangeActionRequest;
  }


}

