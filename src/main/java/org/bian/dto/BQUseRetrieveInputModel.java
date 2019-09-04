package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUseRetrieveInputModelUseInstanceAnalysis;
import org.bian.dto.BQUseRetrieveInputModelUseInstanceReport;

import javax.validation.Valid;
  
/**
 * BQUseRetrieveInputModel
 */
public class BQUseRetrieveInputModel   {
  private Object useRetrieveActionTaskRecord = null;

  private String useRetrieveActionRequest = null;

  private BQUseRetrieveInputModelUseInstanceReport useInstanceReport = null;

  private BQUseRetrieveInputModelUseInstanceAnalysis useInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return useRetrieveActionTaskRecord
  **/

  public Object getUseRetrieveActionTaskRecord() {
    return useRetrieveActionTaskRecord;
  }

  public void setUseRetrieveActionTaskRecord(Object useRetrieveActionTaskRecord) {
    this.useRetrieveActionTaskRecord = useRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return useRetrieveActionRequest
  **/

  public String getUseRetrieveActionRequest() {
    return useRetrieveActionRequest;
  }

  public void setUseRetrieveActionRequest(String useRetrieveActionRequest) {
    this.useRetrieveActionRequest = useRetrieveActionRequest;
  }


  /**
   * Get useInstanceReport
   * @return useInstanceReport
  **/

  public BQUseRetrieveInputModelUseInstanceReport getUseInstanceReport() {
    return useInstanceReport;
  }

  public void setUseInstanceReport(BQUseRetrieveInputModelUseInstanceReport useInstanceReport) {
    this.useInstanceReport = useInstanceReport;
  }


  /**
   * Get useInstanceAnalysis
   * @return useInstanceAnalysis
  **/

  public BQUseRetrieveInputModelUseInstanceAnalysis getUseInstanceAnalysis() {
    return useInstanceAnalysis;
  }

  public void setUseInstanceAnalysis(BQUseRetrieveInputModelUseInstanceAnalysis useInstanceAnalysis) {
    this.useInstanceAnalysis = useInstanceAnalysis;
  }


}

