package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOccupancyUpdateInputModelOccupancyInstanceRecord;
import org.bian.dto.CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOccupancyUpdateInputModel
 */
public class BQOccupancyUpdateInputModel   {
  private CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private String locationDirectoryEntryInstanceReference = null;

  private String occupancyInstanceReference = null;

  private BQOccupancyUpdateInputModelOccupancyInstanceRecord occupancyInstanceRecord = null;

  private Object occupancyUpdateActionTaskRecord = null;

  private String occupancyUpdateActionRequest = null;


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
   * Get occupancyInstanceRecord
   * @return occupancyInstanceRecord
  **/

  public BQOccupancyUpdateInputModelOccupancyInstanceRecord getOccupancyInstanceRecord() {
    return occupancyInstanceRecord;
  }

  public void setOccupancyInstanceRecord(BQOccupancyUpdateInputModelOccupancyInstanceRecord occupancyInstanceRecord) {
    this.occupancyInstanceRecord = occupancyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return occupancyUpdateActionTaskRecord
  **/

  public Object getOccupancyUpdateActionTaskRecord() {
    return occupancyUpdateActionTaskRecord;
  }

  public void setOccupancyUpdateActionTaskRecord(Object occupancyUpdateActionTaskRecord) {
    this.occupancyUpdateActionTaskRecord = occupancyUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return occupancyUpdateActionRequest
  **/

  public String getOccupancyUpdateActionRequest() {
    return occupancyUpdateActionRequest;
  }

  public void setOccupancyUpdateActionRequest(String occupancyUpdateActionRequest) {
    this.occupancyUpdateActionRequest = occupancyUpdateActionRequest;
  }


}

