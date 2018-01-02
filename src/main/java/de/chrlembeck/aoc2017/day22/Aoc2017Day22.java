package de.chrlembeck.aoc2017.day22;

import java.util.Scanner;

import de.chrlembeck.aoccommon.AbstractAocBase;
import de.chrlembeck.aoccommon.BidirectionalGrowingArray;

public class Aoc2017Day22 extends AbstractAocBase {

    public static void main(final String[] args) {
        new Aoc2017Day22().run();
    }

    @Override
    public Integer part1(final Scanner input) {
        BidirectionalGrowingArray<BidirectionalGrowingArray<Boolean>> array = new BidirectionalGrowingArray<>(BidirectionalGrowingArray[]::new);

        return null;
    }

    @Override
    public String part2(final Scanner input) {
        return null;
    }

    @Override
    public String getInputLocation(final int part) {
        return "/input/aoc2017/aoc2017day22.txt";
    }
}