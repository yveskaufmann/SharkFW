package net.sharkfw.asip;

import net.sharkfw.kep.SharkStub;
import net.sharkfw.knowledgeBase.Knowledge;
import net.sharkfw.knowledgeBase.LASPSpace;
import net.sharkfw.peer.SharkEngine;
import net.sharkfw.protocols.StreamConnection;

/**
 * Objects of this class are result of the scanning process
 * of imcomming messages from underlying protocols
 * @author thsc
 */
public class ASIPInMessage extends ASIPMessage {
    private final SharkEngine se;
    private final StreamConnection con;
    private final SharkStub sharkStub;
    
    ASIPInMessage(SharkEngine se, StreamConnection con, SharkStub sharkStub) {
        this.se = se;
        this.con = con;
        this.sharkStub = sharkStub;
    }
    
    public Knowledge getKnowledge() {
        // TODO
        return null;
    }
    
    public LASPSpace getInterest() {
        return null; // TODO
    }
}