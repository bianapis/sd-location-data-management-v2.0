package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationUpdateInputModelLocationInstanceRecord;
import org.bian.dto.CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQLocationUpdateOutputModel
 */
public class BQLocationUpdateOutputModel   {
  private CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType locationDirectoryEntryInstanceRecord = null;

  private BQLocationUpdateInputModelLocationInstanceRecord locationInstanceRecord = null;

  private String locationUpdateActionTaskReference = null;

  private Object locationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get locationDirectoryEntryInstanceRecord
   * @return locationDirectoryEntryInstanceRecord
  **/

  public CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return locationUpdateActionTaskReference
  **/

  public String getLocationUpdateActionTaskReference() {
    return locationUpdateActionTaskReference;
  }

  public void setLocationUpdateActionTaskReference(String locationUpdateActionTaskReference) {
    this.locationUpdateActionTaskReference = locationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return locationUpdateActionTaskRecord
  **/

  public Object getLocationUpdateActionTaskRecord() {
    return locationUpdateActionTaskRecord;
  }

  public void setLocationUpdateActionTaskRecord(Object locationUpdateActionTaskRecord) {
    this.locationUpdateActionTaskRecord = locationUpdateActionTaskRecord;
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

