import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void shouldFindSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindCountMonthsHigherAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long expected = 5;
        long actual = service.countMonthsHigherAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindCountMonthsLowerAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long expected = 5;
        long actual = service.countMonthsLowerAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
