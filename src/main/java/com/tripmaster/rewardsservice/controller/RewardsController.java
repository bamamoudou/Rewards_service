package com.tripmaster.rewardsservice.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tripmaster.rewardsservice.model.ProviderListWrapper;
import com.tripmaster.rewardsservice.service.RewardsService;

import io.swagger.annotations.Api;

@RestController
@Api(description = "Rewards microservice for TourGuide")
public class RewardsController {
	@Autowired
	private RewardsService rewardsService;
	private final Logger logger = LoggerFactory.getLogger(RewardsController.class);

	/**
	 * Gets the user's current reward points
	 * 
	 * @param attractionId
	 * @param userId
	 * @return int of reward points
	 */
	@RequestMapping("/reward-points")
	public Integer getRewardPoints(@RequestParam UUID attractionId, @RequestParam UUID userId) {
		logger.debug("Request made to getRewardPoints");
		Integer rewardsPoints = new Integer(rewardsService.getRewardPoints(attractionId, userId));
		return rewardsPoints;
	}

	/**
	 * Gets a list of a user's available trip deals
	 * 
	 * @param tripPricerApiKey
	 * @param userId
	 * @param numberOfAdults
	 * @param numberOfChildren
	 * @param tripDuration
	 * @param cumulativeRewardPoints
	 * @return list of trip deals
	 */
	@RequestMapping("/trip-deals")
	public ProviderListWrapper getTripDeals(@RequestParam String tripPricerApiKey, @RequestParam UUID userId,
			@RequestParam int numberOfAdults, @RequestParam int numberOfChildren, @RequestParam int tripDuration,
			@RequestParam int cumulativeRewardPoints) {
		logger.debug("Request made to getTripDeals");
		ProviderListWrapper providerListWrapper = new ProviderListWrapper();
		providerListWrapper.setProviderList(rewardsService.getTripDeals(tripPricerApiKey, userId, numberOfAdults,
				numberOfChildren, tripDuration, cumulativeRewardPoints));
		return providerListWrapper;
	}
}