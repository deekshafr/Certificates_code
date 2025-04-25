package Ecotest;

import Ecobase.Authservice;
import Ecobase.Profilemanagement;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import request.Loginrequest;
import response.Loginresponse;
import response.Profilemanagementres;

public class getprofilerequest {
    @Test
    public void Getinfo(){
        Authservice authservice=new Authservice();
        Response response =authservice.login(new Loginrequest("uday1234","uday12345"));
       Loginresponse loginresponse= response.as(Loginresponse.class);
       System.out.println(loginresponse.getToken());
        Profilemanagement profilemanagement=new Profilemanagement();
       response= profilemanagement.getprofile(loginresponse.getToken());
//       System.out.println(response.asPrettyString());
        Profilemanagementres profilemanagementres =response.as(Profilemanagementres.class);
        System.out.println(profilemanagementres.getUsername());

//        Profilemanagementres profilemanagementres =response.as(Profilemanagementres.class);
        System.out.println(profilemanagementres.getLastname());
        System.out.println(profilemanagementres.getMobile());


    }
}
