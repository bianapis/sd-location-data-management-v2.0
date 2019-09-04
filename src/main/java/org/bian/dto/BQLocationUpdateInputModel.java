package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationUpdateInputModelLocationInstanceRecord;
import org.bian.dto.CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQLocationUpdateInputModel
 */
public class BQLocationUpdateInputModel   {
  private CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType locationDirectoryEntryInstanceRecord = null;

  private String locationDirectoryEntryInstanceReference = null;

  private String locationInstanceReference = null;

  private BQLocationUpdateInputModelLocationInstanceRecord locationInstanceRecord = null;

  private Object locationUpdateActionTaskRecord = null;

  private String locationUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Location instance 
   * @return locationInstanceReference
  **/

  public String getLocationInstanceReference() {
    return locationInstanceReference;
  }

  public void setLocationInstanceReference(String locationInstanceReference) {
    this.locationInstanceReference = locationInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return locationUpdateActionRequest
  **/

  public String getLocationUpdateActionRequest() {
    return locationUpdateActionRequest;
  }

  public void setLocationUpdateActionRequest(String locationUpdateActionRequest) {
    this.locationUpdateActionRequest = locationUpdateActionRequest;
  }


}

