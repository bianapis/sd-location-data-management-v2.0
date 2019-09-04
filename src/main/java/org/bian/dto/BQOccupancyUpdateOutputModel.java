package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOccupancyUpdateInputModelOccupancyInstanceRecord;
import org.bian.dto.CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOccupancyUpdateOutputModel
 */
public class BQOccupancyUpdateOutputModel   {
  private CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private BQOccupancyUpdateInputModelOccupancyInstanceRecord occupancyInstanceRecord = null;

  private String occupancyUpdateActionTaskReference = null;

  private Object occupancyUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return occupancyUpdateActionTaskReference
  **/

  public String getOccupancyUpdateActionTaskReference() {
    return occupancyUpdateActionTaskReference;
  }

  public void setOccupancyUpdateActionTaskReference(String occupancyUpdateActionTaskReference) {
    this.occupancyUpdateActionTaskReference = occupancyUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

