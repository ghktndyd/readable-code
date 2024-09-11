package cleancode.minesweeper.tobe.cell;

public interface Cell {

    boolean isLandMine();

    boolean hasLandMineCount();

    CellSnapshot getSnapshot();

    boolean isOpened();

    boolean isChecked();

    void flag();

    void open();
}
