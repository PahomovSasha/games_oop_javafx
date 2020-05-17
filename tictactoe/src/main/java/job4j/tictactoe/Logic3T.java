package job4j.tictactoe;

import java.util.Arrays;
import java.util.function.Predicate;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    /**
     * Метод проверяет выигрышные комбинации
     *
     * @param predicate проверка Крестика или Нолика
     * @param startX начальная точка по горизонтали
     * @param startY начальная точка по вертикали
     * @param deltaX движение по горизонтали
     * @param deltaY движение по вертикали
     * @return если выигрышные комбинации есть - true, иначе false;
     */
    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод вызывает проверку выигрышных комбинации для Крестика
     *
     * @return если выигрышные комбинации есть - true, иначе false;
     */
    public boolean isWinnerX() {
        return this.isWin(Figure3T::hasMarkX);
    }

    /**
     * Метод вызывает проверку выигрышных комбинации для Нолика
     *
     * @return если выигрышные комбинации есть - true, иначе false;
     */
    public boolean isWinnerO() {
        return this.isWin(Figure3T::hasMarkO);
    }

    /**
     * Метод вызывает проверки на выигрыш по диагонали и вертикали/горизонтали
     *
     * @param predicate проверка Крестика или Нолика
     * @return Если имеется выигрыш по диагонали или вертикали/горизонтали - true, иначе false
     */
    public boolean isWin(Predicate<Figure3T> predicate) {
        return this.isWinDiagonal(predicate) ||
                this.isWinVerticalAndHorizontal(predicate);
    }

    /**
     * Метод вызывает проверки выигрыша по диагонали
     *
     * @param predicate проверка Крестика или Нолика
     * @return Если имеется выигрыш по диагонали - true, иначе false
     */
    public boolean isWinDiagonal(Predicate<Figure3T> predicate) {
        return this.fillBy(predicate, 0, 0, 1, 1) ||
                this.fillBy(predicate, this.table.length - 1, 0, -1, 1);
    }

    /**
     * Метод вызывает проверки выигрыша по горизонтали и вертикали
     *
     * @param predicate проверка Крестика или Нолика
     * @return Если имеется выигрыш по горизонтали или вертикали - true, иначе false
     */
    public boolean isWinVerticalAndHorizontal(Predicate<Figure3T> predicate) {
        boolean rst = false;
        for (int i = 0; i < this.table.length; i++) {
            if (this.fillBy(predicate, i, 0, 0, 1)) {
                rst = true;
                break;
            }
            if (this.fillBy(predicate, 0, i, 1, 0)) {
                rst = true;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод проверяет, если ли пустые клетки для новых ходов
     *
     * @return если пустые клетки есть - true, иначе false
     */
    public boolean hasGap() {
        return Arrays.stream(this.table)
                .flatMap(Arrays::stream)
                .anyMatch(figure3T -> !figure3T.hasMarkO() && !figure3T.hasMarkX());
    }
}
