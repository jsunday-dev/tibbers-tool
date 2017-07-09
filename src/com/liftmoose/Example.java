package com.liftmoose;
import java.util.Map;
import net.rithms.riot.constant.Region;
import net.rithms.riot.dto.Summoner.Summoner;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
//import com.google.gson*;

public class Example {

    public static void main(String[] args) throws RiotApiException {

        RiotApi api = new RiotApi("RGAPI-21a8e633-320e-4cff-8250-4d6bee7deb16");

        Map<String, Summoner> summoners = api.getSummonersByName(Region.NA, "" +
                "rithms, tryndamere, sgtmoose");
        Summoner summoner = summoners.get("sgtmoose");
        String name = summoner.getName();
        System.out.println(name);
    }

}