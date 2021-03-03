package com.tripmaster.rewardsservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import rewardCentral.RewardCentral;
import tripPricer.TripPricer;

@Configuration
public class RewardsConfig {
	@Bean
	public RewardCentral getRewardCentral() {
		return new RewardCentral();
	}

	@Bean
	public TripPricer getTripPricer() { 
		return new TripPricer();
	}
}