package com.tripmaster.rewardsservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import rewardCentral.RewardCentral;

@Configuration
public class RewardsConfig {
	@Bean
	public RewardCentral getRewardCentral() {
		return new RewardCentral();
	}
}