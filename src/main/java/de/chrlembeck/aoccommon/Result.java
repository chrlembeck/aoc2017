package de.chrlembeck.aoccommon;

public class Result<T> {

    private final T part1;

    private final T part2;

    public Result(final T part1, final T part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    public T getPart1() {
        return part1;
    }

    public T getPart2() {
        return part2;
    }

    @Override
    public String toString() {
        return "Result [part1=" + part1 + ", part2=" + part2 + "]";
    }
}