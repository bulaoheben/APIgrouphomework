package com.up.stores.mapper;

import com.up.stores.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMapperTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void findHotList() {
        List<Product> list = productMapper.findHotList();
        System.out.println("count=" + list.size());
        for (Product item : list) {
            System.out.println(item);
        }
    }

    @Test
    public void findById() {
        Integer id = 10000017;
        Product result = productMapper.findById(id);
        System.out.println(result);
    }

    @Test
    public void findByName() {
        List<Product> result = productMapper.findByName("联想");
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
