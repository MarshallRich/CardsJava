package com.theironyard;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by MacLap on 3/28/16.
 */
public class MainTest {
    @Test
    public void testCreateDeck(){
        HashSet<Card> deck = Main.createDeck();

        Assert.assertTrue(deck.size() == 52);
    }
}