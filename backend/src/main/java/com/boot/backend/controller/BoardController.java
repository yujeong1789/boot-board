package com.boot.backend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
public class BoardController {

    @GetMapping("/list")
    public List<Map<String, Object>> home() {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("no", 123);
        map1.put("writer", "홍길동");
        map1.put("title", "title");
        map1.put("regdate", "2023-06-05");
        map1.put("view", "10");
        list.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("no", 777);
        map2.put("writer", "고길동");
        map2.put("title", "test title");
        map2.put("regdate", "2023-06-05");
        map2.put("view", "1");
        list.add(map2);

        return list;
    }
}
