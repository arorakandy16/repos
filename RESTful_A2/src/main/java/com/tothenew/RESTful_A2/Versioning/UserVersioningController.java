package com.tothenew.RESTful_A2.Versioning;

//Ques 10. Create 2 API for showing user details.The first api should return only
//          basic details of the user and the other API should return more/enhanced details of the user,
//      Now apply versioning using the following methods:
//        MimeType Versioning
//        Request Parameter versioning
//        URI versioning
//        Custom Header Versioning

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserVersioningController {

    //MimeType or Produces Versioning
    @GetMapping(value = "/User/produces",produces = "application/vnd.company.app-v1+json")
    public UserV1 producesV1(){
        return new UserV1("Kandy Arora");

    }

    @GetMapping(value = "/User/produces",produces = "application/vnd.company.app-v2+json")
    public UserV2 producesV2(){
        return new UserV2(new Name("Kandy","Arora"));
    }




    //Request Parameter Versioning

    @GetMapping(value = "User/param",params = "version=1")
    public UserV1 paramV1(){
        return new UserV1("Kandy Arora");
    }
    @GetMapping(value = "User/param",params = "version=2")
    public UserV2 param2(){
        return new UserV2(new Name("Kandy","Arora"));
    }



    //URI versioning

    @GetMapping("v1/User")
    public UserV1 userV1(){
        return new UserV1("Kandy Arora");
    }
    @GetMapping("/v2/User")
    public UserV2 userV2(){
        return new UserV2(new Name("Kandy","Arora"));
    }



    //Custom Header Versioning

    @GetMapping(value = "/User/header",headers = "X-API-VERSION=1")
    public UserV1 headerV1(){
        return new UserV1("Kandy Arora");

    }

    @GetMapping(value = "/User/header",headers = "X-API-VERSION=2")
    public UserV2 headerV2(){
        return new UserV2(new Name("Kandy","Arora"));
    }

}