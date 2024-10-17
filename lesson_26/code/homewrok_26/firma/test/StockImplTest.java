package homewrok_26.firma.test;

import homewrok_26.firma.dao.Stock;
import homewrok_26.firma.dao.StockImpl;
import homewrok_26.firma.model.Detail;
import homewrok_26.firma.model.Gear;
import homewrok_26.firma.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StockImplTest {

    Stock stock;
    Detail[] det;

    @BeforeEach
    void setUp() {
        stock = new StockImpl(5);
        det = new Detail[4];
        det[0] = new Gear(456657475, 10, "M0", "N1", 2.5, 5, 6);
        det[1] = new Gear(254474775, 16, "M1", "N2", 4.5, 8, 4);
        det[2] = new Lever(356655666, 5, "M2", "N3", 6, 5);
        det[3] = new Lever(455600000, 12, "M3", "N4", 5, 10);

    }

    @Test
    void testAddDetail() {
        assertTrue(stock.addDetail(det[0]));  // Проверяем добавление детали
        assertEquals(det[0], stock.findDetail(456657475));  // Проверяем, что деталь добавлена
    }

    @Test
    void testFindDetail() {
        stock.addDetail(det[1]);
        assertEquals(det[1], stock.findDetail(254474775)); // Проверяем нахождение детали
    }

    @Test
    void testUpdateDetail() {
        stock.addDetail(det[2]);
        Detail updatedDetail = new Gear(356655666, 8, "UpdatedM2", "UpdatedN3", 7, 5, 6);
        stock.updateDetail(updatedDetail);
        assertEquals(updatedDetail, stock.findDetail(356655666));  // Проверяем обновление детали
    }

    @Test
    void testRemoveDetail() {
        stock.addDetail(det[3]);
        assertTrue(stock.removeDetail(det[3]));  // Проверяем удаление
        assertNull(stock.findDetail(455600000)); // Проверяем, что детали больше нет
    }

    @Test
    void testTotalWeight() {
        stock.addDetail(det[0]);
        stock.addDetail(det[1]);
        assertEquals(7.0, stock.totalWeight());  // Проверяем общий вес деталей
    }

    @Test
    void testMiddleWeight() {
        stock.addDetail(det[0]);
        stock.addDetail(det[1]);
        assertEquals(3.5, stock.middleWeight());  // Проверяем средний вес деталей
    }

    @Test
    void testFindTotalWeightOfDetails() {
        stock.addDetail(det[0]);
        stock.addDetail(det[1]);
        Detail[] foundDetails = stock.findTotalWeightOfDetails(5.0);
        assertEquals(1, foundDetails.length); // Проверяем детали с весом >= 5.0
    }

}
