package com.graphqlspringboot;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello(){
        return "Hello GraphQl";
    }

    public int soma(int a, int b){
        return a+b;
    }

    public Client client(){
        return new Client(1L, "Jackson", "jk@gmail.com");
    }

    public List<Client> clients(){
        List<Client> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(new Client(2L,"Client", "jk"+i+"gmail.com"));
        }
        return list;
    }
}
