package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void Position(){
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell rsl = bishopBlack.position();
        assertThat(rsl, is(Cell.C1));
    }

    @Test
    public void Copy(){
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure rsl = bishopBlack.copy(Cell.C1);
        assertThat(rsl.position(), is(Cell.C1));
    }

    @Test
    public void WayDiagonal(){
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] cells = new Cell[] {Cell.D7, Cell.E6, Cell.F5, Cell.G4, Cell.H3};
        Cell[] rsl = bishopBlack.way(Cell.C8, Cell.H3);
        assertThat(rsl, is(cells));
    }

    @Test (expected = IllegalStateException.class)
    public void WayNoDiagonal(){
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] cells = new Cell[] {Cell.D7, Cell.E6, Cell.F5, Cell.G4, Cell.H3};
        Cell[] rsl = bishopBlack.way(Cell.C8, Cell.H2);
        assertThat(rsl, is(cells));
    }

}
