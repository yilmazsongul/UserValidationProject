import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {

    @BeforeEach
    void setup() {
        System.out.println("Test başlıyor");
    }

    @AfterEach
    void teardown() {
        System.out.println("Test bitti");
    }

    // 👤 NAME TESTS (4)

    @Test
    void TC01_validName() {
        assertTrue(UserValidator.isValidName("Ali"));
    }

    @Test
    void TC02_shortName() {
        assertFalse(UserValidator.isValidName("A"));
    }

    @Test
    void TC03_nullName() {
        assertFalse(UserValidator.isValidName(null));
    }

    @Test
    void TC04_boundaryName() {
        assertTrue(UserValidator.isValidName("Al"));
    }

    // 📧 EMAIL TESTS (3)

    @Test
    void TC05_validEmail() {
        assertTrue(UserValidator.isValidEmail("test@mail.com"));
    }

    @Test
    void TC06_invalidEmail() {
        assertFalse(UserValidator.isValidEmail("testmail.com"));
    }

    @Test
    void TC07_emptyEmail() {
        assertFalse(UserValidator.isValidEmail(""));
    }

    // 🔐 PASSWORD TESTS (4)

    @Test
    void TC08_validPassword() {
        assertTrue(UserValidator.isValidPassword("123456"));
    }

    @Test
    void TC09_shortPassword() {
        assertFalse(UserValidator.isValidPassword("123"));
    }

    @Test
    void TC10_emptyPassword() {
        assertFalse(UserValidator.isValidPassword(""));
    }

    @Test
    void TC11_boundaryPassword() {
        assertTrue(UserValidator.isValidPassword("123456"));
    }

    // 🔁 CONFIRM PASSWORD (2)

    @Test
    void TC12_passwordMatch() {
        assertTrue(UserValidator.passwordsMatch("123456", "123456"));
    }

    @Test
    void TC13_passwordMismatch() {
        assertFalse(UserValidator.passwordsMatch("123456", "654321"));
    }

    // ⚠️ EXTRA CASES (2)

    @Test
    void TC14_nameLongValid() {
        assertTrue(UserValidator.isValidName("Ahmet"));
    }

    @Test
    void TC15_nullPasswordMatch() {
        assertThrows(Exception.class, () -> {
            UserValidator.passwordsMatch(null, "123");
        });
    }
}