package test.java.com.liftmoose.tibbers;
import junit.framework.Assert;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.constant.Region;
import net.rithms.riot.dto.Summoner.Summoner;
import org.junit.Test;

import java.util.Map;

public class ExampleTest {

    @Test
    public void testPrintMoose() throws RiotApiException {
        RiotApi api = new RiotApi("RGAPI-21a8e633-320e-4cff-8250-4d6bee7deb16");
        Map<String, Summoner> summoners = api.getSummonersByName(Region.NA, "rithms, tryndamere");
        com.liftmoose.tibbers.Example.printMoose(summoners);
    }

}
