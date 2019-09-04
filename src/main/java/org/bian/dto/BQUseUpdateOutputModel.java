package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUseUpdateInputModelUseInstanceRecord;
import org.bian.dto.CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUseUpdateOutputModel
 */
public class BQUseUpdateOutputModel   {
  private CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private BQUseUpdateInputModelUseInstanceRecord useInstanceRecord = null;

  private String useUpdateActionTaskReference = null;

  private Object useUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return useUpdateActionTaskReference
  **/

  public String getUseUpdateActionTaskReference() {
    return useUpdateActionTaskReference;
  }

  public void setUseUpdateActionTaskReference(String useUpdateActionTaskReference) {
    this.useUpdateActionTaskReference = useUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return useUpdateActionTaskRecord
  **/

  public Object getUseUpdateActionTaskRecord() {
    return useUpdateActionTaskRecord;
  }

  public void setUseUpdateActionTaskRecord(Object useUpdateActionTaskRecord) {
    this.useUpdateActionTaskRecord = useUpdateActionTaskRecord;
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

