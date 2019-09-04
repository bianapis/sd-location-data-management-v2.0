package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOccupancyExecuteInputModelOccupancyInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOccupancyExecuteOutputModel
 */
public class BQOccupancyExecuteOutputModel   {
  private BQOccupancyExecuteInputModelOccupancyInstanceRecord occupancyInstanceRecord = null;

  private String occupancyExecuteActionTaskReference = null;

  private Object occupancyExecuteActionTaskRecord = null;

  private String occupancyExecuteRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Occupancy instance execute service call 
   * @return occupancyExecuteActionTaskReference
  **/

  public String getOccupancyExecuteActionTaskReference() {
    return occupancyExecuteActionTaskReference;
  }

  public void setOccupancyExecuteActionTaskReference(String occupancyExecuteActionTaskReference) {
    this.occupancyExecuteActionTaskReference = occupancyExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Occupancy execute transaction/record 
   * @return occupancyExecuteRecordReference
  **/

  public String getOccupancyExecuteRecordReference() {
    return occupancyExecuteRecordReference;
  }

  public void setOccupancyExecuteRecordReference(String occupancyExecuteRecordReference) {
    this.occupancyExecuteRecordReference = occupancyExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

