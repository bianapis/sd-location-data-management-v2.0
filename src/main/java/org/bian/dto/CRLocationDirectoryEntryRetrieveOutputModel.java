package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceRecord;
import org.bian.dto.CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryRetrieveOutputModel
 */
public class CRLocationDirectoryEntryRetrieveOutputModel   {
  private CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private String locationDirectoryEntryRetrieveActionTaskReference = null;

  private Object locationDirectoryEntryRetrieveActionTaskRecord = null;

  private String locationDirectoryEntryRetrieveActionResponse = null;

  private CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceReportRecord locationDirectoryEntryInstanceReportRecord = null;

  private CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceAnalysis locationDirectoryEntryInstanceAnalysis = null;


  /**
   * Get locationDirectoryEntryInstanceRecord
   * @return locationDirectoryEntryInstanceRecord
  **/

  public CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceRecord getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Location Directory Entry instance retrieve service call 
   * @return locationDirectoryEntryRetrieveActionTaskReference
  **/

  public String getLocationDirectoryEntryRetrieveActionTaskReference() {
    return locationDirectoryEntryRetrieveActionTaskReference;
  }

  public void setLocationDirectoryEntryRetrieveActionTaskReference(String locationDirectoryEntryRetrieveActionTaskReference) {
    this.locationDirectoryEntryRetrieveActionTaskReference = locationDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return locationDirectoryEntryRetrieveActionResponse
  **/

  public String getLocationDirectoryEntryRetrieveActionResponse() {
    return locationDirectoryEntryRetrieveActionResponse;
  }

  public void setLocationDirectoryEntryRetrieveActionResponse(String locationDirectoryEntryRetrieveActionResponse) {
    this.locationDirectoryEntryRetrieveActionResponse = locationDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get locationDirectoryEntryInstanceReportRecord
   * @return locationDirectoryEntryInstanceReportRecord
  **/

  public CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceReportRecord getLocationDirectoryEntryInstanceReportRecord() {
    return locationDirectoryEntryInstanceReportRecord;
  }

  public void setLocationDirectoryEntryInstanceReportRecord(CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceReportRecord locationDirectoryEntryInstanceReportRecord) {
    this.locationDirectoryEntryInstanceReportRecord = locationDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get locationDirectoryEntryInstanceAnalysis
   * @return locationDirectoryEntryInstanceAnalysis
  **/

  public CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceAnalysis getLocationDirectoryEntryInstanceAnalysis() {
    return locationDirectoryEntryInstanceAnalysis;
  }

  public void setLocationDirectoryEntryInstanceAnalysis(CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceAnalysis locationDirectoryEntryInstanceAnalysis) {
    this.locationDirectoryEntryInstanceAnalysis = locationDirectoryEntryInstanceAnalysis;
  }


}

