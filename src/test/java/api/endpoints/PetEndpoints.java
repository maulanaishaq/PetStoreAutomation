package api.endpoints;

import static io.restassured.RestAssured.given;


import api.payload.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEndpoints {


    public static Response createPet(Pet payload){

        Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.post_pet);

        return response;

    }


    public static Response readPet(int petId){

        Response response = given().pathParam("petId", petId)
                .when().get(Routes.get_petById);

        return response;

    }


    public static Response updatePet(Pet payload) {
        Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(payload)
                .when()
                .put(Routes.put_pet);
        return response;
    }


    public static Response deletePet(int petId){
        Response response = given().pathParam("petId" , petId)
                .when()
                .delete(Routes.delete_petById);

        return response;
    }



}
