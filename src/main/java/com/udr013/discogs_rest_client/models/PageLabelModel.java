
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageLabelModel {

	@JsonProperty("pagination")
    private PaginationModel pagination;
    @JsonProperty("releases")
    private List<LabelReleaseModel> labelReleaseModels = null;

	public PaginationModel getPagination() {
		return pagination;
	}

	public void setPagination(PaginationModel pagination) {
		this.pagination = pagination;
	}

	public List<LabelReleaseModel> getLabelReleaseModels() {
		return labelReleaseModels;
	}

	public void setLabelReleaseModels(List<LabelReleaseModel> labelReleaseModels) {
		this.labelReleaseModels = labelReleaseModels;
	}
}
