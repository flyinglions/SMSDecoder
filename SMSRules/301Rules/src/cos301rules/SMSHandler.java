package cos301rules;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Orion
 */
public class SMSHandler {

    private RuleBuilder ruleBuild = new RuleBuilder();
    private static int currentLocation = 0;
    private Rule[] ruleList = null;
    private String[] valueArray = null;
    private String[] realValue = null;
    private int messageSize = 0;
    private String smsString = "";

    public void recieveSMS(String inSms) throws IOException {
        System.out.println(messageSize);
        smsString = inSms;
        ruleBuild.ruleParser();
        messageSize = ruleBuild.getRuleLeng();
        ruleList = ruleBuild.getRuleList();
        valueArray = ruleBuild.getValueArray();
        realValue = new String[messageSize];

        for (int y = 0; y < messageSize; y++) {
            this.parseSMS(y);
        }

        System.out.println("\n\n" + this);
    }

    private int rulesSize(String inMessage) throws IOException {
        int result = 0;

        Scanner lineScanner = new Scanner(inMessage);
        lineScanner.useDelimiter(" ");

        while (lineScanner.hasNext()) {
            result += 1;
            lineScanner.next();
        }
        return result;
    }

    private void parseSMS(int where) {
        realValue[where] = ruleList[where].doRule(smsString, currentLocation);
    }

    public static void setStart(int start) {
        start += 1;
        currentLocation += start;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();

        for (int y = 0; y < messageSize; y++) {
            
            returnString.append(realValue[y]).append(" -- ").append(valueArray[y]).append("\n");
        }
        return returnString.toString();
    }
    
    	
}
