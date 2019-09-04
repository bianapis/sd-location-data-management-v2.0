package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLocationRetrieveOutputModelLocationInstanceAnalysis
 */
public class BQLocationRetrieveOutputModelLocationInstanceAnalysis   {
  private Object locationInstanceAnalysisRecord = null;

  private String locationInstanceAnalysisReportType = null;

  private String locationInstanceAnalysisParameters = null;

  private Object locationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return locationInstanceAnalysisRecord
  **/

  public Object getLocationInstanceAnalysisRecord() {
    return locationInstanceAnalysisRecord;
  }

  public void setLocationInstanceAnalysisRecord(Object locationInstanceAnalysisRecord) {
    this.locationInstanceAnalysisRecord = locationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return locationInstanceAnalysisReportType
  **/

  public String getLocationInstanceAnalysisReportType() {
    return locationInstanceAnalysisReportType;
  }

  public void setLocationInstanceAnalysisReportType(String locationInstanceAnalysisReportType) {
    this.locationInstanceAnalysisReportType = locationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return locationInstanceAnalysisParameters
  **/

  public String getLocationInstanceAnalysisParameters() {
    return locationInstanceAnalysisParameters;
  }

  public void setLocationInstanceAnalysisParameters(String locationInstanceAnalysisParameters) {
    this.locationInstanceAnalysisParameters = locationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return locationInstanceAnalysisReport
  **/

  public Object getLocationInstanceAnalysisReport() {
    return locationInstanceAnalysisReport;
  }

  public void setLocationInstanceAnalysisReport(Object locationInstanceAnalysisReport) {
    this.locationInstanceAnalysisReport = locationInstanceAnalysisReport;
  }


}

