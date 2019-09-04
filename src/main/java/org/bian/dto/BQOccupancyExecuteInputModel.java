package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationExecuteInputModelExecuteRecordType;
import org.bian.dto.BQOccupancyExecuteInputModelOccupancyInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOccupancyExecuteInputModel
 */
public class BQOccupancyExecuteInputModel   {
  private String locationDirectoryEntryInstanceReference = null;

  private String occupancyInstanceReference = null;

  private BQOccupancyExecuteInputModelOccupancyInstanceRecord occupancyInstanceRecord = null;

  private Object occupancyExecuteActionTaskRecord = null;

  private BQLocationExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQOccupancyExecuteInputModelOccupancyInstanceRecord getOccupancyInstanceRecord() {
    return occupancyInstanceRecord;
  }

  public void setOccupancyInstanceRecord(BQOccupancyExecuteInputModelOccupancyInstanceRecord occupancyInstanceRecord) {
    this.occupancyInstanceRecord = occupancyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return occupancyExecuteActionTaskRecord
  **/

  public Object getOccupancyExecuteActionTaskRecord() {
    return occupancyExecuteActionTaskRecord;
  }

  public void setOccupancyExecuteActionTaskRecord(Object occupancyExecuteActionTaskRecord) {
    this.occupancyExecuteActionTaskRecord = occupancyExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQLocationExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQLocationExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

