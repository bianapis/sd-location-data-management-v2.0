package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationExecuteInputModelExecuteRecordType;
import org.bian.dto.BQUseUpdateInputModelUseInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUseExecuteInputModel
 */
public class BQUseExecuteInputModel   {
  private String locationDirectoryEntryInstanceReference = null;

  private String useInstanceReference = null;

  private BQUseUpdateInputModelUseInstanceRecord useInstanceRecord = null;

  private Object useExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Use instance 
   * @return useInstanceReference
  **/

  public String getUseInstanceReference() {
    return useInstanceReference;
  }

  public void setUseInstanceReference(String useInstanceReference) {
    this.useInstanceReference = useInstanceReference;
  }


  /**
   * Get useInstanceRecord
   * @return useInstanceRecord
  **/

  public BQUseUpdateInputModelUseInstanceRecord getUseInstanceRecord() {
    return useInstanceRecord;
  }

  public void setUseInstanceRecord(BQUseUpdateInputModelUseInstanceRecord useInstanceRecord) {
    this.useInstanceRecord = useInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return useExecuteActionTaskRecord
  **/

  public Object getUseExecuteActionTaskRecord() {
    return useExecuteActionTaskRecord;
  }

  public void setUseExecuteActionTaskRecord(Object useExecuteActionTaskRecord) {
    this.useExecuteActionTaskRecord = useExecuteActionTaskRecord;
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

