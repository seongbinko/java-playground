package baseball;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PlayResult {

    private final Map<BaseBallStatus, Integer> playResult;

    public PlayResult(Map<BaseBallStatus, Integer> playResult) {
        this.playResult = playResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayResult that = (PlayResult) o;
        return Objects.equals(playResult, that.playResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playResult);
    }
}
