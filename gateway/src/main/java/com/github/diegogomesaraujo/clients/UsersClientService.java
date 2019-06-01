package com.github.diegogomesaraujo.clients;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.diegogomesaraujo.clients.dto.User;

@RibbonClient(name = "internal-service.default.svc.cluster.local")
@FeignClient(
		name = "internal-service.default.svc.cluster.local", 
		url = "http://internal-service.default.svc.cluster.local:8080",
		path = "/v1/users")
public interface UsersClientService {
	
	@GetMapping("/{id}")
	User findByid(@PathVariable("id") Long id);
	
}
