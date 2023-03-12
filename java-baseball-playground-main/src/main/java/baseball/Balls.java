package baseball;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public static List<Ball> generateComputerBalls() {
        AtomicInteger index = new AtomicInteger();
        return NumbersGenerator.generate().stream().map(
                number -> new Ball(index.getAndIncrement(), number)
        ).collect(Collectors.toList());
    }

    public static List<Ball> generateUserBalls(List<Integer> inputs) {
        AtomicInteger index = new AtomicInteger();
        return inputs.stream().map(
                number -> new Ball(index.getAndIncrement(), number)
        ).collect(Collectors.toList());
    }

    public boolean isStrike(Ball ball) {
        return this.balls.stream()
                .anyMatch(b -> b.equals(ball));
    }

    public boolean isNothing(Ball ball) {
        return this.balls.stream()
                .noneMatch(b -> b.isSameNumber(ball));
    }

    public boolean isBall(Ball ball) {
        if (isStrike(ball)) {
            return false;
        }
        return this.balls.stream()
                .anyMatch(b -> b.isSameNumber(ball));
    }


    public PlayResult play(List<Integer> inputs) {
        return new PlayResult(mapTo(generateUserBalls(inputs)));
    }

    private Map<BaseBallStatus, Integer> mapTo(List<Ball> balls) {
        Map<BaseBallStatus, Integer> map = new HashMap<>();
        map.put(BaseBallStatus.BALL, 0);
        map.put(BaseBallStatus.STRIKE, 0);

        balls.forEach(ball -> plusCount(map, ball));

        return map;
    }

    private void plusCount(Map<BaseBallStatus, Integer> map, Ball ball) {
        if (this.isBall(ball)) {
            map.put(BaseBallStatus.BALL, map.getOrDefault(BaseBallStatus.BALL, +0) + 1);
            return;
        }
        if (this.isStrike(ball)) {
            map.put(BaseBallStatus.STRIKE, map.getOrDefault(BaseBallStatus.STRIKE, +0) + 1);
            return;
        }
    }
}
