package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOccupancyExecuteInputModelOccupancyInstanceRecord
 */
public class BQOccupancyExecuteInputModelOccupancyInstanceRecord   {
  private String customerReference = null;

  private String locationOwnerTitle = null;

  private String locationValue = null;

  private String locationOccupierType = null;

  private String locationOccupierReference = null;

  private String locationOccupierTerms = null;

  private String alliancePartnerReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the bank customer (if they are owner and/or occupier of the property at the location) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Registered owner or title holder(s) of the property 
   * @return locationOwnerTitle
  **/

  public String getLocationOwnerTitle() {
    return locationOwnerTitle;
  }

  public void setLocationOwnerTitle(String locationOwnerTitle) {
    this.locationOwnerTitle = locationOwnerTitle;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The estimated (book) value of the property at the location - rental and purchase as appropriate 
   * @return locationValue
  **/

  public String getLocationValue() {
    return locationValue;
  }

  public void setLocationValue(String locationValue) {
    this.locationValue = locationValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of occupancy (e.g. residency, business, retail, entertainment) 
   * @return locationOccupierType
  **/

  public String getLocationOccupierType() {
    return locationOccupierType;
  }

  public void setLocationOccupierType(String locationOccupierType) {
    this.locationOccupierType = locationOccupierType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Known contact reference details of occupier (e.g. family name, company, retailer) 
   * @return locationOccupierReference
  **/

  public String getLocationOccupierReference() {
    return locationOccupierReference;
  }

  public void setLocationOccupierReference(String locationOccupierReference) {
    this.locationOccupierReference = locationOccupierReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Nature of the access terms or entitlement of the occupier (e.g. leasehold, rental, public access) 
   * @return locationOccupierTerms
  **/

  public String getLocationOccupierTerms() {
    return locationOccupierTerms;
  }

  public void setLocationOccupierTerms(String locationOccupierTerms) {
    this.locationOccupierTerms = locationOccupierTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a bank alliance partner with some kind of link association to the location (used for location based marketing) 
   * @return alliancePartnerReference
  **/

  public String getAlliancePartnerReference() {
    return alliancePartnerReference;
  }

  public void setAlliancePartnerReference(String alliancePartnerReference) {
    this.alliancePartnerReference = alliancePartnerReference;
  }


}

