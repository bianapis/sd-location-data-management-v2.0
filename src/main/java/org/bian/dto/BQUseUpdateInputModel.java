package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUseUpdateInputModelUseInstanceRecord;
import org.bian.dto.CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUseUpdateInputModel
 */
public class BQUseUpdateInputModel   {
  private CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private String locationDirectoryEntryInstanceReference = null;

  private String useInstanceReference = null;

  private BQUseUpdateInputModelUseInstanceRecord useInstanceRecord = null;

  private Object useUpdateActionTaskRecord = null;

  private String useUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return useUpdateActionRequest
  **/

  public String getUseUpdateActionRequest() {
    return useUpdateActionRequest;
  }

  public void setUseUpdateActionRequest(String useUpdateActionRequest) {
    this.useUpdateActionRequest = useUpdateActionRequest;
  }


}

