package de.chrlembeck.aoc2016;

import static de.chrlembeck.aoccommon.TestUtils.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import de.chrlembeck.aoc2016.day23.Aoc2016Day23;

@RunWith(JUnitPlatform.class)
public class Aoc2016Day23Test {

    @Test
    public void test1() {
        final Aoc2016Day23 day = new Aoc2016Day23();
        assertEquals("", test("", day::part1));
        assertEquals("", test("", day::part1));
        assertEquals("", test("", day::part1));
        assertEquals("", test("", day::part1));
        assertEquals("", test("", day::part1));
        assertEquals("", test(day.getInput1(), day::part1));
    }

    @Test
    public void test2() {
        final Aoc2016Day23 day = new Aoc2016Day23();
        assertEquals("", test("", day::part2));
        assertEquals("", test("", day::part2));
        assertEquals("", test(day.getInput2(), day::part2));
    }
}