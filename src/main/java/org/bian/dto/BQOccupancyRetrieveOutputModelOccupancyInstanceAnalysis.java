package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOccupancyRetrieveOutputModelOccupancyInstanceAnalysis
 */
public class BQOccupancyRetrieveOutputModelOccupancyInstanceAnalysis   {
  private Object occupancyInstanceAnalysisRecord = null;

  private String occupancyInstanceAnalysisReportType = null;

  private String occupancyInstanceAnalysisParameters = null;

  private Object occupancyInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return occupancyInstanceAnalysisRecord
  **/

  public Object getOccupancyInstanceAnalysisRecord() {
    return occupancyInstanceAnalysisRecord;
  }

  public void setOccupancyInstanceAnalysisRecord(Object occupancyInstanceAnalysisRecord) {
    this.occupancyInstanceAnalysisRecord = occupancyInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return occupancyInstanceAnalysisReportType
  **/

  public String getOccupancyInstanceAnalysisReportType() {
    return occupancyInstanceAnalysisReportType;
  }

  public void setOccupancyInstanceAnalysisReportType(String occupancyInstanceAnalysisReportType) {
    this.occupancyInstanceAnalysisReportType = occupancyInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return occupancyInstanceAnalysisParameters
  **/

  public String getOccupancyInstanceAnalysisParameters() {
    return occupancyInstanceAnalysisParameters;
  }

  public void setOccupancyInstanceAnalysisParameters(String occupancyInstanceAnalysisParameters) {
    this.occupancyInstanceAnalysisParameters = occupancyInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return occupancyInstanceAnalysisReport
  **/

  public Object getOccupancyInstanceAnalysisReport() {
    return occupancyInstanceAnalysisReport;
  }

  public void setOccupancyInstanceAnalysisReport(Object occupancyInstanceAnalysisReport) {
    this.occupancyInstanceAnalysisReport = occupancyInstanceAnalysisReport;
  }


}

