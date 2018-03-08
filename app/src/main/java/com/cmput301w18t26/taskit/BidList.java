package com.cmput301w18t26.taskit;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by kevingordon on 2018-02-26.
 */

public class BidList {

    private ArrayList<Bid> bids = new ArrayList<Bid>();
    public void addBid(Bid bid) {
        bids.add(bid);
    }

    public boolean hasBid(Bid bid) {
        if (getIndex(bid) > -1) {
            return true;
        } else {
            return false;
        }
    }

    public int getIndex(Bid bid) {
        for (int i=0; i<bids.size(); i++) {
            if (getBid(i).getUUID().equals(bid.getUUID())) {
                return i;
            }
        }
        return -1;
    }

    public Bid getBid(int index) {
        return bids.get(index);
    }

    public Bid getBid(Bid bid) {
        return bids.get(getIndex(bid));
    }

    public void deleteBid(Bid bid) {
        bids.remove(bid);
    }

    public int getBidCount() {
        return bids.size();
    }

    public void addAll(Collection<Bid> l) {
        bids.addAll(l);
    }
}
