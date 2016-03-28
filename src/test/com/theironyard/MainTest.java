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

    @Test
    public void testCreateHands(){
        HashSet<Card> deck = Main.createDeck();
        HashSet<HashSet<Card>> hands = Main.createHands(deck);

        Assert.assertTrue(hands.size() == 270725);
    }

    @Test
    public void testIsFlush(){
        HashSet<Card> testHand = new HashSet<>();
        Card c1 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card c2 = new Card(Card.Rank.TWO, Card.Suit.CLUBS);
        Card c3 = new Card(Card.Rank.THREE, Card.Suit.CLUBS);
        Card c4 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        testHand.add(c1);
        testHand.add(c2);
        testHand.add(c3);
        testHand.add(c4); //added test hand

        Assert.assertTrue(Main.isFlush(testHand));
    }

    @Test
    public void testIsStraight(){
        HashSet<Card> testHand = new HashSet<>();
        Card c1 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card c2 = new Card(Card.Rank.TWO, Card.Suit.CLUBS);
        Card c3 = new Card(Card.Rank.THREE, Card.Suit.CLUBS);
        Card c4 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        testHand.add(c1);
        testHand.add(c2);
        testHand.add(c3);
        testHand.add(c4); //added test hand

        Assert.assertTrue(Main.isStraight(testHand));
    }

    @Test
    public void testIsStraightFlush(){
        HashSet<Card> testHand = new HashSet<>();
        Card c1 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card c2 = new Card(Card.Rank.TWO, Card.Suit.CLUBS);
        Card c3 = new Card(Card.Rank.THREE, Card.Suit.CLUBS);
        Card c4 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        testHand.add(c1);
        testHand.add(c2);
        testHand.add(c3);
        testHand.add(c4); //added test hand

        Assert.assertTrue(Main.isStraightFlush(testHand));
    }

    @Test
    public void testIsFourOfKind(){
        HashSet<Card> testHand = new HashSet<>();
        Card c1 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card c2 = new Card(Card.Rank.ACE, Card.Suit.SPADES);
        Card c3 = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
        Card c4 = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
        testHand.add(c1);
        testHand.add(c2);
        testHand.add(c3);
        testHand.add(c4); //added test hand

        Assert.assertTrue(Main.isFourOfKind(testHand));
    }

    @Test
    public void testIsThreeOfKind(){
        HashSet<Card> testHand = new HashSet<>();
        Card c1 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card c2 = new Card(Card.Rank.ACE, Card.Suit.SPADES);
        Card c3 = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
        Card c4 = new Card(Card.Rank.TWO, Card.Suit.HEARTS);
        testHand.add(c1);
        testHand.add(c2);
        testHand.add(c3);
        testHand.add(c4); //added test hand

        Assert.assertTrue(Main.isThreeOfKind(testHand));
    }

    @Test
    public void testIsTwoPair(){
        HashSet<Card> testHand = new HashSet<>();
        Card c1 = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card c2 = new Card(Card.Rank.ACE, Card.Suit.SPADES);
        Card c3 = new Card(Card.Rank.TWO, Card.Suit.DIAMONDS);
        Card c4 = new Card(Card.Rank.TWO, Card.Suit.HEARTS);
        testHand.add(c1);
        testHand.add(c2);
        testHand.add(c3);
        testHand.add(c4); //added test hand

        Assert.assertTrue(Main.isTwoPair(testHand));
    }
}