package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationUpdateInputModelLocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLocationExecuteOutputModel
 */
public class BQLocationExecuteOutputModel   {
  private BQLocationUpdateInputModelLocationInstanceRecord locationInstanceRecord = null;

  private String locationExecuteActionTaskReference = null;

  private Object locationExecuteActionTaskRecord = null;

  private String locationExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get locationInstanceRecord
   * @return locationInstanceRecord
  **/

  public BQLocationUpdateInputModelLocationInstanceRecord getLocationInstanceRecord() {
    return locationInstanceRecord;
  }

  public void setLocationInstanceRecord(BQLocationUpdateInputModelLocationInstanceRecord locationInstanceRecord) {
    this.locationInstanceRecord = locationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Location instance execute service call 
   * @return locationExecuteActionTaskReference
  **/

  public String getLocationExecuteActionTaskReference() {
    return locationExecuteActionTaskReference;
  }

  public void setLocationExecuteActionTaskReference(String locationExecuteActionTaskReference) {
    this.locationExecuteActionTaskReference = locationExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return locationExecuteActionTaskRecord
  **/

  public Object getLocationExecuteActionTaskRecord() {
    return locationExecuteActionTaskRecord;
  }

  public void setLocationExecuteActionTaskRecord(Object locationExecuteActionTaskRecord) {
    this.locationExecuteActionTaskRecord = locationExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Location execute transaction/record 
   * @return locationExecuteRecordReference
  **/

  public String getLocationExecuteRecordReference() {
    return locationExecuteRecordReference;
  }

  public void setLocationExecuteRecordReference(String locationExecuteRecordReference) {
    this.locationExecuteRecordReference = locationExecuteRecordReference;
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

