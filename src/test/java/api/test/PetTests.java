package api.test;

import api.endpoints.PetEndpoints;
import api.payload.Pet;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PetTests {

    Faker faker;
    Pet petPayload;

    public Logger logger; // for logs

    @BeforeClass
    public void setup()
    {
        faker = new Faker();
        petPayload = new Pet();

        petPayload.setId(faker.idNumber().hashCode());
        petPayload.setCategoryId(3);
        petPayload.setCategoryName("Rakun");
        petPayload.setPetName("Kucing Gemoy");
        petPayload.setPhotoUrl("https://friendsofsfacc.org/wp-content/uploads/2023/04/BoboAdopted-768x1024-1-e1682473880215.jpg");
        petPayload.setTagsId(5);
        petPayload.setTagsName("Animal");
        petPayload.setStatus("available");


        //logs
        logger= LogManager.getLogger(this.getClass());

        logger.debug("debugging.....");

    }


    @Test
    public void test_createPet(){

        Response response = PetEndpoints.createPet(petPayload);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);

    }


    @Test
    public void test_GetPet(){
        Response response = PetEndpoints.readPet(12);
        response.then().log().all();


        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test
    public void test_updatePet(){

        petPayload.setId(12);
        petPayload.setCategoryId(2);
        petPayload.setCategoryName("Animal Air");
        petPayload.setPetName("Chiko");
        petPayload.setPhotoUrl("https://www.istockphoto.com/id/foto/latar-belakang-teknologi-jaringan-kota-neon-metaverse-gm1423001324-468118972");
        petPayload.setTagsId(32);
        petPayload.setTagsName("Testing Update");
        petPayload.setStatus("sold");



        Response response = PetEndpoints.updatePet(petPayload);
        response.then().log().all();


        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test
    public void test_deletePet(){
        Response response = PetEndpoints.deletePet(5);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);

    }






}
