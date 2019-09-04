package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOccupancyRetrieveInputModelOccupancyInstanceAnalysis;
import org.bian.dto.BQOccupancyRetrieveInputModelOccupancyInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOccupancyRetrieveInputModel
 */
public class BQOccupancyRetrieveInputModel   {
  private Object occupancyRetrieveActionTaskRecord = null;

  private String occupancyRetrieveActionRequest = null;

  private BQOccupancyRetrieveInputModelOccupancyInstanceReport occupancyInstanceReport = null;

  private BQOccupancyRetrieveInputModelOccupancyInstanceAnalysis occupancyInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return occupancyRetrieveActionTaskRecord
  **/

  public Object getOccupancyRetrieveActionTaskRecord() {
    return occupancyRetrieveActionTaskRecord;
  }

  public void setOccupancyRetrieveActionTaskRecord(Object occupancyRetrieveActionTaskRecord) {
    this.occupancyRetrieveActionTaskRecord = occupancyRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return occupancyRetrieveActionRequest
  **/

  public String getOccupancyRetrieveActionRequest() {
    return occupancyRetrieveActionRequest;
  }

  public void setOccupancyRetrieveActionRequest(String occupancyRetrieveActionRequest) {
    this.occupancyRetrieveActionRequest = occupancyRetrieveActionRequest;
  }


  /**
   * Get occupancyInstanceReport
   * @return occupancyInstanceReport
  **/

  public BQOccupancyRetrieveInputModelOccupancyInstanceReport getOccupancyInstanceReport() {
    return occupancyInstanceReport;
  }

  public void setOccupancyInstanceReport(BQOccupancyRetrieveInputModelOccupancyInstanceReport occupancyInstanceReport) {
    this.occupancyInstanceReport = occupancyInstanceReport;
  }


  /**
   * Get occupancyInstanceAnalysis
   * @return occupancyInstanceAnalysis
  **/

  public BQOccupancyRetrieveInputModelOccupancyInstanceAnalysis getOccupancyInstanceAnalysis() {
    return occupancyInstanceAnalysis;
  }

  public void setOccupancyInstanceAnalysis(BQOccupancyRetrieveInputModelOccupancyInstanceAnalysis occupancyInstanceAnalysis) {
    this.occupancyInstanceAnalysis = occupancyInstanceAnalysis;
  }


}

