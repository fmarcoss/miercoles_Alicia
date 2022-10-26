package com.nttdata.bootcamp.gateway;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

@Configuration
public class Filters {
	private static Logger log = LoggerFactory.getLogger(Filters.class);

	@Bean
	@Order(-1)
	public GlobalFilter a() {
		return (exchange, chain) -> {
			log.info("first pre filtre");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("third post filter");
			}));

		};
	}

	@Bean
	@Order(0)
	public GlobalFilter b() {
		return (exchange, chain) -> {
			log.info("second pre filtre");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("second post filter");
			}));

		};
	}

	@Bean
	@Order(-1)
	public GlobalFilter c() {
		return (exchange, chain) -> {
			log.info("third pre filtre");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("first post filter");
			}));

		};
	}

}
