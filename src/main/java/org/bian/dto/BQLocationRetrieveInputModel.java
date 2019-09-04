package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationRetrieveInputModelLocationInstanceAnalysis;
import org.bian.dto.BQLocationRetrieveInputModelLocationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLocationRetrieveInputModel
 */
public class BQLocationRetrieveInputModel   {
  private Object locationRetrieveActionTaskRecord = null;

  private String locationRetrieveActionRequest = null;

  private BQLocationRetrieveInputModelLocationInstanceReport locationInstanceReport = null;

  private BQLocationRetrieveInputModelLocationInstanceAnalysis locationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return locationRetrieveActionRequest
  **/

  public String getLocationRetrieveActionRequest() {
    return locationRetrieveActionRequest;
  }

  public void setLocationRetrieveActionRequest(String locationRetrieveActionRequest) {
    this.locationRetrieveActionRequest = locationRetrieveActionRequest;
  }


  /**
   * Get locationInstanceReport
   * @return locationInstanceReport
  **/

  public BQLocationRetrieveInputModelLocationInstanceReport getLocationInstanceReport() {
    return locationInstanceReport;
  }

  public void setLocationInstanceReport(BQLocationRetrieveInputModelLocationInstanceReport locationInstanceReport) {
    this.locationInstanceReport = locationInstanceReport;
  }


  /**
   * Get locationInstanceAnalysis
   * @return locationInstanceAnalysis
  **/

  public BQLocationRetrieveInputModelLocationInstanceAnalysis getLocationInstanceAnalysis() {
    return locationInstanceAnalysis;
  }

  public void setLocationInstanceAnalysis(BQLocationRetrieveInputModelLocationInstanceAnalysis locationInstanceAnalysis) {
    this.locationInstanceAnalysis = locationInstanceAnalysis;
  }


}

