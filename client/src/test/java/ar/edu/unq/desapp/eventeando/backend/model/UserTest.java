package ar.edu.unq.desapp.eventeando.backend.model;

import org.joda.money.Money;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private String anUserName;
    private String anUserSurname;
    private String anUserEmail;
    private DateTime anUserBirthday;
    private Money noMoney;
    private User anUser;
    private Money tenArgentinePesos;

    @Before
    public void setUp() {
        anUserName = "John";
        anUserSurname = "Anderson";
        anUserEmail = "john.anderson@gmail.com";
        anUserBirthday = new DateTime("1985-05-12");
        noMoney = Money.parse("ARS 00.00");
        anUser = new User(anUserName, anUserSurname, anUserEmail, anUserBirthday);
        tenArgentinePesos = Money.parse("ARS 10.00");
    }

    @Test
    public void createUserWithNameTest() {
        String userName = "Bob";
        User newUser = new User(userName, anUserSurname, anUserEmail, anUserBirthday);
        Assert.assertEquals(newUser.getName(), userName);
    }

    @Test
    public void userCreatedHaveSurnameTest() {
        String userSurname = "Smith";
        User newUser = new User(anUserName, userSurname, anUserEmail, anUserBirthday);
        Assert.assertEquals(newUser.getSurname(), userSurname);
    }

    @Test
    public void userCreatedHaveEmailTest() {
        String userEmail = "bob.smith@gmail.com";
        User newUser = new User(anUserName, anUserSurname, userEmail, anUserBirthday);
        Assert.assertEquals(newUser.getEmail(), userEmail);
    }

    @Test
    public void userCreatedHaveBirthdateTest() {
        DateTime userBirthdate = new DateTime(1990 - 1 - 1);
        User newUser = new User(anUserName, anUserSurname, anUserEmail, userBirthdate);
        Assert.assertEquals(newUser.getBirthdate(), userBirthdate);
    }

    @Test
    public void userCreatedHaveNotCash() {
        User me = new User(anUserName, anUserSurname, anUserEmail, anUserBirthday);
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