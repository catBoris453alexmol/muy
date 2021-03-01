package ru.sapteh.service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.sapteh.dao.DAO;
import ru.sapteh.entity.Client;
import ru.sapteh.entity.ClientService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ClientDaoImpTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void lastDateTest(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        DAO<Client, Integer> clientDaoImpl = new ClientDaoImp(factory);
        List<Client> clients = clientDaoImpl.findByAll();
        for (Client client : clients){
            List<ClientService> collect = new ArrayList<>(client.getClientServiceSet());
            if(collect.size() != 0) {
                Date startTime = collect.stream().max(Comparator.comparing(ClientService::getStartTime)).get().getStartTime();
                System.out.println(startTime);
            }

        }
//        System.out.println(clientDaoImpl.findByAll());
    }

    @Test
    public void create() {




    }

    @Test
    public void findById() {
    }

    @Test
    public void findByAll() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}