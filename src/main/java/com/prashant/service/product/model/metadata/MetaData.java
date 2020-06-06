package com.prashant.service.product.model.metadata;

import java.util.List;

public class MetaData {

	private SocialMediaStats smStats;
	private List<String> tags;

	public SocialMediaStats getSmStats() {
		return smStats;
	}

	public void setSmStats(SocialMediaStats smStats) {
		this.smStats = smStats;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
