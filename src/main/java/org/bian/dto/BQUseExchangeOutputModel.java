package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUseExchangeOutputModel
 */
public class BQUseExchangeOutputModel   {
  private String useExchangeActionTaskReference = null;

  private Object useExchangeActionTaskRecord = null;

  private String useExchangeActionResponse = null;

  private String useInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Use instance exchange service call 
   * @return useExchangeActionTaskReference
  **/

  public String getUseExchangeActionTaskReference() {
    return useExchangeActionTaskReference;
  }

  public void setUseExchangeActionTaskReference(String useExchangeActionTaskReference) {
    this.useExchangeActionTaskReference = useExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return useExchangeActionTaskRecord
  **/

  public Object getUseExchangeActionTaskRecord() {
    return useExchangeActionTaskRecord;
  }

  public void setUseExchangeActionTaskRecord(Object useExchangeActionTaskRecord) {
    this.useExchangeActionTaskRecord = useExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return useExchangeActionResponse
  **/

  public String getUseExchangeActionResponse() {
    return useExchangeActionResponse;
  }

  public void setUseExchangeActionResponse(String useExchangeActionResponse) {
    this.useExchangeActionResponse = useExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Use instance (e.g. accepted, rejected, verified) 
   * @return useInstanceStatus
  **/

  public String getUseInstanceStatus() {
    return useInstanceStatus;
  }

  public void setUseInstanceStatus(String useInstanceStatus) {
    this.useInstanceStatus = useInstanceStatus;
  }


}

