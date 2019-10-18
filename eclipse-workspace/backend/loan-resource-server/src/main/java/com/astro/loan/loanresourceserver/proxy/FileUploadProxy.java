package com.astro.loan.loanresourceserver.proxy;


import com.astro.loan.loanresourceserver.config.SwaggerConfig;
import com.astro.loan.loanresourceserver.controller.LoanController;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;


@FeignClient(name = "instant-loan-api-gateway",url = "localhost:8084/loan-file-upload",configuration = {FileUploadProxy.MultipartSupportConfig.class})
public interface FileUploadProxy {

    @PostMapping(value = "/upload/documents/update",consumes = {"multipart/form-data"})
     String update(@RequestParam("phonenumber") String phonenumber, @RequestPart(value = "file", required = true) MultipartFile...file);

    @PostMapping(value = "/upload/documents/save",consumes = {"multipart/form-data"})
     String upload(@RequestParam("phonenumber") String phonenumber, @RequestPart(value = "file", required = true) MultipartFile...file);

    //@RequestMapping("/upload/test")
    // String test();

    /*@RequestMapping("/upload/demo")
    String demo(@PathVariable(value = "bankStatement") MultipartFile bankStatement);*/

     static final Logger logger = LoggerFactory.getLogger(FileUploadProxy.class);

     class MultipartSupportConfig {
       /* @Bean
        @Primary
        @Scope("prototype")
        public Encoder feignFormEncoder() {

            return new SpringFormEncoder();
        }*/
       @Autowired
       private ObjectFactory<HttpMessageConverters> messageConverters;

         @Bean
         public Encoder feignFormEncoder () {
             return new SpringFormEncoder(new SpringEncoder(messageConverters));
         }
    }
}
