package com.tripmaster.rewardsservice.model;

import java.util.List;

import tripPricer.Provider;

public class ProviderListWrapper {
	 private List<Provider> providerList;

    public List<Provider> getProviderList() {
        return providerList;
    }

    public void setProviderList(List<Provider> providerList) {
        this.providerList = providerList;
    }
}