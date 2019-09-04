package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLocationRetrieveOutputModelLocationInstanceReport
 */
public class BQLocationRetrieveOutputModelLocationInstanceReport   {
  private Object locationInstanceReportRecord = null;

  private String locationInstanceReportType = null;

  private String locationInstanceReportParameters = null;

  private Object locationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return locationInstanceReportRecord
  **/

  public Object getLocationInstanceReportRecord() {
    return locationInstanceReportRecord;
  }

  public void setLocationInstanceReportRecord(Object locationInstanceReportRecord) {
    this.locationInstanceReportRecord = locationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return locationInstanceReportType
  **/

  public String getLocationInstanceReportType() {
    return locationInstanceReportType;
  }

  public void setLocationInstanceReportType(String locationInstanceReportType) {
    this.locationInstanceReportType = locationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return locationInstanceReportParameters
  **/

  public String getLocationInstanceReportParameters() {
    return locationInstanceReportParameters;
  }

  public void setLocationInstanceReportParameters(String locationInstanceReportParameters) {
    this.locationInstanceReportParameters = locationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return locationInstanceReport
  **/

  public Object getLocationInstanceReport() {
    return locationInstanceReport;
  }

  public void setLocationInstanceReport(Object locationInstanceReport) {
    this.locationInstanceReport = locationInstanceReport;
  }


}

