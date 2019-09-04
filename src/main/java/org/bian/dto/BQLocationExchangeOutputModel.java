package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLocationExchangeOutputModel
 */
public class BQLocationExchangeOutputModel   {
  private String locationExchangeActionTaskReference = null;

  private Object locationExchangeActionTaskRecord = null;

  private String locationExchangeActionResponse = null;

  private String locationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Location instance exchange service call 
   * @return locationExchangeActionTaskReference
  **/

  public String getLocationExchangeActionTaskReference() {
    return locationExchangeActionTaskReference;
  }

  public void setLocationExchangeActionTaskReference(String locationExchangeActionTaskReference) {
    this.locationExchangeActionTaskReference = locationExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return locationExchangeActionResponse
  **/

  public String getLocationExchangeActionResponse() {
    return locationExchangeActionResponse;
  }

  public void setLocationExchangeActionResponse(String locationExchangeActionResponse) {
    this.locationExchangeActionResponse = locationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Location instance (e.g. accepted, rejected, verified) 
   * @return locationInstanceStatus
  **/

  public String getLocationInstanceStatus() {
    return locationInstanceStatus;
  }

  public void setLocationInstanceStatus(String locationInstanceStatus) {
    this.locationInstanceStatus = locationInstanceStatus;
  }


}

