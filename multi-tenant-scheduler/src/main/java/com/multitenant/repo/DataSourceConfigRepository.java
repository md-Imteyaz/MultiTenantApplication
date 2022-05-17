package com.multitenant.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multitenant.config.DataSourceConfig;

public interface DataSourceConfigRepository extends JpaRepository<DataSourceConfig, Long> {
	DataSourceConfig findByName(String name);
}
