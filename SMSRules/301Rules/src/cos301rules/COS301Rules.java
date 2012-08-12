/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cos301rules;

import java.io.IOException;

/**
 *
 * @author Orion
 */
public class COS301Rules {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /*w*/ //String smsSimulation    = "Absa: SPR 9437, Onttrek, 04/07/12 PTA RASC - OTM ONTTREKKING, R-100.00, Saldo R3,657.90. Hulp 0860008600; VDWALPG043";
       /*w*/ //String smsSimulation     = "Absa: SPR 9437, Onttrek, 29/06/12 PTA RASC - OTM ONTTREKKING,  R-100.00, Saldo R4,354.80. Hulp 0860008600; VDWALPG043"; 
       /*w*///String smsSimulation      = "Absa: SPR 9437, Dep,     31/01/12 SETTLEMENT/C - INTERNET BETALING KREDIET, ABSA BANK sakgeld, R1,000.00, Saldo R1,323.79 Hulp 0860008600; VDWALPG043";
       /*w*///String smsSimulation      = "Absa: SPR 9437, Onttrek, 29/06/12 PTA RASC - OTM ONTTREKKING,  R-100.00, Saldo R4,354.80. Hulp 0860008600; VDWALPG043";     
       /*w*/ //String smsSimulation     = "Absa: SPR 9437, Aank, 29/06/12 SETTLEMENT/C - POS AANKOPE, P4ft0N131263 SPAR ZAMBESI, R-163.19, Saldo R4,459.75. Hulp 0860008600; VDWALPG043";
       /*w*/// String smsSimulation     = "Absa: SPR 9437, Aank, 03/07/12 SETTLEMENT/C - POS AANKOPE, C32665220001 BUILDERS WAR, R-385.90, Saldo R3,807.45. Hulp 0860008600; VDWALPG043";
       /*w*/ //String smsSimulation     = "Absa: SPR 9437, Aank, 02/07/12 SETTLEMENT/C - POS AANKOPE, P0BFY9510670 EXTREME WARG, R-255.00, Saldo R4,207.00. Hulp 0860008600; VDWALPG043";
       /*w*/// String smsSimulation     = "Absa: SPR 9437, Dep, 29/02/12 SETTLEMENT/C - INTERNET BETALING KREDIET, ABSA BANK sakgeld, R1,000.00, Saldo R2,155.03 Hulp 0860008600; VDWALPG043";
       /*w*///String smsSimulation      = "Absa: SPR 9437, Bet, 06/02/12 SETTLEMENT/C - INTERNET BETALING DEBIET, ABSA BANK Marc Allen Games, R-360.00, Saldo R227.08. Hulp 0860008600; VDWALPG043";
       /*w*/ //String smsSimulation     = "Absa: SPR 9437, Terug, 29/02/12 PTA RASC - OTM ONTTREKKING KORREKSIE, R100.00, Saldo R2,155.03. Hulp 0860008600; VDWALPG043";
      String smsSimulation      = "Absa: SPR 9437, Gesk, 30/12/11 DIREKTE DEBIET, DEAGOSTINI-4X000500, R-199.90, Saldo R93.85. Hulp 0860008600; VDWALPG043";
       // String smsSimulation = "Absa: SPR 9437, Bet, 20/06/12 SETTLEMENT/C - INTERNET BETALING DEBIET, ABSA BANK GK betaling, R-900.00, Saldo R1,671.33. Hulp 0860008600; VDWALPG043";
        SMSHandler smsHand = new SMSHandler();
        smsHand.recieveSMS(smsSimulation);

        
     /*   String smsSimulation = "Absa: SPR 9437, Bet, 20/06/12 SETTLEMENT/C - INTERNET BETALING DEBIET, ABSA BANK GK betaling, R-900.00, Saldo R1,671.33. Hulp 0860008600; VDWALPG043";
       SMSHandler smsHand = new SMSHandler();
       smsHand.recieveSMS(smsSimulation);*/
       
       System.out.println(smsHand.toString());
       
       String smsSimulation2 = "Absa: SPR 9437, Bet, 20/06/12 SETTLEMENT/C - INTERNET BETALING DEBIET, ABSA BANK GK betaling, R-900.00, Saldo R1,671.33. Hulp 0860008600; VDWALPG043";
       SMSHandler smsHand2 = new SMSHandler();
       smsHand2.recieveSMS(smsSimulation2);
       
       System.out.println(smsHand2.toString());
 

    }
}
