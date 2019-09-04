package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUseUpdateInputModelUseInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUseExecuteOutputModel
 */
public class BQUseExecuteOutputModel   {
  private BQUseUpdateInputModelUseInstanceRecord useInstanceRecord = null;

  private String useExecuteActionTaskReference = null;

  private Object useExecuteActionTaskRecord = null;

  private String useExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get useInstanceRecord
   * @return useInstanceRecord
  **/

  public BQUseUpdateInputModelUseInstanceRecord getUseInstanceRecord() {
    return useInstanceRecord;
  }

  public void setUseInstanceRecord(BQUseUpdateInputModelUseInstanceRecord useInstanceRecord) {
    this.useInstanceRecord = useInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Use instance execute service call 
   * @return useExecuteActionTaskReference
  **/

  public String getUseExecuteActionTaskReference() {
    return useExecuteActionTaskReference;
  }

  public void setUseExecuteActionTaskReference(String useExecuteActionTaskReference) {
    this.useExecuteActionTaskReference = useExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return useExecuteActionTaskRecord
  **/

  public Object getUseExecuteActionTaskRecord() {
    return useExecuteActionTaskRecord;
  }

  public void setUseExecuteActionTaskRecord(Object useExecuteActionTaskRecord) {
    this.useExecuteActionTaskRecord = useExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Use execute transaction/record 
   * @return useExecuteRecordReference
  **/

  public String getUseExecuteRecordReference() {
    return useExecuteRecordReference;
  }

  public void setUseExecuteRecordReference(String useExecuteRecordReference) {
    this.useExecuteRecordReference = useExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

