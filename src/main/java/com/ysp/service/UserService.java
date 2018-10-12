package com.ysp.service;

import com.ysp.dao.ClientDao;
import com.ysp.entity.Client;
import com.ysp.entity.ClientExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserService {
    @Autowired
    ClientDao clientDao;

    public int login(Client client){
        ClientExample clientExample = new ClientExample();
        ClientExample.Criteria criteria = clientExample.createCriteria();
        criteria.andNameEqualTo(client.getName())
                .andPwdEqualTo(client.getPwd());
        List<Client> result = clientDao.selectByExample(clientExample);
        if(result!=null){
            return 1;
        }else {
            return 0;
        }

    }
}
