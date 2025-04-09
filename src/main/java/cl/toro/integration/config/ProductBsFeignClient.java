package cl.toro.integration.config;


import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "ms-toro-bs", url = "http://localhost:8082")
public interface ProductBsFeignClient {

}
