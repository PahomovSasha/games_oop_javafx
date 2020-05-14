package job4j.tictactoe;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class Logic3TTest {

    @Test
    public void whenXNotFill() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(false));
    }

    @Test
    public void whenONotFill() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(false));
    }

    @Test
    public void whenHasXOneHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXTwoHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXThreeHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasOOneHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOTwoHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOThreeHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T(false, true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasXOneVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXTwoVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXThreeVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasOOneVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOTwoVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOThreeVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasXDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasODiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasXBackDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasOBackDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasXWinnerDiagAndVert() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasOWinnerDiagAndVert() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(), new Figure3T(false, true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasGas() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.hasGap(), is(true));
    }

    @Test
    public void whenNoGas() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(false, true), new Figure3T(true, false)},
                {new Figure3T(true, false), new Figure3T(false, true), new Figure3T(false, true)},
                {new Figure3T(false, true), new Figure3T(true, false), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.hasGap(), is(false));
    }
}
