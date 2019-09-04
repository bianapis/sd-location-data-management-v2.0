package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOccupancyExchangeOutputModel
 */
public class BQOccupancyExchangeOutputModel   {
  private String occupancyExchangeActionTaskReference = null;

  private Object occupancyExchangeActionTaskRecord = null;

  private String occupancyExchangeActionResponse = null;

  private String occupancyInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Occupancy instance exchange service call 
   * @return occupancyExchangeActionTaskReference
  **/

  public String getOccupancyExchangeActionTaskReference() {
    return occupancyExchangeActionTaskReference;
  }

  public void setOccupancyExchangeActionTaskReference(String occupancyExchangeActionTaskReference) {
    this.occupancyExchangeActionTaskReference = occupancyExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return occupancyExchangeActionResponse
  **/

  public String getOccupancyExchangeActionResponse() {
    return occupancyExchangeActionResponse;
  }

  public void setOccupancyExchangeActionResponse(String occupancyExchangeActionResponse) {
    this.occupancyExchangeActionResponse = occupancyExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Occupancy instance (e.g. accepted, rejected, verified) 
   * @return occupancyInstanceStatus
  **/

  public String getOccupancyInstanceStatus() {
    return occupancyInstanceStatus;
  }

  public void setOccupancyInstanceStatus(String occupancyInstanceStatus) {
    this.occupancyInstanceStatus = occupancyInstanceStatus;
  }


}

