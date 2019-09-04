package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceAnalysis
 */
public class CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceAnalysis   {
  private String locationDirectoryEntryInstanceAnalysisReference = null;

  private String locationDirectoryEntryInstanceAnalysisReportType = null;

  private String locationDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return locationDirectoryEntryInstanceAnalysisReference
  **/

  public String getLocationDirectoryEntryInstanceAnalysisReference() {
    return locationDirectoryEntryInstanceAnalysisReference;
  }

  public void setLocationDirectoryEntryInstanceAnalysisReference(String locationDirectoryEntryInstanceAnalysisReference) {
    this.locationDirectoryEntryInstanceAnalysisReference = locationDirectoryEntryInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return locationDirectoryEntryInstanceAnalysisParameters
  **/

  public String getLocationDirectoryEntryInstanceAnalysisParameters() {
    return locationDirectoryEntryInstanceAnalysisParameters;
  }

  public void setLocationDirectoryEntryInstanceAnalysisParameters(String locationDirectoryEntryInstanceAnalysisParameters) {
    this.locationDirectoryEntryInstanceAnalysisParameters = locationDirectoryEntryInstanceAnalysisParameters;
  }


}

