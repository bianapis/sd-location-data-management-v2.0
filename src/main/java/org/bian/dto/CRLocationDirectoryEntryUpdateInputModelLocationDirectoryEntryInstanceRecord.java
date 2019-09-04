package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord
 */
public class CRLocationDirectoryEntryUpdateInputModelLocationDirectoryEntryInstanceRecord   {
  private String locationReference = null;

  private CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated location (can be a physical or electronic location) 
   * @return locationReference
  **/

  public String getLocationReference() {
    return locationReference;
  }

  public void setLocationReference(String locationReference) {
    this.locationReference = locationReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

