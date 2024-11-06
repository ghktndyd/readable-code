package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.minesweeper.Minesweeper;
import cleancode.minesweeper.tobe.minesweeper.config.GameConfig;
import cleancode.minesweeper.tobe.minesweeper.gamelevel.Advanced;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleOutputHandler;

public class GameApplication {
    public static void main(String[] args) {

        GameConfig gameConfig = new GameConfig(new Advanced(), new ConsoleInputHandler(), new ConsoleOutputHandler());

        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }

    /**
     * DIP (Dependency Inversion Principle)
     * <p>
     * DI: (Dependency Injection), DI를 생각하면 항상 숫지 3이 떠올라야 한다.
     * 왜냐하면 A가 B가 필요할 때 이 둘만으로는 못 한다.
     * 제 3자가 항상 의존성을 주입해 주어야 한다.
     * 스프링에서는 IoC Container 가 한다.
     * <p>
     * IoC: (Inversion of Control)
     *
     */

}
