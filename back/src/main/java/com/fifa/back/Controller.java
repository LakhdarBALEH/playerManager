package com.fifa.back;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class Controller {


    @GetMapping("players")
    List<Player> getALlPlayers() {


        List players = Lists.newArrayList();

        Player player1 = Player.builder()
                .id(1L)
                .nom("chikhi")
                .prenom("massine").build();



        players.add(player1);

        return players;


    }


}
