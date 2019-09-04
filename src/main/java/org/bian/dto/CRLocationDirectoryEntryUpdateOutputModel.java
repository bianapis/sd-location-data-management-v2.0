package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryUpdateOutputModel
 */
public class CRLocationDirectoryEntryUpdateOutputModel   {
  private CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private String locationDirectoryEntryUpdateActionTaskReference = null;

  private Object locationDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get locationDirectoryEntryInstanceRecord
   * @return locationDirectoryEntryInstanceRecord
  **/

  public CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return locationDirectoryEntryUpdateActionTaskReference
  **/

  public String getLocationDirectoryEntryUpdateActionTaskReference() {
    return locationDirectoryEntryUpdateActionTaskReference;
  }

  public void setLocationDirectoryEntryUpdateActionTaskReference(String locationDirectoryEntryUpdateActionTaskReference) {
    this.locationDirectoryEntryUpdateActionTaskReference = locationDirectoryEntryUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return locationDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getLocationDirectoryEntryUpdateActionTaskRecord() {
    return locationDirectoryEntryUpdateActionTaskRecord;
  }

  public void setLocationDirectoryEntryUpdateActionTaskRecord(Object locationDirectoryEntryUpdateActionTaskRecord) {
    this.locationDirectoryEntryUpdateActionTaskRecord = locationDirectoryEntryUpdateActionTaskRecord;
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

