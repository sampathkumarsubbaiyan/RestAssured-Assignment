package org.example.JsonData;

import io.restassured.path.json.JsonPath;

public class ReadJson {

    public static JsonPath getJson() {
        String format = "{\n" +
                "  \"name\": \"Royal Challengers Bangalore\",\n" +
                "  \"location\": \"Bangalore\",\n" +
                "  \"player\": [\n" +
                "    {\n" +
                "      \"name\": \"Faf Du Plessis\",\n" +
                "      \"country\": \"South Africa\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"7\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Virat Kohli\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"15\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Glenn Maxwell\",\n" +
                "      \"country\": \"Australia\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"11\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Mohammad Siraj\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Harshal Patel\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"10.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Wanindu Hasaranga\",\n" +
                "      \"country\": \"Srilanka\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"10.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Dinesh Karthik\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Wicket-keeper\",\n" +
                "      \"price-in-crores\": \"5.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Shahbaz Ahmed\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"All-Rounder\",\n" +
                "      \"price-in-crores\": \"2.4\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Rajat Patidar\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"0.20\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Josh Hazlewood\",\n" +
                "      \"country\": \"Australia\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Mahipal Lomror\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7.75\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        JsonPath jsonPath = new JsonPath(format);
        return jsonPath;


    }

}
