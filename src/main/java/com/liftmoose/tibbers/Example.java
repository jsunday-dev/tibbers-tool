package com.liftmoose.tibbers;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.dto.Summoner.Summoner;

import java.util.Map;
//import com.google.gson*;

public class Example {

	public static void main(String[] args) throws RiotApiException {

	}

	public static void printMoose(Map<String, Summoner> sum) {
		Summoner summoner = sum.get("rithms");
		long id = summoner.getId();
		System.out.println(id);
	}

}
    
