package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationExecuteInputModelExecuteRecordType;
import org.bian.dto.BQLocationUpdateInputModelLocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLocationExecuteInputModel
 */
public class BQLocationExecuteInputModel   {
  private String locationDirectoryEntryInstanceReference = null;

  private String locationInstanceReference = null;

  private BQLocationUpdateInputModelLocationInstanceRecord locationInstanceRecord = null;

  private Object locationExecuteActionTaskRecord = null;

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

