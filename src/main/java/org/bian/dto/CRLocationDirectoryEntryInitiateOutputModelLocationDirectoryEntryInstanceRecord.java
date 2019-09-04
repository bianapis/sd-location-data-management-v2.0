package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord
 */
public class CRLocationDirectoryEntryInitiateOutputModelLocationDirectoryEntryInstanceRecord   {
  private CRLocationDirectoryEntryInitiateInputModelLocationDirectoryEntryInstanceRecordDateType dateType = null;


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

