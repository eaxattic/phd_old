package com.eax.config;

public abstract class ConfigBuilder implements IConfigBuilder {
	public abstract void buildPolicyFilters();
	public abstract void buildRole();
}
