package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationRetrieveOutputModelLocationDirectoryEntryInstanceRecord;
import org.bian.dto.BQLocationRetrieveOutputModelLocationInstanceAnalysis;
import org.bian.dto.BQLocationRetrieveOutputModelLocationInstanceReport;
import org.bian.dto.BQLocationUpdateInputModelLocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLocationRetrieveOutputModel
 */
public class BQLocationRetrieveOutputModel   {
  private BQLocationRetrieveOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private BQLocationUpdateInputModelLocationInstanceRecord locationInstanceRecord = null;

  private String locationRetrieveActionTaskReference = null;

  private Object locationRetrieveActionTaskRecord = null;

  private String locationRetrieveActionResponse = null;

  private BQLocationRetrieveOutputModelLocationInstanceReport locationInstanceReport = null;

  private BQLocationRetrieveOutputModelLocationInstanceAnalysis locationInstanceAnalysis = null;


  /**
   * Get locationDirectoryEntryInstanceRecord
   * @return locationDirectoryEntryInstanceRecord
  **/

  public BQLocationRetrieveOutputModelLocationDirectoryEntryInstanceRecord getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(BQLocationRetrieveOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Location instance retrieve service call 
   * @return locationRetrieveActionTaskReference
  **/

  public String getLocationRetrieveActionTaskReference() {
    return locationRetrieveActionTaskReference;
  }

  public void setLocationRetrieveActionTaskReference(String locationRetrieveActionTaskReference) {
    this.locationRetrieveActionTaskReference = locationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return locationRetrieveActionTaskRecord
  **/

  public Object getLocationRetrieveActionTaskRecord() {
    return locationRetrieveActionTaskRecord;
  }

  public void setLocationRetrieveActionTaskRecord(Object locationRetrieveActionTaskRecord) {
    this.locationRetrieveActionTaskRecord = locationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return locationRetrieveActionResponse
  **/

  public String getLocationRetrieveActionResponse() {
    return locationRetrieveActionResponse;
  }

  public void setLocationRetrieveActionResponse(String locationRetrieveActionResponse) {
    this.locationRetrieveActionResponse = locationRetrieveActionResponse;
  }


  /**
   * Get locationInstanceReport
   * @return locationInstanceReport
  **/

  public BQLocationRetrieveOutputModelLocationInstanceReport getLocationInstanceReport() {
    return locationInstanceReport;
  }

  public void setLocationInstanceReport(BQLocationRetrieveOutputModelLocationInstanceReport locationInstanceReport) {
    this.locationInstanceReport = locationInstanceReport;
  }


  /**
   * Get locationInstanceAnalysis
   * @return locationInstanceAnalysis
  **/

  public BQLocationRetrieveOutputModelLocationInstanceAnalysis getLocationInstanceAnalysis() {
    return locationInstanceAnalysis;
  }

  public void setLocationInstanceAnalysis(BQLocationRetrieveOutputModelLocationInstanceAnalysis locationInstanceAnalysis) {
    this.locationInstanceAnalysis = locationInstanceAnalysis;
  }


}

