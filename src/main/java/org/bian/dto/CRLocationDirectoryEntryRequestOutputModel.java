package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryRequestOutputModel
 */
public class CRLocationDirectoryEntryRequestOutputModel   {
  private CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private String locationDirectoryEntryRequestActionTaskReference = null;

  private Object locationDirectoryEntryRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Location Directory Entry instance request service call 
   * @return locationDirectoryEntryRequestActionTaskReference
  **/

  public String getLocationDirectoryEntryRequestActionTaskReference() {
    return locationDirectoryEntryRequestActionTaskReference;
  }

  public void setLocationDirectoryEntryRequestActionTaskReference(String locationDirectoryEntryRequestActionTaskReference) {
    this.locationDirectoryEntryRequestActionTaskReference = locationDirectoryEntryRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return locationDirectoryEntryRequestActionTaskRecord
  **/

  public Object getLocationDirectoryEntryRequestActionTaskRecord() {
    return locationDirectoryEntryRequestActionTaskRecord;
  }

  public void setLocationDirectoryEntryRequestActionTaskRecord(Object locationDirectoryEntryRequestActionTaskRecord) {
    this.locationDirectoryEntryRequestActionTaskRecord = locationDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

