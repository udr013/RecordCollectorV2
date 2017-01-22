
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommunityModel {

    private String status;
    private RatingModel ratingModel;
    private int have;
    private List<ContributorModel> contributorModels = null;
    private int want;
    private SubmitterModel submitterModel;
    private String dataQuality;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RatingModel getRatingModel() {
        return ratingModel;
    }

    public void setRatingModel(RatingModel ratingModel) {
        this.ratingModel = ratingModel;
    }

    public int getHave() {
        return have;
    }

    public void setHave(int have) {
        this.have = have;
    }

    public List<ContributorModel> getContributorModels() {
        return contributorModels;
    }

    public void setContributorModels(List<ContributorModel> contributorModels) {
        this.contributorModels = contributorModels;
    }

    public int getWant() {
        return want;
    }

    public void setWant(int want) {
        this.want = want;
    }

    public SubmitterModel getSubmitterModel() {
        return submitterModel;
    }

    public void setSubmitterModel(SubmitterModel submitterModel) {
        this.submitterModel = submitterModel;
    }

    public String getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(String dataQuality) {
        this.dataQuality = dataQuality;
    }

}
