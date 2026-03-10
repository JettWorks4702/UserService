package com.project.userservice.deserializer;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.userservice.entities.UserInfoDTO;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class UserInfoDeserializer implements Deserializer<UserInfoDTO> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // intentionally left blank
    }

    @Override
    public UserInfoDTO deserialize(String arg0, byte[] arg1){
        ObjectMapper mapper = new ObjectMapper();
        UserInfoDTO user = null;
        try {
            user = mapper.readValue(arg1, UserInfoDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }



    @Override
    public void close() {
        // intentionally left blank
    }


}
