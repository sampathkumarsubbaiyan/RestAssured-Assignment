package org.example;

import io.restassured.path.json.JsonPath;
import org.example.JsonData.ReadJson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validatingData {

    JsonPath data = ReadJson.getJson();

   @Test
    public void foreignPlayerValidation(){

       int ForeignPlayerCount=0;
       for(int i = 0 ; i<(data.getInt("player.size()"));i++){
           if(!data.getString("player["+i+"].country").equalsIgnoreCase("India")){
               ForeignPlayerCount++;
           }
       }
       Assert.assertEquals(ForeignPlayerCount,4);
   }

   @Test
    public void keeperValidation(){
       Boolean wicketKeeper=false;
       for(int i=0;i<(data.getInt("player.size()"));i++){
           if(data.getString("player["+i+"].role").equals("Wicket-keeper")){
               wicketKeeper=true;
               break;
           }
       }
       Assert.assertTrue(wicketKeeper);
   }
}
