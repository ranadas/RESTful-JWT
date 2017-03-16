package com.rdas.util;

import com.rdas.ApplicationMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by x148128 on 16/03/2017.
 */
@ContextConfiguration(classes={ApplicationMain.class})
@ActiveProfiles("test")
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class PasswordBCryptEncoderTest {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void encodeString() {
        String string2Encode = "passw0rd";
        String encode = bCryptPasswordEncoder.encode(string2Encode);
        assertThat(encode, not(equalTo(string2Encode)));
    }
}