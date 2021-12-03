package com.gittigidiyor.homework.test;

import com.gittigidiyor.homework.base.BaseTest;
import com.gittigidiyor.homework.page.HomePage;
import org.junit.Test;

public class AllCallMethods extends BaseTest {

    @Test
    public void main() throws InterruptedException {
        HomePage home =new HomePage();

                 home.login()
                .buttonClick()
                .loginPerforms()
                .clickButton()
                .rastgeleUrunSecimi()
                .scroolDown()
                .geriDön()
                .clickProduct()
                .clickProductSec()
                .sepeteGit()
                            .artırSepeti()
                         .odemeYap()
                                 .adresButonaKaydet()
                         .sepetDuzenle()
                        // .click2ProductEkle()
                         .anasayfayaGeridon()
                         .hesabaTıkla()
                         .favorilereTıkla()
                         .favorilerdenSepeteEkle()
                         .favorilerdenSil()
                         .sekmeAc()
                         .cikisYap();
        Thread.sleep(10000);
    }

}
