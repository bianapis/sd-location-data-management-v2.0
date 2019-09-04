/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Catalog;

@BianRestController
public class LocationDataManagementApiController {

	@Autowired
	LocationDataManagementApiService service;
	
	@Catalog.Activate
	public BianResponse<SDLocationDataManagementActivateOutputModel> activate(@RequestBody BianRequest<SDLocationDataManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Catalog.Configure
	public BianResponse<SDLocationDataManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDLocationDataManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Control
	public BianResponse<CRLocationDirectoryEntryControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLocationDirectoryEntryControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("location")
	@Catalog.Exchange
	public BianResponse<BQLocationExchangeOutputModel> exchangeLocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeLocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("occupancy")
	@Catalog.Exchange
	public BianResponse<BQOccupancyExchangeOutputModel> exchangeOccupancy(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOccupancyExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeOccupancy(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Exchange
	public BianResponse<CRLocationDirectoryEntryExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLocationDirectoryEntryExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("use")
	@Catalog.Exchange
	public BianResponse<BQUseExchangeOutputModel> exchangeUse(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUseExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeUse(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("location")
	@Catalog.Execute
	public BianResponse<BQLocationExecuteOutputModel> executeLocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLocationExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeLocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("occupancy")
	@Catalog.Execute
	public BianResponse<BQOccupancyExecuteOutputModel> executeOccupancy(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOccupancyExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeOccupancy(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("use")
	@Catalog.Execute
	public BianResponse<BQUseExecuteOutputModel> executeUse(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUseExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeUse(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Feedback
	public BianResponse<SDLocationDataManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDLocationDataManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Initiate
	public BianResponse<CRLocationDirectoryEntryInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRLocationDirectoryEntryInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Request
	public BianResponse<CRLocationDirectoryEntryRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLocationDirectoryEntryRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Retrieve
	public BianResponse<CRLocationDirectoryEntryRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Catalog.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Catalog.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Catalog.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("location")
	@Catalog.Retrieve
	public BianResponse<BQLocationRetrieveOutputModel> retrieveLocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLocation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("occupancy")
	@Catalog.Retrieve
	public BianResponse<BQOccupancyRetrieveOutputModel> retrieveOccupancy(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOccupancy(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("use")
	@Catalog.Retrieve
	public BianResponse<BQUseRetrieveOutputModel> retrieveUse(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUse(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Catalog.RetrieveSD
	public BianResponse<SDLocationDataManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Catalog.Update
	public BianResponse<CRLocationDirectoryEntryUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRLocationDirectoryEntryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("location")
	@Catalog.Update
	public BianResponse<BQLocationUpdateOutputModel> updateLocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateLocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("occupancy")
	@Catalog.Update
	public BianResponse<BQOccupancyUpdateOutputModel> updateOccupancy(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOccupancyUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOccupancy(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("use")
	@Catalog.Update
	public BianResponse<BQUseUpdateOutputModel> updateUse(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUseUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateUse(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
