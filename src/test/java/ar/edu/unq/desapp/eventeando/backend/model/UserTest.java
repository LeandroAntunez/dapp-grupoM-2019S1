package ar.edu.unq.desapp.eventeando.backend.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import java.time.*;

public class UserTest {

    private String anUserName;
    private String anUserSurname;
    private String anUserEmail;
    private LocalDate anUserBirthday;
    private BigDecimal noMoney;
    private User anUser;
    private BigDecimal tenArgentinePesos;
    private long anUserID;

    @Before
    public void setUp() {
        anUserName = "John";
        anUserSurname = "Anderson";
        anUserEmail = "john.anderson@gmail.com";
        anUserBirthday = LocalDate.of(1985, 5, 12);
        noMoney = new BigDecimal("00.00");
        anUserID = 1L;
        anUser = new User(anUserID, anUserName, anUserSurname, anUserEmail, anUserBirthday, noMoney);
        tenArgentinePesos = new BigDecimal("00.00");
    }

    @Test
    public void createUserWithNameTest() {
        String userName = "Bob";
        User newUser = new User(anUserID, userName, anUserSurname, anUserEmail, anUserBirthday, noMoney);
        Assert.assertEquals(newUser.getName(), userName);
    }

    @Test
    public void userCreatedHaveSurnameTest() {
        String userSurname = "Smith";
        User newUser = new User(anUserID, anUserName, userSurname, anUserEmail, anUserBirthday, noMoney);
        Assert.assertEquals(newUser.getSurname(), userSurname);
    }

    @Test
    public void userCreatedHaveEmailTest() {
        String userEmail = "bob.smith@gmail.com";
        User newUser = new User(anUserID, anUserName, anUserSurname, userEmail, anUserBirthday, noMoney);
        Assert.assertEquals(newUser.getEmail(), userEmail);
    }

    @Test
    public void userCreatedHaveBirthdateTest() {
        LocalDate userBirthdate = LocalDate.of(1990, 1, 1);
        User newUser = new User(anUserID, anUserName, anUserSurname, anUserEmail, userBirthdate, noMoney);
        Assert.assertEquals(newUser.getBirthdate(), userBirthdate);
    }

    @Test
    public void userCreatedHaveNotCash() {
        User me = new User(anUserID, anUserName, anUserSurname, anUserEmail, anUserBirthday, noMoney);
        Assert.assertEquals(me.getCurrentBalance(), noMoney);
    }

    @Test
    public void userDepositMoneyWithHisCash() {
        anUser.depositMoneyWithCash(tenArgentinePesos);
        Assert.assertEquals(anUser.getCurrentBalance(), tenArgentinePesos);
    }

    @Test
    public void userDepositMoneyWithACreditCard() {
        anUser.depositMoneyWithCreditCard(tenArgentinePesos);
        Assert.assertEquals(anUser.getCurrentBalance(), tenArgentinePesos);
    }
}