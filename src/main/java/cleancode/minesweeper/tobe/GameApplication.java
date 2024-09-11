package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.gamelevel.VeryBeginner;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;

public class GameApplication {
    public static void main(String[] args) {
        GameLevel gameLevel = new VeryBeginner();
        ConsoleInputHandler consoleInputHandler = new ConsoleInputHandler();
        ConsoleOutputHandler consoleOutputHandler = new ConsoleOutputHandler();

        Minesweeper minesweeper = new Minesweeper(gameLevel, consoleInputHandler, consoleOutputHandler);
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
