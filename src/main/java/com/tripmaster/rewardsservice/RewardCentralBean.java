package com.tripmaster.rewardsservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import rewardCentral.RewardCentral;

@Configuration
public class RewardCentralBean {
	@Bean
	public RewardCentral getRewardCentral() {
		return new RewardCentral();
	}
}