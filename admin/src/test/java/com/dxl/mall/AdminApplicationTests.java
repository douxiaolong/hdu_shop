package com.dxl.mall;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class AdminApplicationTests {

    @Test
    void contextLoads() {
        List<String> list = new ArrayList<String>();
        list.add("djk");
        list.add("djk1");
        list.add("djk12");
        list.add("djk123");
        List<String> list3 = new ArrayList<String>();
        list3 = list.stream().filter(item->!item.equals("djk")).collect(Collectors.toList());
        list3.stream().forEach(item->{System.out.println(item);});
    }

}
