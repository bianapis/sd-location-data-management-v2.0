package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord;
import org.bian.dto.CRLocationDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryRequestInputModel
 */
public class CRLocationDirectoryEntryRequestInputModel   {
  private String locationDataManagementServicingSessionReference = null;

  private String locationDirectoryEntryInstanceReference = null;

  private CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private Object locationDirectoryEntryRequestActionTaskRecord = null;

  private CRLocationDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return locationDataManagementServicingSessionReference
  **/

  public String getLocationDataManagementServicingSessionReference() {
    return locationDataManagementServicingSessionReference;
  }

  public void setLocationDataManagementServicingSessionReference(String locationDataManagementServicingSessionReference) {
    this.locationDataManagementServicingSessionReference = locationDataManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Location Directory Entry instance 
   * @return locationDirectoryEntryInstanceReference
  **/

  public String getLocationDirectoryEntryInstanceReference() {
    return locationDirectoryEntryInstanceReference;
  }

  public void setLocationDirectoryEntryInstanceReference(String locationDirectoryEntryInstanceReference) {
    this.locationDirectoryEntryInstanceReference = locationDirectoryEntryInstanceReference;
  }


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRLocationDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRLocationDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

