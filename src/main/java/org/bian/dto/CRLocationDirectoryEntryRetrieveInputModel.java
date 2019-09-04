package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryRetrieveInputModel
 */
public class CRLocationDirectoryEntryRetrieveInputModel   {
  private Object locationDirectoryEntryRetrieveActionTaskRecord = null;

  private String locationDirectoryEntryRetrieveActionRequest = null;

  private CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceReportRecord locationDirectoryEntryInstanceReportRecord = null;

  private CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceAnalysis locationDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return locationDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getLocationDirectoryEntryRetrieveActionTaskRecord() {
    return locationDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setLocationDirectoryEntryRetrieveActionTaskRecord(Object locationDirectoryEntryRetrieveActionTaskRecord) {
    this.locationDirectoryEntryRetrieveActionTaskRecord = locationDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return locationDirectoryEntryRetrieveActionRequest
  **/

  public String getLocationDirectoryEntryRetrieveActionRequest() {
    return locationDirectoryEntryRetrieveActionRequest;
  }

  public void setLocationDirectoryEntryRetrieveActionRequest(String locationDirectoryEntryRetrieveActionRequest) {
    this.locationDirectoryEntryRetrieveActionRequest = locationDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get locationDirectoryEntryInstanceReportRecord
   * @return locationDirectoryEntryInstanceReportRecord
  **/

  public CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceReportRecord getLocationDirectoryEntryInstanceReportRecord() {
    return locationDirectoryEntryInstanceReportRecord;
  }

  public void setLocationDirectoryEntryInstanceReportRecord(CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceReportRecord locationDirectoryEntryInstanceReportRecord) {
    this.locationDirectoryEntryInstanceReportRecord = locationDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get locationDirectoryEntryInstanceAnalysis
   * @return locationDirectoryEntryInstanceAnalysis
  **/

  public CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceAnalysis getLocationDirectoryEntryInstanceAnalysis() {
    return locationDirectoryEntryInstanceAnalysis;
  }

  public void setLocationDirectoryEntryInstanceAnalysis(CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceAnalysis locationDirectoryEntryInstanceAnalysis) {
    this.locationDirectoryEntryInstanceAnalysis = locationDirectoryEntryInstanceAnalysis;
  }


}

