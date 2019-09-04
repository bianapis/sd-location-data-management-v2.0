package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceAnalysis
 */
public class CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceAnalysis   {
  private String locationDirectoryEntryInstanceAnalysisData = null;

  private String locationDirectoryEntryInstanceAnalysisReportType = null;

  private Object locationDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return locationDirectoryEntryInstanceAnalysisData
  **/

  public String getLocationDirectoryEntryInstanceAnalysisData() {
    return locationDirectoryEntryInstanceAnalysisData;
  }

  public void setLocationDirectoryEntryInstanceAnalysisData(String locationDirectoryEntryInstanceAnalysisData) {
    this.locationDirectoryEntryInstanceAnalysisData = locationDirectoryEntryInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return locationDirectoryEntryInstanceAnalysisReportType
  **/

  public String getLocationDirectoryEntryInstanceAnalysisReportType() {
    return locationDirectoryEntryInstanceAnalysisReportType;
  }

  public void setLocationDirectoryEntryInstanceAnalysisReportType(String locationDirectoryEntryInstanceAnalysisReportType) {
    this.locationDirectoryEntryInstanceAnalysisReportType = locationDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return locationDirectoryEntryInstanceAnalysisReport
  **/

  public Object getLocationDirectoryEntryInstanceAnalysisReport() {
    return locationDirectoryEntryInstanceAnalysisReport;
  }

  public void setLocationDirectoryEntryInstanceAnalysisReport(Object locationDirectoryEntryInstanceAnalysisReport) {
    this.locationDirectoryEntryInstanceAnalysisReport = locationDirectoryEntryInstanceAnalysisReport;
  }


}

